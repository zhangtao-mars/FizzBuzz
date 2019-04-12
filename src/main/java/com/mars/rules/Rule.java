package com.mars.rules;

public abstract class Rule {
    private Rule successor;

    public String out(int number) {
        return verify (number) ? execute(number) : successor.out(number);
    }

    protected abstract String execute(int number);

    protected abstract boolean verify(int number);

    public void setSuccessor(Rule successor) {
        this.successor = successor;
    }
}
