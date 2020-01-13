package com.thoughtworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        if(isOnlyContains(i, THREE) || isOnlyContains(i ,THREE, SERVE) || isOnlyContains(i ,THREE, FIVE, SERVE)){
            return FIZZ;
        }

        String result = "";

        if(!(isOnlyContains(i, FIVE) || isOnlyContains(i, FIVE, THREE))){
            if (isDivBy(i, THREE)) result += FIZZ;
        }

        if(!(isOnlyContains(i, SERVE) || isOnlyContains(i, SERVE, FIVE))){
            if (isDivBy(i, FIVE)) result += BUZZ;
        }

        if (isDivBy(i, SERVE)) result += WHIZZ;

        return result.equals("") ?  String.valueOf(i) : result;
    }

    private static boolean isDivBy(int i, int integer ) {
        return i % integer == 0;
    }

    private static boolean isContains(int i, int integer ) {
        return String.valueOf(i).contains(String.valueOf(integer));
    }

    private static boolean isOnlyContains(int i,  int... onlyContains){
        List<Integer> mustContains = new ArrayList<>();
        List<Integer> mustNotContains = new ArrayList<>(Arrays.asList(3, 5, 7));

        for(int code : onlyContains){
            mustContains.add(code);
            mustNotContains.remove((Integer) code);
        }

        for (int code : mustNotContains ){
            if(isContains(i, code)){
                return false;
            }
        }

        for (int code : mustContains ){
            if(!isContains(i, code)){
                return false;
            }
        }

        return true;
    }

}
