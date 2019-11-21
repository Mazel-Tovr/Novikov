package com.novikov.task;

import com.novikov.task.algorithm.Algorithm;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        char[][] array = {{'A','E','D'},
                          {'D','J','B'},
                          {'A','B','C'}};
        String word ="EJB";
        Algorithm algorithm = new Algorithm(array,word.toCharArray());
        assertTrue(algorithm.isExist());
    }
    @Test
    public void shouldAnswerWithTrue1()
    {
        char[][] array = {{'A','E','D'},
                          {'D','J','B'},
                          {'A','B','C'}};
        String word ="AED";
        Algorithm algorithm = new Algorithm(array,word.toCharArray());
        assertTrue(algorithm.isExist());
    }
    @Test
    public void shouldAnswerWithFalse()
    {
        char[][] array = {{'A','E','D'},
                          {'D','J','B'},
                          {'A','B','C'}};
        String word ="JAC";
        Algorithm algorithm = new Algorithm(array,word.toCharArray());
        assertFalse(algorithm.isExist());
    }
    @Test
    public void shouldAnswerWithTrue2()
    {
        char[][] array = {{'A','E','D'},
                          {'B','J','B'},
                          {'A','B','C'}};
        String word ="ABC";
        Algorithm algorithm = new Algorithm(array,word.toCharArray());
        assertTrue(algorithm.isExist());
    }


}
