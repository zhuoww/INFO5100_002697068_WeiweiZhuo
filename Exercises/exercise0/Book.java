package Exercises.exercise0;

public class Book {
    private String name;
    private String author;
    private int pageCount;
    private String genre;
    private String language;
    private String publisher;
    private int publicationYear;
    private boolean isNew;

    public Book(String name) {
        this.name = name;
        System.out.println("Book: " + name + " is created");
    }

    public void openBook() {
        System.out.println("Book opened.");
    }

    public void closeBook() {
        System.out.println("Book closed.");
    }

    public boolean newBook() {
        System.out.println("The book is new: " + isNew);
        return isNew;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Happy Life");
        Book book2 = new Book("Loneliness");
        Book book3 = new Book("It is Me");
    }


}
