package au.com.afl.exercise.service.impl.commands;


import au.com.afl.exercise.service.Command;

public class BarCommand implements Command {

    public BarCommand() {
    }

    @Override
    public void execute() {
        System.out.println("BAR");
    }


}
