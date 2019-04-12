package com.mars.rules.implRequirement2;

import com.mars.rules.Rule;

public class ComplexNoneRule extends Rule {

    @Override
    protected String execute(int number) {
        return String.valueOf(number);
    }

    @Override
    protected boolean verify(int number) {
        return true;
    }
}
