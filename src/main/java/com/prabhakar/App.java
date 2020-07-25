package com.prabhakar;

import java.util.logging.Level;
import java.util.logging.Logger;
public class App
{
    private static final Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        for(int i = 0;i<9;i++)
        {
            list.add(i);
        }
        list.display();
        list.remove(9);
        list.display();
        list.remove(1);
        list.display();
        logger.log(Level.INFO,"Size of List :"+list.size()+"");
    }
}