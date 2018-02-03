package au.com.afl.exercise.service.impl;

import au.com.afl.exercise.service.Iterator;

import java.util.List;

public class DefaultIterator implements Iterator{

    private int index;
    private List<Object> collection;

    public DefaultIterator(List<Object> collection){
        this.collection = collection;
        this.index = 0;
    }



    @Override
    public boolean hasNext() {

        if(index < collection.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if(this.hasNext()){
            return collection.get(index++);
        }
        return null;
    }


}
