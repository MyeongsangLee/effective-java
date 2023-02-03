package me.whiteship.chapter01.item08.autoclosable;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        try (AutoClosableIsGood good = new AutoClosableIsGood("")) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
