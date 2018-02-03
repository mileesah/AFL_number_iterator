package au.com.afl.exercise.service.impl.commands;

import au.com.afl.exercise.service.Command;


public class BazCommand  implements Command {

    public BazCommand() {
    }

    @Override
    public void execute() {
        System.out.println("BAR");
    }

}
