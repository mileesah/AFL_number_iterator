package au.com.afl.exercise.service;

/**
 * An interface for custom iterators
 */
public interface Iterator {

    /**
     * Checks if the colletion has another element after the current element
     * @return true if collection still has another element ahead
     * @return false if cursor is at the end of the collection
     */
    public boolean hasNext();

    /**
     * Gets the current element in the collection
     * @return the current element
     */
    public Object next();


}
