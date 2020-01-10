package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import static com.thoughtworks.FizzBuzz.fizzBuzz;
import static com.thoughtworks.FizzBuzz.FIZZ;
import static com.thoughtworks.FizzBuzz.BUZZ;
import static com.thoughtworks.FizzBuzz.WHIZZ;

public class FizzBuzzTest {

    @Test
    public void basic_3_5_7_test() {
        Assert.assertEquals(FIZZ, fizzBuzz(3));
        Assert.assertEquals(BUZZ, fizzBuzz(5));
        Assert.assertEquals(WHIZZ, fizzBuzz(7));
    }

    @Test
    public void common_multiple_3_5_7_and_not_contains_3_5_7_test() {
        int commonMultiple_3_5 = 3 * 5 * 4; //60
        int commonMultiple_3_7 = 3 * 7; //21
        int commonMultiple_5_7 = 5 * 7 * 4; //140
        int commonMultiple_3_5_7 = 3 * 5 * 7 * 2; //210

        Assert.assertEquals(FIZZ + BUZZ, fizzBuzz(commonMultiple_3_5));
        Assert.assertEquals(FIZZ + WHIZZ, fizzBuzz(commonMultiple_3_7));
        Assert.assertEquals(BUZZ + WHIZZ, fizzBuzz(commonMultiple_5_7));
        Assert.assertEquals(FIZZ + BUZZ + WHIZZ, fizzBuzz(commonMultiple_3_5_7));
    }

    @Test
    public void number_contains_3_and_not_contains_5_7_test() {
        int[] targets = {3, 13, 23, 30, 33, 43, 63, 630};

        for (int target : targets) {
            Assert.assertEquals(FIZZ, fizzBuzz(target));
        }
    }

    @Test
    public void number_contains_5_and_not_contains_7_test() {
        int[] buzzExamples = {15, 45, 135};
        int[] buzzWhizzExamples = {35, 105, 315};
        int[] whizzExamples = {252, 504, 532};
        int[] numberExamples = {51, 53, 54};

        for (int target : buzzExamples) {
            Assert.assertEquals(BUZZ, fizzBuzz(target));
        }

        for (int target : buzzWhizzExamples) {
            Assert.assertEquals(BUZZ+WHIZZ, fizzBuzz(target));
        }

        for (int target : whizzExamples) {
            Assert.assertEquals(WHIZZ, fizzBuzz(target));
        }

        for (int target : numberExamples) {
            Assert.assertEquals(String.valueOf(target), fizzBuzz(target));
        }
    }
}
