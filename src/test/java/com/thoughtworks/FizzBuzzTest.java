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
    public void common_multiple_3_5_7_test() {
        int commonMultiple_3_5 = 3 * 5;
        int commonMultiple_3_7 = 3 * 7;
        int commonMultiple_5_7 = 5 * 7 * 4;
        int commonMultiple_3_5_7 = 3 * 5 * 7 * 2;

        Assert.assertEquals(FIZZ + BUZZ, fizzBuzz(commonMultiple_3_5));
        Assert.assertEquals(FIZZ + WHIZZ, fizzBuzz(commonMultiple_3_7));
        Assert.assertEquals(BUZZ + WHIZZ, fizzBuzz(commonMultiple_5_7));
        Assert.assertEquals(FIZZ + BUZZ + WHIZZ, fizzBuzz(commonMultiple_3_5_7));
    }

    @Test
    public void number_contains_3_test() {
        int[] targets = {3, 13, 23, 30, 33, 43, 53, 63, 630};

        for (int target : targets) {
            Assert.assertEquals(FIZZ, fizzBuzz(target));
        }
    }
}
