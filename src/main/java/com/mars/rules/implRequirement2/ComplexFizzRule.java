package com.mars.rules.implRequirement2;

import com.mars.rules.Rule;

public class ComplexFizzRule extends Rule {
    @Override
    protected String execute(int number) {
        return "Fizz";
    }

    @Override
    protected boolean verify(int number) {
        return number % 3 == 0 || String.valueOf(number).contains("3");
    }
}
