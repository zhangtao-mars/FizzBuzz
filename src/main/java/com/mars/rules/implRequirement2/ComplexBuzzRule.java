package com.mars.rules.implRequirement2;

import com.mars.rules.Rule;

public class ComplexBuzzRule extends Rule {
    @Override
    protected String execute(int number) {
        return "Buzz";
    }

    @Override
    protected boolean verify(int number) {
        return number % 5 == 0 || String.valueOf(number).contains("5");
    }
}
