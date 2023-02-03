package me.whiteship.chapter01.item08.autoclosable;

import java.io.*;

public class AutoClosableIsGood implements Closeable {

    private BufferedReader reader;

    public AutoClosableIsGood(String path) {
        try{
            this.reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(path);
        }
    }

    @Override
    public void close() throws IOException {
        try {
            System.out.println("close");
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
