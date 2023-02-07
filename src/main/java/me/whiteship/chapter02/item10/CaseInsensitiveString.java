package me.whiteship.chapter02.item10;

import java.util.ArrayList;
import java.util.Objects;

public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof  CaseInsensitiveString) {
            System.out.println("case");
            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
        }

        if (obj instanceof String) {
            System.out.println("string");
            return s.equalsIgnoreCase((String) obj);
        }
        return false;
    }


//    @Override
//    public boolean equals(Object obj) {
//        return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
//    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("polish");
        CaseInsensitiveString cis2 = new CaseInsensitiveString("polish");
        String polish = "polish";
        System.out.println(cis.equals(polish));
        System.out.println(cis.equals(cis));

        ArrayList<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);

        System.out.println(list.contains(polish));
    }


}
