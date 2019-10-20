package main.java.edition;

import java.io.Serializable;
import java.util.*;

public abstract class Edition implements Serializable {
    public String name;
    public int pages;
    public int age;
    public EditionType type;
    public static List<Edition> editions = new ArrayList<>();
     static int count = 0;

    public Edition(String name, int pages, int age, EditionType type) {
        this.name = name;
        this.pages = pages;
        this.age = age;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public int getAge() {
        return age;
    }

    public Edition() {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Edition{" +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages, age, type);
    }
}
