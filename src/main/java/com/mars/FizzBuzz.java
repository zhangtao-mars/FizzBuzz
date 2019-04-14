package com.mars;

import com.mars.rules.Rule;
import com.mars.rules.implRequirement1.SimpleBuzzRule;
import com.mars.rules.implRequirement1.SimpleFizzBuzzRule;
import com.mars.rules.implRequirement1.SimpleFizzRule;
import com.mars.rules.implRequirement1.SimpleNoneRule;
import com.mars.rules.implRequirement2.ComplexBuzzRule;
import com.mars.rules.implRequirement2.ComplexFizzBuzzRule;
import com.mars.rules.implRequirement2.ComplexFizzRule;
import com.mars.rules.implRequirement2.ComplexNoneRule;

import java.util.Arrays;

public class FizzBuzz {
    private Rule rule;

    private Rule simpleFizzRule;
    private Rule simpleBuzzRule;
    private Rule simpleNoneRule;

    private Rule complexFizzRule;
    private Rule complexBuzzRule;
    private Rule complexNoneRule;

    public FizzBuzz() {
    }

    public String[] output(int start, int end) {
        if (this.rule == null) {
            System.out.println("Need to set the correct Rule to FizzBuzz class");
            return null;
        }

        String[] fizzBuzzArrays = new String[100];
        for (int i = start; i <= end; i++) {
            String result = rule.out(i);
            fizzBuzzArrays[i-1] = result;
        }

        return fizzBuzzArrays;
    }


    public void setRule(Rule rule) {

        if (rule instanceof SimpleFizzBuzzRule) {
            this.rule = rule;
            this.simpleBuzzRule = new SimpleBuzzRule();
            this.simpleFizzRule = new SimpleFizzRule();
            this.simpleNoneRule = new SimpleNoneRule();

            this.rule.setSuccessor(this.simpleBuzzRule);
            this.simpleBuzzRule.setSuccessor(this.simpleFizzRule);
            this.simpleFizzRule.setSuccessor(this.simpleNoneRule);
        }else if (rule instanceof ComplexFizzBuzzRule) {
            this.rule = rule;

            this.complexBuzzRule = new ComplexBuzzRule();
            this.complexFizzRule = new ComplexFizzRule();
            this.complexNoneRule = new ComplexNoneRule();

            this.rule.setSuccessor(this.complexBuzzRule);
            this.complexBuzzRule.setSuccessor(this.complexFizzRule);
            this.complexFizzRule.setSuccessor(this.complexNoneRule);
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        SimpleFizzBuzzRule simpleFizzBuzzRule = new SimpleFizzBuzzRule();
        ComplexFizzBuzzRule complexFizzBuzzRule = new ComplexFizzBuzzRule();

//      requirement one
        fizzBuzz.setRule(simpleFizzBuzzRule);
        System.out.println("requirement one output: ");
        String[] fizzBuzzArrays = fizzBuzz.output(1, 100);
        Arrays.asList(fizzBuzzArrays).stream().forEach(s -> System.out.println(s));

//      requirement two
        fizzBuzz.setRule(complexFizzBuzzRule);
        System.out.println("\nrequirement two output: ");
        String[] fizzBuzzArrays2 = fizzBuzz.output(1, 100);
        Arrays.asList(fizzBuzzArrays2).stream().forEach(s -> System.out.println(s));

    }
}
