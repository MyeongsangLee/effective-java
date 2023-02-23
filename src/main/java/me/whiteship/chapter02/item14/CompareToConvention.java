package me.whiteship.chapter02.item14;

import java.math.BigDecimal;

public class CompareToConvention {

    public static void main(String[] args) {
        BigDecimal n1 = BigDecimal.valueOf(23134134);
        BigDecimal n2 = BigDecimal.valueOf(11231230);
        BigDecimal n3 = BigDecimal.valueOf(53534552);
        BigDecimal n4 = BigDecimal.valueOf(11231230);

        //반사성
        System.out.println(n1.compareTo(n1));

        //대칭성
        System.out.println(n1.compareTo(n2));
        System.out.println(n2.compareTo(n1));

        //추이성
        System.out.println(n3.compareTo(n1) > 0);
        System.out.println(n1.compareTo(n2) > 0);
        System.out.println(n3.compareTo(n2) > 0);

        //일관성
        System.out.println(n4.compareTo(n2));
        System.out.println(n2.compareTo(n1));
        System.out.println(n4.compareTo(n1));

        BigDecimal oneZero = new BigDecimal("1.0");
        BigDecimal oneZeroZero = new BigDecimal("1.00");
        System.out.println(oneZero.compareTo(oneZeroZero));
        System.out.println(oneZero.equals(oneZeroZero));
    }
}
