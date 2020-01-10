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
        int commonMultiple_3_5 = 3*5;
        int commonMultiple_3_7 = 3*7;
        int commonMultiple_5_7 = 5*7;
        int commonMultiple_3_5_7 = 3*5*7;

        Assert.assertEquals(FIZZ+BUZZ, fizzBuzz(commonMultiple_3_5));
        Assert.assertEquals(FIZZ+WHIZZ, fizzBuzz(commonMultiple_3_7));
        Assert.assertEquals(BUZZ+WHIZZ, fizzBuzz(commonMultiple_5_7));
        Assert.assertEquals(FIZZ+BUZZ+WHIZZ, fizzBuzz(commonMultiple_3_5_7));
    }
}
