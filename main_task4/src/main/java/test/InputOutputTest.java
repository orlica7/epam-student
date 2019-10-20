package main.java.test;

import main.java.dom.DomWriter;
import main.java.edition.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.CollationElementIterator;
import java.util.*;

import static main.java.service.EditionService.getAllEditions;

class InputOutputTest {
    @BeforeAll
    public static void setUp() throws IOException, SAXException, ParserConfigurationException {
        DomWriter.writeEditions();
    }
    @Test
    public void getAllEditionsTest() throws IOException, SAXException, ParserConfigurationException {
        List<Edition> expected = Edition.editions;
        List<Edition> actual = new ArrayList<>();
        Book book = new Book("Maksim", 300, 3000, Genre.valueOf("DETECTIVE"), "Henry", EditionType.BOOK);
        Magazine magazine = new Magazine("Herald", 300, 1999, "fashion", EditionType.MAGAZINE);
        Album album = new Album("John", 10, 1987, "keurgh", EditionType.ALBUM);
        actual.add(book);
        actual.add(magazine);
        actual.add(album);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void getAllEditions_NO_NULL() throws ParserConfigurationException, SAXException, IOException {
        List<Edition> expected = getAllEditions();
        Assert.assertNotNull(expected);
    }
    @Test
    public void getAllEditions_BOOK() {
        List<Book> expected = getAllEditions(EditionType.BOOK);
        List<Book> actual = new ArrayList<>();
        Book book = new Book("Maksim", 300, 3000, Genre.valueOf("DETECTIVE"), "Henry", EditionType.BOOK);
        actual.add(book);
        Assert.assertEquals(expected.get(0).getGenre(), actual.get(0).getGenre());
    }

}
