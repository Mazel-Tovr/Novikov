package com.novikov.task.algorithm;


public class Algorithm
{
    private char[][] wordsArray;
    private boolean[][] usedLetters;
    private char[] word;

    public Algorithm(char[][] wordsArray,char[] word)
    {
        this.word = word;
        this.wordsArray = wordsArray;
        usedLetters = new boolean[wordsArray.length][wordsArray[0].length];//stolbccbl ,stroki
    }



   public boolean isExist()
    {
        while (true)
        {
            boolean[][] usedField = new boolean[wordsArray.length][wordsArray[0].length];
            Step currentPosition = findLetter();
            if (currentPosition == null)
            {
                return false;
            }
            usedLetters[currentPosition.getI()][currentPosition.getJ()] = true;
            usedField[currentPosition.getI()][currentPosition.getJ()] = true;
            if(findSolution(currentPosition, wordsArray, usedField, word, 1))
            {
             return true;
            }
        }
    }

    private Boolean findSolution(Step step,char[][] wordsArray,boolean[][] booleansArray,char[]word,int letterIndex)
    {
        if(letterIndex >= word.length) return false;
        Step step1 = new Move(step,wordsArray,booleansArray,word[letterIndex]).doAStep();

        if(step1 == null)
        {
            return false;
        }
        booleansArray[step1.getI()][step1.getJ()] = true;
        letterIndex++;
        if(letterIndex == word.length) return true;

        if(findSolution(step1, wordsArray, booleansArray, word, letterIndex)) return true;

        booleansArray[step1.getI()][step1.getJ()] = false;
        return false;
    }

    private Step findLetter()
    {

        for (int i = 0; i < wordsArray.length ; i++)
        {
            for (int j = 0; j < wordsArray[0].length ; j++)
            {
                if(wordsArray[i][j] == (word[0]) && !usedLetters[i][j])
                {
                    return new Step(i,j);
                }
            }
        }
        return null;
    }

}
