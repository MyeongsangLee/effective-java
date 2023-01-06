package me.whiteship.chapter01.item03.functionalinterface;

import me.whiteship.chapter01.item03.methodreference.Person;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {

    public static void main(String[] args) {
        Function<Integer, String> intToString = (integer -> integer.toString());

        Function<LocalDate, Person> personFunction = Person::new;
        Supplier<Person> personSupplier = () -> new Person();
        Consumer<Person> personConsumer = System.out::println;
        Predicate<Person> predicate = person -> true;

        Person person = personFunction.apply(LocalDate.of(2013, 7, 28));
        Person person1 = personSupplier.get();

        personConsumer.accept(person);
        personConsumer.accept(person1);

        System.out.println(predicate.test(person));

    }

}
