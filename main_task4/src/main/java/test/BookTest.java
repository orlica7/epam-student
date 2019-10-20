package main.java.test;

import main.java.dom.DomWriter;
import main.java.edition.Genre;
import main.java.service.EditionService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


class BookTest {
    @BeforeAll
    public static void setUp() throws IOException, SAXException, ParserConfigurationException {
        DomWriter.writeEditions();
    }

    @Test
public void countAllPagesTest(){
        int expected = 300;
        int actual = EditionService.countAllPage(Genre.DETECTIVE);
    Assert.assertEquals(expected, actual);
}
}