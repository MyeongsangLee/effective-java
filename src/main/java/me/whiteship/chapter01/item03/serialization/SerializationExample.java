package me.whiteship.chapter01.item03.serialization;

import java.io.*;
import java.time.LocalDate;

public class SerializationExample {

    public void serialize(Book book) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("book.obj"))) {
            out.writeObject(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Book deserialize() {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("book.obj"))) {
            return (Book) in.readObject();
        }catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//        Book book = new Book("12345", "이팩티브자바 완벽 공략", "백기선", LocalDate.of(2022, 3, 21));
//        book.setNumberOfSold(200);
//        System.out.println(book);

        SerializationExample example = new SerializationExample();
//        example.serialize(book);
        Book deserializedBook = example.deserialize();
        System.out.println(deserializedBook);

    }

}
