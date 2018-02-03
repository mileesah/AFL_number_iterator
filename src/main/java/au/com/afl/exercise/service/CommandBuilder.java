package au.com.afl.exercise.service;


import java.util.List;

/**
 *
 *  An interface for implementing custom command builder if the default builder is to be extended
 */
public interface CommandBuilder {



    /**
     * This method will create the list of commands to execute
     * @param num
     * @return list of command to be executed
     */
    public List<Command> getCommands(int num) ;
}
