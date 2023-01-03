package me.whiteship.chapter01.item03.field;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

    public static final Elvis INSTANCE = new Elvis();
    private static boolean created;

    private Elvis() {
        if (created) {
            throw new UnsupportedOperationException("can't be created by constructor");
        }

        created = true;
    }

    public void levelTheBuilding() {
        System.out.println("Who a baby, I'm outta here");
    }

    public void sing() {
        System.out.println("I'll have a blue~ christmas without you~");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.levelTheBuilding();
    }

    private Object readResolve() {
        return INSTANCE;
    }

}
