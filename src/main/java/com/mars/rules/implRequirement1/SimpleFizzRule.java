package com.mars.rules.implRequirement1;

import com.mars.rules.Rule;

public class SimpleFizzRule extends Rule {
    @Override
    protected String execute(int number) {
        return "Fizz";
    }

    @Override
    protected boolean verify(int number) {
        return number % 3 == 0;
    }
}
