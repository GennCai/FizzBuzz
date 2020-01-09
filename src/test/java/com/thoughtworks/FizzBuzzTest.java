package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;


public class FizzBuzzTest {

    @Test
    public void basic_fizz_3_buzz_5_whizz_7_test() {
        Assert.assertEquals(FizzBuzz.FIZZ, FizzBuzz.fizzBuzz(3));
        Assert.assertEquals(FizzBuzz.BUZZ, FizzBuzz.fizzBuzz(5));
        Assert.assertEquals(FizzBuzz.WHIZZ, FizzBuzz.fizzBuzz(7));
    }
}
