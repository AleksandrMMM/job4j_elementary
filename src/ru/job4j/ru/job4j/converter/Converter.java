package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        System.out.println(value + " рублей это " + rsl + " доллар.");
        return rsl;

    }

    public static void main(String[] args) {
         Converter.rubleToDollar(456);
        int euro = Converter.rubleToEuro(140);

        int in2 = 120;
        int expected2 = 2;
        int out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2. Test result : " + passed2);

        System.out.println("140 rubles are " + euro + " euro.");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}
