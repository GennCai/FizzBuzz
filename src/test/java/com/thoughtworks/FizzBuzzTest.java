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
}
