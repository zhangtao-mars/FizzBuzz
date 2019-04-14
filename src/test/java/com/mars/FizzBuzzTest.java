package com.mars;

import com.mars.rules.implRequirement1.SimpleFizzBuzzRule;
import com.mars.rules.implRequirement2.ComplexFizzBuzzRule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;
    private SimpleFizzBuzzRule simpleFizzBuzzRule;
    private ComplexFizzBuzzRule complexFizzBuzzRule;

    /**
     * Before unit test, initialization object
     */
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
        simpleFizzBuzzRule = new SimpleFizzBuzzRule();
        complexFizzBuzzRule = new ComplexFizzBuzzRule();
    }

    /**
     * Unit test requirement one
     * A number is Fizz if it is divisible by 3.
     * A number is Buzz if it is divisible by 5.
     * A number is FizzBuzz if it is divisible by 3 or 5.
     */
    @Test
    public void testRequirement1() {
        fizzBuzz.setRule(simpleFizzBuzzRule);
        // Array obtained after rule 1
        String[] fizzBuzzArrays = fizzBuzz.output(1, 100);
        System.out.println("requirement one output: ");
        Arrays.asList(fizzBuzzArrays).stream().forEach(s -> System.out.println(s));
        // Expected array
        String[] expectedArrays = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14",
                "FizzBuzz","16","17","Fizz","19","Buzz","Fizz","22","23","Fizz","Buzz","26","Fizz","28","29","FizzBuzz",
                "31","32","Fizz","34","Buzz","Fizz","37","38","Fizz","Buzz","41","Fizz","43","44","FizzBuzz","46","47",
                "Fizz","49","Buzz","Fizz","52","53","Fizz","Buzz","56","Fizz","58","59","FizzBuzz","61","62","Fizz",
                "64","Buzz","Fizz","67","68","Fizz","Buzz","71","Fizz","73","74","FizzBuzz","76","77","Fizz","79",
                "Buzz","Fizz","82","83","Fizz","Buzz","86","Fizz","88","89","FizzBuzz","91","92","Fizz","94","Buzz",
                "Fizz","97","98","Fizz","Buzz"};
        // Assert two arrays
        Assert.assertArrayEquals(expectedArrays, fizzBuzzArrays);

    }

    /**
     * Unit test requirement two
     * A number is Fizz if it is divisible by 3 or if it has a 3 in it.
     * A number is Buzz if it is divisible by 5 or if it has a 5 in it.
     * A number is FizzBuzz if it satisfy above 2 criterias together
     */
    @Test
    public void testRequirement2() {
        fizzBuzz.setRule(complexFizzBuzzRule);
        // Array obtained after rule 2
        String[] fizzBuzzArrays = fizzBuzz.output(1, 100);
        System.out.println("requirement two output: ");
        Arrays.asList(fizzBuzzArrays).stream().forEach(s -> System.out.println(s));
        // Expected array
        String[] expectedArrays = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","Fizz","14",
                "FizzBuzz","16","17","Fizz","19","Buzz","Fizz","22","Fizz","Fizz","Buzz","26","Fizz","28","29",
                "FizzBuzz","Fizz","Fizz","Fizz","Fizz","FizzBuzz","Fizz","Fizz","Fizz","Fizz","Buzz","41","Fizz",
                "Fizz","44","FizzBuzz","46","47","Fizz","49","Buzz","FizzBuzz","Buzz","FizzBuzz","FizzBuzz","Buzz",
                "Buzz","FizzBuzz","Buzz","Buzz","FizzBuzz","61","62","Fizz","64","Buzz","Fizz","67","68","Fizz","Buzz",
                "71","Fizz","Fizz","74","FizzBuzz","76","77","Fizz","79","Buzz","Fizz","82","Fizz","Fizz","Buzz","86",
                "Fizz","88","89","FizzBuzz","91","92","Fizz","94","Buzz","Fizz","97","98","Fizz","Buzz"};
        // Assert two arrays
        Assert.assertArrayEquals(expectedArrays, fizzBuzzArrays);
    }

    public static void main(String[] args) {
        // 可执行FizzBuzzTest类的所有方法
        org.junit.runner.JUnitCore.runClasses(FizzBuzzTest.class);
    }
}
