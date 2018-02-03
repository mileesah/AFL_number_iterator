package au.com.afl.exercise.service.impl;


import au.com.afl.exercise.service.Command;
import au.com.afl.exercise.service.CommandBuilder;
import au.com.afl.exercise.service.impl.commands.BarCommand;
import au.com.afl.exercise.service.impl.commands.BazCommand;
import au.com.afl.exercise.service.impl.commands.FooCommand;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DefaultCommandBuilderTest {

    @Test
    public void testPositiveInput(){
        CommandBuilder commandBuilder = new DefaultCommandBuilder();
        int num = 5;
        List<Command> commands = commandBuilder.getCommands(num);
        Assert.assertEquals(1, commands.size());
        Assert.assertEquals(BarCommand.class, commands.get(0).getClass());
    }

    @Test
    public void testPositiveInput15(){
        CommandBuilder commandBuilder = new DefaultCommandBuilder();
        int num = 15;
        List<Command> commands = commandBuilder.getCommands(num);
        Assert.assertEquals(1, commands.size());
        Assert.assertEquals(BazCommand.class, commands.get(0).getClass());
    }

    @Test
    public void testPositiveInput0(){
        CommandBuilder commandBuilder = new DefaultCommandBuilder();
        int num = 0;
        List<Command> commands = commandBuilder.getCommands(num);
        Assert.assertEquals(1, commands.size());
        Assert.assertEquals(BazCommand.class, commands.get(0).getClass());
    }

    @Test
    public void testPositiveInput3(){
        CommandBuilder commandBuilder = new DefaultCommandBuilder();
        int num = 3;
        List<Command> commands = commandBuilder.getCommands(num);
        Assert.assertEquals(1, commands.size());
        Assert.assertEquals(FooCommand.class, commands.get(0).getClass());
    }

}
