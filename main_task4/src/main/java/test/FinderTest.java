package main.java.test;

import main.java.dom.DomWriter;
import main.java.edition.*;
import main.java.service.EditionService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FinderTest {
    @Before
    public void setUp() throws IOException, SAXException, ParserConfigurationException {
        DomWriter.writeEditions();
    }
    @Test
    public void listPagesTest() {
      Book book =  new Book("Love", 100, 1900, Genre.DETECTIVE, "Henry", EditionType.BOOK);
        Magazine magazine = new Magazine("Cosmo", 190, 2010, "Fashion", EditionType.MAGAZINE);
        List<Edition> editions = new ArrayList<>();
        editions.add(book);
        editions.add(magazine);
        List<Edition> actual = EditionService.listPages(editions, 0, 0);
        boolean result = false;
        Assert.assertEquals(actual.isEmpty(), result);
}

    @Test
    void listNameTest() {
        Book book =  new Book("Love", 100, 1900, Genre.DETECTIVE, "Henry", EditionType.BOOK);
        Magazine magazine = new Magazine("Cosmo", 190, 2010, "Fashion", EditionType.MAGAZINE);
        List<Edition> edition = new ArrayList<>();
        edition.add(book);
        edition.add(magazine);
        List<Edition> actual = EditionService.listName(edition, "L");
        boolean result = false;
        Assert.assertEquals(actual.isEmpty(), result);
    }
}