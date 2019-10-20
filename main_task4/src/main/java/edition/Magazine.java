package main.java.edition;

import main.java.edition.Edition;
import main.java.edition.EditionType;

import java.util.Objects;

public class Magazine extends Edition {
    private String theme;

    public Magazine(String name, int pages, int age, String theme, EditionType type) {
        super(name, pages, age, type);
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "theme='" + theme + '\'' +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(theme, magazine.theme) &&
                Objects.equals(name, magazine.name) && pages == magazine.pages
                && age == magazine.age && type == magazine.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages, age, type, theme);
    }

}
