package me.whiteship.chapter01.item03.methodreference;

import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

@ToString
public class Person {
    LocalDate birthday;

    public Person() {
    }

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

//    public static int compareByAge(Person a, Person b) {
//        return a.birthday.compareTo(b.birthday);
//    }
    public int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(2013, 7, 28)));
        people.add(new Person(LocalDate.of(1982, 7, 15)));
        people.add(new Person(LocalDate.of(2011, 3, 2)));
        Person person = new Person();

//        people.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.birthday.compareTo(o2.birthday);
//            }
//        });
//        people.sort((o1, o2) -> o1.birthday.compareTo(o2.birthday));

        //people.sort(Comparator.comparing(o -> o.birthday));
        //people.sort(Person::compareByAge);
        people.sort(person::compareByAge);

        people.stream().forEach(p -> System.out.println(p));
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }
}
