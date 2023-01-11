package me.whiteship.chapter01.item03.serialization;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class Book implements Serializable {

    private static String strSerializable = "bbbbv";

    private String isbn;
    private String title;
    private String name;
    private LocalDate published;

    private transient int numberOfSold;

    public Book(String isbn, String title, String name, LocalDate published) {
        this.isbn = isbn;
        this.title = title;
        this.name = name;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", published=" + published +
                ", numberOfSold=" + numberOfSold +
                ", strSerializable=" + strSerializable +
                '}';
    }
}
