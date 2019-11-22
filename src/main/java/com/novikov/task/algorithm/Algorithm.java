package com.novikov.task.algorithm;


public class Algorithm
{
    private char[][] wordsArray;
    private char[] word;

    public Algorithm(char[][] wordsArray,char[] word)
    {
        this.word = word;
        this.wordsArray = wordsArray;
    }


   public boolean isExist()
   {
       boolean[][] usedField = new boolean[wordsArray.length][wordsArray[0].length];

       for (int i = 0; i < wordsArray.length; i++)
       {
           for (int j = 0; j < wordsArray[0].length; j++)
           {
               if (wordsArray[i][j] == word[0])
               {
                   usedField[i][j] = true;
                   if (findSolution(new Step(i, j), wordsArray, usedField, word, 1))
                   {
                        return true;
                   }
               }
           }
       }
       return false;
    }

    private Boolean findSolution(Step step,char[][] wordsArray,boolean[][] booleansArray,char[]word,int letterIndex)
    {
        Step newStep = new Move(step,wordsArray,booleansArray,word[letterIndex]).doAStep();

        if(newStep == null)
        {
            return false;
        }
        booleansArray[newStep.getI()][newStep.getJ()] = true;
        letterIndex++;
        if(letterIndex == word.length) return true;

        if(findSolution(newStep, wordsArray, booleansArray, word, letterIndex))
            return true;
        else return findSolution(step, wordsArray, booleansArray, word, letterIndex-1);

    }

}
