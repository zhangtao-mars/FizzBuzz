package com.mars;

import com.mars.rules.implRequirement1.SimpleFizzBuzzRule;
import com.mars.rules.implRequirement2.ComplexFizzBuzzRule;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    /**
     * 单元测试需求一
     * A number is Fizz if it is divisible by 3.
     * A number is Buzz if it is divisible by 5.
     * A number is FizzBuzz if it is divisible by 3 or 5.
     */
    @Test
    public void testRequirement1() {
        FizzBuzz fizzBuzz = new FizzBuzz(new SimpleFizzBuzzRule());
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.output(i));
        }

//        Assert.assertTrue(fizzBuzz.output(24).equals("Fizz"));

    }

    /**
     * 单元测试需求二
     * A number is Fizz if it is divisible by 3 or if it has a 3 in it.
     * A number is Buzz if it is divisible by 5 or if it has a 5 in it.
     * A number is FizzBuzz if it satisfy above 2 criterias together
     */
    @Test
    public void testRequirement2() {
        FizzBuzz fizzBuzz = new FizzBuzz(new ComplexFizzBuzzRule());
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.output(i));
        }
    }
}
