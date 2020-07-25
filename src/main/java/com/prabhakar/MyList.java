package com.prabhakar;

import java.util.AbstractList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

class MyList<E> extends AbstractList<E> {
    private static final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static final int INITIAL_CAPACITY = 10;
    private int currentSize = 0;
    private Object data[];
    private int size =0;
    public MyList() {
        data =new Object[INITIAL_CAPACITY];
        size =0;
    }

    public E get(int index) {
        E x =(E) data[index];
        return x;
    }
    public boolean add(E e) {
        data[size]=e;
        size++;

        if(size >= currentSize)
        {
            currentSize = data.length * 2;
            data = Arrays.copyOf(data, currentSize);
        }
        return true;
    }

    public E remove(int index) {
        int j;
        Object x= data[index];
        for(j=index; j< currentSize -1; j++)
        {
            data[j]= data[j+1];
        }
        size--;
        currentSize--;
        return (E)x;
    }

    public void display() {
        String string="";
        for (int i = 0; i < this.size; i++)
            string += data[i] + "\n";
        logger.log(Level.INFO,string+"\n");
    }

    public int size() {
        return size;
    }

}