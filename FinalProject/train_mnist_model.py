# Import necessary libraries and reset TensorFlow graph
import tensorflow as tf
from tensorflow.python.saved_model import builder as saved_model_builder
from tensorflow.examples.tutorials.mnist import input_data

# Reset the default TensorFlow graph
tf.reset_default_graph()

# Load MNIST dataset
mnist = input_data.read_data_sets("MNIST_data/", one_hot=True)

# Define input and output placeholders
x = tf.placeholder(tf.float32, shape=[None, 784], name="x")
y_ = tf.placeholder(tf.float32, shape=[None, 10], name="y_")

# Define functions for weight and bias variables, convolution, and max pooling
def weight_variable(shape):
    initial = tf.truncated_normal(shape, stddev=0.1)
    return tf.Variable(initial)

def bias_variable(shape):
    initial = tf.constant(0.1, shape=shape)
    return tf.Variable(initial)

def conv2d(x, W):
    return tf.nn.conv2d(x, W, strides=[1, 1, 1, 1], padding='SAME')

def max_pool_2x2(x):
    return tf.nn.max_pool(x, ksize=[1, 2, 2, 1], strides=[1, 2, 2, 1], padding='SAME')

# Function to save the trained model
def save_model(session, input_tensor, output_tensor):
    signature = tf.saved_model.signature_def_utils.build_signature_def(
        inputs={'input': tf.saved_model.utils.build_tensor_info(input_tensor)},
        outputs={'output': tf.saved_model.utils.build_tensor_info(output_tensor)},
    )
    builder = saved_model_builder.SavedModelBuilder('./saved_model_v2')
    builder.add_meta_graph_and_variables(session,
                                          [tf.saved_model.tag_constants.SERVING],
                                          signature_def_map={tf.saved_model.signature_constants.DEFAULT_SERVING_SIGNATURE_DEF_KEY: signature})
    builder.save()

# Define the first convolutional layer
W_conv1 = weight_variable([5, 5, 1, 32])
b_conv1 = bias_variable([32])
x_image = tf.reshape(x, [-1, 28, 28, 1])
h_conv1 = tf.nn.relu(conv2d(x_image, W_conv1) + b_conv1)
h_pool1 = max_pool_2x2(h_conv1)

# Define the second convolutional layer
W_conv2 = weight_variable([5, 5, 32, 64])
b_conv2 = bias_variable([64])
h_conv2 = tf.nn.relu(conv2d(h_pool1, W_conv2) + b_conv2)
h_pool2 = max_pool_2x2(h_conv2)

# Define fully connected layers
W_fc1 = weight_variable([7 * 7 * 64, 1024])
b_fc1 = bias_variable([1024])
h_pool2_flat = tf.reshape(h_pool2, [-1, 7*7*64])
h_fc1 = tf.nn.relu(tf.matmul(h_pool2_flat, W_fc1) + b_fc1)

# Dropout layer to prevent overfitting
keep_prob = tf.placeholder(tf.float32, name="keep_prob")
h_fc1_drop = tf.nn.dropout(h_fc1, keep_prob)

# Output layer
W_fc2 = weight_variable([1024, 10])
b_fc2 = bias_variable([10])
y_conv = tf.add(tf.matmul(h_fc1_drop, W_fc2), b_fc2, name="y_conv")

# Define loss, optimizer, accuracy, and training operations
cross_entropy = tf.reduce_mean(
    tf.nn.softmax_cross_entropy_with_logits(labels=y_, logits=y_conv))
train_step = tf.train.AdamOptimizer(1e-4).minimize(cross_entropy)
correct_prediction = tf.equal(tf.argmax(y_conv, 1), tf.argmax(y_, 1))
accuracy = tf.reduce_mean(tf.cast(correct_prediction, tf.float32))

# Uncomment the lines below if you want to save the entire model using TensorFlow Saver
# saver = tf.train.Saver()

# Create a TensorFlow session
with tf.Session() as sess:
    # Initialize variables
    sess.run(tf.global_variables_initializer())
    
    # Train the model
    for epoch in range(10):  # Number of epochs
        for i in range(55000 // 50):  # Batch training over the entire MNIST dataset
            batch = mnist.train.next_batch(50)
            if i % 100 == 0:
                train_accuracy = accuracy.eval(feed_dict={x: batch[0], y_: batch[1], keep_prob: 1.0})
                print('epoch %d, step %d, training accuracy %g' % (epoch, i, train_accuracy))
            train_step.run(feed_dict={x: batch[0], y_: batch[1], keep_prob: 0.5})

    # Save the trained model
    save_model(sess, x, y_conv)
    
    # Evaluate and print test accuracy
    print('test accuracy %g' % accuracy.eval(feed_dict={
        x: mnist.test.images, y_: mnist.test.labels, keep_prob: 1.0}))
