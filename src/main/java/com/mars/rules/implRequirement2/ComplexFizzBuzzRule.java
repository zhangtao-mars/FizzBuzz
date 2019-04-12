package com.mars.rules.implRequirement2;

import com.mars.rules.Rule;

public class ComplexFizzBuzzRule extends Rule {
    @Override
    protected String execute(int number) {
        return "FizzBuzz";
    }

    @Override
    protected boolean verify(int number) {
        return (number % 3 == 0 || String.valueOf(number).contains("3"))
                && (number % 5 == 0 || String.valueOf(number).contains("5")) ;
    }
}
