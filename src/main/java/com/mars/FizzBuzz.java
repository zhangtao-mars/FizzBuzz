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

    /**
     * 构造需求一的规则对象
     * @param simpleFizzBuzzRule
     */
    public FizzBuzz(SimpleFizzBuzzRule simpleFizzBuzzRule) {
        rule = simpleFizzBuzzRule;
        Rule buzz = new SimpleBuzzRule();
        Rule fizz = new SimpleFizzRule();
        Rule none = new SimpleNoneRule();

        rule.setSuccessor(buzz);
        buzz.setSuccessor(fizz);
        fizz.setSuccessor(none);
    }

    /**
     * 构造需求二的规则对象
     * @param complexFizzBuzzRule
     */
    public FizzBuzz(ComplexFizzBuzzRule complexFizzBuzzRule) {
        rule = complexFizzBuzzRule;
        Rule buzz = new ComplexBuzzRule();
        Rule fizz = new ComplexFizzRule();
        Rule none = new ComplexNoneRule();

        rule.setSuccessor(buzz);
        buzz.setSuccessor(fizz);
        fizz.setSuccessor(none);
    }

    public String output(int number) {
        return rule.out(number);
    }
}
