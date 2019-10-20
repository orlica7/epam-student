package main.java.edition;

import main.java.edition.Edition;

import java.util.Objects;

public class Album extends Edition {
    private String artist;

    public Album(String name, int pages, int age, String artist, EditionType type) {
        super(name, pages, age, type);
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "artist='" + artist + '\'' +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Album album = (Album) o;
        return Objects.equals(artist, album.artist) &&
                Objects.equals(name, album.name) && pages == album.pages
                && age == album.age && type == album.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages, age, artist, type);
    }

}
