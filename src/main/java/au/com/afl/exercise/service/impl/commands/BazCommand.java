package au.com.afl.exercise.service.impl.commands;

import au.com.afl.exercise.service.Command;
import au.com.afl.exercise.service.Operator;
import au.com.afl.exercise.service.impl.operators.NumberDivisibleOperator;


public class BazCommand  implements Command {

    int num;

    public BazCommand(int num) {
        this.num = num;
    }

    @Override
    public void execute() {
            System.out.println("Number : "+this.num +" BAZ");
    }

}
