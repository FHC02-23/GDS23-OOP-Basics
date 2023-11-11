package org.campus02.fraction;

public class DemoFractionApp {
    public static void main(String[] args) {

        Fraction f = new Fraction(3, 4);
        f.print();
        System.out.println(f.toDecimal());

        System.out.println("FractionCounter: " + Fraction.s_counter);

        Fraction f2 = new Fraction(5, 7);
        f2.print();
        System.out.println(f2.toDecimal());
        System.out.println("FractionCounter: " + Fraction.s_counter);

        // 15 / 28 = 0,5357
        
        Fraction f3 = f.multiplicate(f2);
        System.out.println(f3.toString());
        System.out.println("f3.toDecimal() = " + f3.toDecimal());
        System.out.println("FractionCounter: " + Fraction.s_counter);

        
        Fraction f4 = f.multiplicate(f2, f3);
        System.out.println("f4 = " + f4);
        System.out.println("f4 = " + f4.toString());
        System.out.println("f4.toDecimal() = " + f4.toDecimal());
        System.out.println("FractionCounter: " + Fraction.s_counter);

        int x = 0;

        Pair<String, Integer> stringIntegerPair = new Pair<String, Integer>("Susi", 17);
        stringIntegerPair.print();

        Pair<String, Fraction> stringFractionPair = new Pair<>("Bruch 1", f);
        stringFractionPair.print();

    }
}
