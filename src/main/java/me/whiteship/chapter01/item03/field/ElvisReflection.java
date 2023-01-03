package me.whiteship.chapter01.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflection {

    public static void main(String[] args) {
        try {
            Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();//getConstructor -> only public
            defaultConstructor.setAccessible(true);
            Elvis elvis1 = defaultConstructor.newInstance();
//            Elvis elvis2 = defaultConstructor.newInstance();
//            Elvis.INSTANCE.sing();

        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
