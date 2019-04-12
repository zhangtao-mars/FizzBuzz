package com.mars.rules.implRequirement1;

import com.mars.rules.Rule;

public class SimpleFizzBuzzRule extends Rule {
    @Override
    protected String execute(int number) {
        return "FizzBuzz";
    }

    @Override
    protected boolean verify(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}
