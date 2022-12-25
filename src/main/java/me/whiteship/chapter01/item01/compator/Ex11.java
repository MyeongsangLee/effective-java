package me.whiteship.chapter01.item01.compator;

import java.util.Arrays;

public class Ex11 {

    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println(Arrays.toString(strArr));


    }
}
