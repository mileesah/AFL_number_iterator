package au.com.afl.exercise.service;


/**
 * An interface to implement for custom operations
 */
public interface Operator {

    /**
     * Execute the command
     * @return Object returned by the implementing class
     */
    public Object execute();
}
