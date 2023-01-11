package me.whiteship.chapter01.item03.test;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@AllArgsConstructor
@Getter
public class Member {
    private String name;
    private String id;
    private Address address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(name, member.name) && Objects.equals(id, member.id) && Objects.equals(address, member.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, address);
    }
}
