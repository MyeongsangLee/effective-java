package me.whiteship.chapter01.item02.heirachicalbuilder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

// 코드 2-4 계층적으로 설계된 클래스와 잘 어울리는 빌더 패턴(19쪽)
//
public class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

}
