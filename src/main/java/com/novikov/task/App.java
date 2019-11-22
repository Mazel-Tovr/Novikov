package com.novikov.task;

import com.novikov.task.algorithm.Algorithm;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        char[][] array = {    {'A','E','D'},
//                              {'D','J','B'},
//                              {'A','B','C'}};
//        String word ="EJB";

        char[][] array = {{'A','E','D'},
                          {'B','J','B'},
                          {'A','B','C'}};
        String word ="JBE";
        Algorithm algorithm = new Algorithm(array,word.toCharArray());
        System.out.println( algorithm.isExist());
    }
}
