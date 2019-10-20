package main.java.dom;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Dom {

    public static void main() {

        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            Element rootElement =
                    document.createElementNS("C:\\Users\\12345\\IdeaProjects\\main_task4", "EditionCatalog");
            document.appendChild(rootElement);
            addNewEdition(document);

        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        }
        }
    private static void addNewEdition(Document document) throws TransformerFactoryConfigurationError, DOMException {
        // Получаем корневой элемент
        Node root = document.getDocumentElement();
        Element edition = document.createElement("Edition");
        // <Title>
        Element name = document.createElement("Name");
        Element author = document.createElement("Author");
        Element age = document.createElement("Age");
        Element type = document.createElement("Type");
        Element pages = document.createElement("Pages");
        edition.appendChild(name);
        edition.appendChild(author);
        edition.appendChild(age);
        edition.appendChild(type);
        edition.appendChild(pages);
        // Добавляем книгу в корневой элемент
        root.appendChild(edition);

        // Записываем XML в файл
        writeDocument(document);
    }

    // Функция для сохранения DOM в файл
    private static void writeDocument(Document document) throws TransformerFactoryConfigurationError {
        try {
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(document);
            FileOutputStream fos = new FileOutputStream("other.xml");
            StreamResult result = new StreamResult(fos);
            tr.transform(source, result);
        } catch (TransformerException | IOException e) {
            e.printStackTrace(System.out);
        }
    }
}