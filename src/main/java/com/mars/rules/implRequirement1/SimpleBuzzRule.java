package com.mars.rules.implRequirement1;

import com.mars.rules.Rule;

public class SimpleBuzzRule extends Rule {
    @Override
    protected String execute(int number) {
        return "Buzz";
    }

    @Override
    protected boolean verify(int number) {
        return number % 5 == 0;
    }
}
