package me.whiteship.chapter02.item10.test;

import com.google.common.base.Objects;
import lombok.EqualsAndHashCode;

public class Customer {

    private int name;
    private int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name == customer.name && number == customer.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, number);
    }
}
