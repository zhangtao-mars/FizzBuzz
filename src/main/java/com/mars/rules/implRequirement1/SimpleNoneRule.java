package com.mars.rules.implRequirement1;

import com.mars.rules.Rule;

public class SimpleNoneRule extends Rule {

    @Override
    protected String execute(int number) {
        return String.valueOf(number);
    }

    @Override
    protected boolean verify(int number) {
        return true;
    }
}
