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
        String result = "";

        if (isDivBy3(i)) result += FIZZ;

        if (isDivBy5(i)) result += BUZZ;

        if (isDivBy7(i)) result += WHIZZ;

        return result.equals("") ?  String.valueOf(i) : result;
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
