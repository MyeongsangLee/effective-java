package me.whiteship.chapter01.item03.test;

import java.util.function.Function;

public class FunctionAndThenComposeExample {

    public static void main(String[] args) {

        Function<Member, Address> functionA = Member::getAddress;
        Function<Address, String> functionB = Address::getCity;
        Function<Member, String> functionAndThen = functionA.andThen(functionB);;
        Function<Member, String> functionCompose = functionB.compose(functionA);;
        String city;

        city = functionAndThen.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
        System.out.println("거주 도시: " + city);


        city = functionCompose.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
        System.out.println("거주 도시: " + city);



    }
}
