package main.java.dom;

import main.java.edition.Edition;
import main.java.edition.EditionType;

public class Validator {
    public static boolean isValid(int pages, int age) {
        if (pages < 0 || age < 0) {
           return false;
        }
        return true;
    }
}
