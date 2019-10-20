package main.java.service;

import main.java.edition.Book;
import main.java.edition.Edition;
import main.java.edition.EditionType;
import main.java.edition.Genre;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EditionService {
    public static List<Edition> getAllEditions() throws IOException, SAXException, ParserConfigurationException {
        return new ArrayList<>(Edition.editions);
    }

    public static List<Book> getAllEditions(EditionType type) {
        List<Book> listAllEditions = new ArrayList<>();
        for (Edition e : Edition.editions) {
            if (e.type == type) {
                listAllEditions.add((Book) e);
            }
        }
        return listAllEditions;
    }
        public static int countAllPage(Genre genre) {
            int countPage = 0;
            for (Book b : getAllEditions(EditionType.BOOK)) {
                if (b.genre == genre) {
                    countPage += b.pages;
                }
            }
            if(isNull(countPage)){
                return 0;
            }
            return countPage;
        }

        public static List<Edition> find(List<Edition> editions) throws MyInputException {
            System.out.println("Выберите критерий поиска\n" +
                    "1. по названию 2. по количеству страниц");
            Scanner scan = new Scanner(System.in);
            int param = scan.nextInt();
            switch(param){
                case 1: {
                    System.out.println("Введите первую букву названия:");
                    String c = scan.next();
                    if (!c.toLowerCase().matches("[a-z?]")) {
                        throw new MyInputException("Ошибка, введите букву!");
                    }
                    if (isNull(listName(editions, c).size())){
                        return null;
                    }
                    else {
                        return listName(editions, c);
                    }
                }
                case 2: {
                    System.out.println("Введите диапазон значений");
                    int a = scan.nextInt();
                    if (a < 0) {
                        throw new MyInputException("Ошибка, введите число больше нуля!");
                    }
                    int b = scan.nextInt();
                    if (b < a || b < 0) {
                        throw new MyInputException("Ошибка, введите число больше а или больше нуля!");
                    }
                    if (isNull(listPages(editions, a, b).size())){
                        return null;
                    }
                    else {
                        return listPages(editions, a, b);
                    }
                }
                default: {System.out.println("Ошибка, введите значения из меню.");}
            }
            return null;
        }
        public static List<Edition> listPages(List<Edition> editions, int a, int b) {
            List<Edition> edit = new ArrayList<>();
            for (Edition e : editions) {
                if (e.pages > a && e.pages < b) {
                    edit.add(e);
                }
            }
            return edit;
        }

        public static List<Edition> listName(List<Edition> editions, String a) {
            List<Edition> edit = new ArrayList<>();
            for (Edition e : editions) {
                if (e.name.toLowerCase().startsWith(a)) {
                    edit.add(e);
                }
            }
            return edit;
        }
        public static boolean isNull(int a){
        if(a == 0){
            System.out.println("Нет таких изданий");
            return true;
        }
        return false;
        }
    }

