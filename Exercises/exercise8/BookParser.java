package Exercises.exercise8;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileReader;

public class BookParser {
    public static void main(String[] args) {
        parseXMLFile("/Users/zhuoweiwei/neu courses/INFO5100-Java/INFO5100_002697068_WeiweiZhuo/Exercises/exercise8/books.xml");
        parseJSONFile("/Users/zhuoweiwei/neu courses/INFO5100-Java/INFO5100_002697068_WeiweiZhuo/Exercises/exercise8/books.json");
    }

    public static void parseXMLFile(String filePath) {
        try {
            File inputFile = new File(filePath);
            //create a DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Parsing XML File: " + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Book");
            System.out.println("--------------------------------------");

            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                System.out.println("Current Element: " + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nNode;
                    System.out.println("Title: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Published Year: " + element.getElementsByTagName("publishedYear").item(0).getTextContent());
                    System.out.println("Number of Pages: " + element.getElementsByTagName("numberOfPages").item(0).getTextContent());
                    System.out.println("Authors: " + element.getElementsByTagName("authors").item(0).getTextContent());
                }
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void parseJSONFile(String filePath) {
        JSONParser parser = new JSONParser();
        try (FileReader file = new FileReader(filePath)){
            Object obj = parser.parse(file);

            if (obj instanceof JSONObject jsonObject) {
                JSONArray array = (JSONArray) jsonObject.get("book");
                System.out.println("Parsing JSON File:");
                System.out.println("--------------------------------------");
                for (Object book : array) {
                    JSONObject bookObject = (JSONObject) book;
                    System.out.println("Title: " + bookObject.get("title"));
                    System.out.println("Published Year: " + bookObject.get("publishedYear"));
                    System.out.println("Number of Pages: " + bookObject.get("numberOfPages"));
                    System.out.println("Authors: ");

                    Object authors = bookObject.get("authors");
                    if (authors instanceof JSONArray authorsArray) {
                        for (Object author : authorsArray) {
                            System.out.println(author + " ");
                        }
                    }else if (authors instanceof String) {
                        System.out.println(authors);
                    }
                    System.out.println();

                }
            }else {
                System.out.println("Unexpected JSON structure");
            }

        }catch(ParseException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
