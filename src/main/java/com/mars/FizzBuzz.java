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

public class FizzBuzz {
    private Rule rule;

    private Rule simpleFizzRule;
    private Rule simpleBuzzRule;
    private Rule simpleNoneRule;

    private Rule complexFizzRule;
    private Rule complexBuzzRule;
    private Rule complexNoneRule;

    /**
     * 构造需求一的规则对象
     * @param simpleFizzBuzzRule
     */
    /*public FizzBuzz(SimpleFizzBuzzRule simpleFizzBuzzRule) {
        rule = simpleFizzBuzzRule;

        Rule buzz = new SimpleBuzzRule();
        Rule fizz = new SimpleFizzRule();
        Rule none = new SimpleNoneRule();

        rule.setSuccessor(buzz);
        buzz.setSuccessor(fizz);
        fizz.setSuccessor(none);
    }*/

    /**
     * 构造需求二的规则对象
     * @param complexFizzBuzzRule
     */
    /*public FizzBuzz(ComplexFizzBuzzRule complexFizzBuzzRule) {
        rule = complexFizzBuzzRule;
        Rule buzz = new ComplexBuzzRule();
        Rule fizz = new ComplexFizzRule();
        Rule none = new ComplexNoneRule();

        rule.setSuccessor(buzz);
        buzz.setSuccessor(fizz);
        fizz.setSuccessor(none);
    }*/

    public FizzBuzz() {
    }

    public void output(int start, int end) {
        if (this.rule == null) {
            System.out.println("Need to set the correct Rule to FizzBuzz class");
            return;
        }

        for (int i = start; i <= end; i++) {
            System.out.println(rule.out(i));
        }
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

//      需求一的main 方法实现
        fizzBuzz.setRule(simpleFizzBuzzRule);
        System.out.println("需求一的实现");
        fizzBuzz.output(1, 100);

//      需求二的main 方法实现
        fizzBuzz.setRule(complexFizzBuzzRule);
        System.out.println("\n需求二的实现");
        fizzBuzz.output(1, 100);

    }
}
