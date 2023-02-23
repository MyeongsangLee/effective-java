package me.whiteship.chapter02.item13.treeset;


import me.whiteship.chapter02.item13.PhoneNumber;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<PhoneNumber> numbers = new TreeSet<>(new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.hashCode() - o2.hashCode();
            }
        });

        numbers.add(new PhoneNumber(123, 456, 780));  //0780
        numbers.add(new PhoneNumber(123, 456, 7890)); //7890
        numbers.add(new PhoneNumber(123, 456, 789));  //0789

        for (PhoneNumber number : numbers) {
            System.out.println(number);
        }
    }


}
