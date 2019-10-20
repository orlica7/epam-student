package main.java.dom;

import main.java.edition.*;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DomWriter {
    private static ArrayList<Edition> humans = new ArrayList<>();
    private static final String BOOK = "book";
    private static final String MAGAZINE = "magazine";
    private static final String ALBUM = "album";
    private static final String TEXTBOOK = "textbook";

    public static void writeEditions() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("other.xml"));
        collectInformation(document, BOOK);
        collectInformation(document, MAGAZINE);
        collectInformation(document, ALBUM);
        collectInformation(document, TEXTBOOK);
    }

    private static void collectInformation(Document document, final String element) {
        NodeList elements = document.getElementsByTagName(element);
        for (int i = 0; i < elements.getLength(); i++) {
            NamedNodeMap attributes = elements.item(i).getAttributes();
            String name = attributes.getNamedItem("name").getNodeValue();
            switch (element) {
                case BOOK: {
                    int age = Integer.parseInt(attributes.getNamedItem("age").getNodeValue());
                    int pages = Integer.parseInt(attributes.getNamedItem("pages").getNodeValue());
                    String author = attributes.getNamedItem("author").getNodeValue();
                    String genre = attributes.getNamedItem("genre").getNodeValue();
                    if (Validator.isValid(pages, age)) {
                        Book book = new Book(name, pages, age, Genre.valueOf(genre), author, EditionType.BOOK);
                        Edition.editions.add(book);
                    }
                }
                break;
                case MAGAZINE: {
                    String theme = attributes.getNamedItem("theme").getNodeValue();
                    int pages = Integer.parseInt(attributes.getNamedItem("pages").getNodeValue());
                    int age = Integer.parseInt(attributes.getNamedItem("age").getNodeValue());
                    if (Validator.isValid(pages, age)) {
                        Magazine magazine = new Magazine(name, pages, age, theme, EditionType.MAGAZINE);
                        Edition.editions.add(magazine);
                    }
                }
                break;
                case ALBUM: {
                    int age = Integer.parseInt(attributes.getNamedItem("age").getNodeValue());
                    int pages = Integer.parseInt(attributes.getNamedItem("pages").getNodeValue());
                    String artist = attributes.getNamedItem("artist").getNodeValue();
                    if (Validator.isValid(pages, age)) {
                        Album album = new Album(name, pages, age, artist, EditionType.ALBUM);
                        Edition.editions.add(album);
                    }
                }
                break;
                case TEXTBOOK: {
                    int age = Integer.parseInt(attributes.getNamedItem("age").getNodeValue());
                    int pages = Integer.parseInt(attributes.getNamedItem("pages").getNodeValue());
                    String science = attributes.getNamedItem("science").getNodeValue();
                    if (Validator.isValid(pages, age)) {
                        Textbook txtbook = new Textbook(name, pages, age, science, EditionType.TEXTBOOK);
                        Edition.editions.add(txtbook);
                    }
                    break;
                }
            }
        }
    }
}
