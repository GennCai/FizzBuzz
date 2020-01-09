package com.thoughtworks;

public class FizzBuzz {

    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";
    public static String WHIZZ = "Whizz";

    public static void main(String[] args) {
        for (int i = 0; i < 120; i++) {
            String result = fizzBuzz(i + 1);
            System.out.println(result);
        }
    }

    public static String fizzBuzz(int i) {

        if (isDivBy3(i)) return FIZZ;

        if (isDivBy5(i)) return BUZZ;

        if (isDivBy7(i)) return WHIZZ;

        return String.valueOf(i);
    }

    public static boolean isDivBy3(int i) {
        return i % 3 == 0;
    }

    public static boolean isDivBy5(int i) {
        return i % 5 == 0;
    }

    public static boolean isDivBy7(int i) {
        return i % 7 == 0;
    }
}
