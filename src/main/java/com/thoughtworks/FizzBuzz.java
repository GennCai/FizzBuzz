package com.thoughtworks;

public class FizzBuzz {

    public final static String FIZZ = "Fizz";
    public final static String BUZZ = "Buzz";
    public final static String WHIZZ = "Whizz";

    public final static int THREE = 3;
    public final static int FIVE = 5;
    public final static int SERVE = 7;

    public static void main(String[] args) {
        for (int i = 0; i < 120; i++) {
            String result = fizzBuzz(i + 1);
            System.out.println(result);
        }
    }

    public static String fizzBuzz(int i) {
        String result = "";

        if(isContains(i, SERVE)){
            if(isContains(i, THREE)){
                return FIZZ;
            }
            if (isDivBy(i, THREE)) result += FIZZ;
            if (isDivBy(i, SERVE)) result += WHIZZ;
            return result.equals("") ?  String.valueOf(i) : result;
        }

        if(!isContains(i, FIVE)){
            if(isContains(i, THREE)){
                return FIZZ;
            }
            if (isDivBy(i, THREE)) result += FIZZ;
        }

        if (isDivBy(i, FIVE)) result += BUZZ;

        if (isDivBy(i, SERVE)) result += WHIZZ;

        return result.equals("") ?  String.valueOf(i) : result;
    }

    private static boolean isDivBy(int i, int integer ) {
        return i % integer == 0;
    }

    private static boolean isContains(int i, int integer ) {
        return String.valueOf(i).contains(String.valueOf(integer));
    }

}
