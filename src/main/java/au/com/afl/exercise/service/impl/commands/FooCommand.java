package au.com.afl.exercise.service.impl.commands;


import au.com.afl.exercise.service.Command;

public class FooCommand  implements Command{

    public FooCommand() {
    }

    @Override
    public void execute() {
        System.out.println("FOO");
    }
}
