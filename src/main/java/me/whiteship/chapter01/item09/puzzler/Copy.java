package me.whiteship.chapter01.item09.puzzler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    private static final int BUFFER_SIZE = 8 * 1024;

    static void copy(String src, String dst) throws IOException {
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dst);
        try {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(n);
            }
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                //TODO 이렇게 하면 되는 거 아닌가?
            }

            try {
                in.close();
            } catch (IOException e) {
                //TODO 이렇게 하면 되는 거 아닌가?
            }
        }
    }

    public static void main(String[] args) throws IOException {
        copy("in.txt", "out.txt");
    }
}
