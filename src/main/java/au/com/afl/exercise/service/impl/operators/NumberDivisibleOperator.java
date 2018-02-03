package au.com.afl.exercise.service.impl.operators;

import au.com.afl.exercise.service.Operator;


public class NumberDivisibleOperator implements Operator {

    private  int num1;
    private  int num2;

    public NumberDivisibleOperator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Object execute() {
        if(this.num1%this.num2==0) {
            return true;
        }

        return false;

    }
}
