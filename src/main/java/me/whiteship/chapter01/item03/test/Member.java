package me.whiteship.chapter01.item03.test;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Member {
    private String name;
    private String id;
    private Address address;

}
