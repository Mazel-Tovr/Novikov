package com.novikov.task.algorithm;

public class Move
{
    private Step currentPosition;
    private char[][] wordsArray;
    private boolean[][] booleansArray;
    private char nextLetter;

    public Move(Step currentPosition, char[][] wordsArray, boolean[][] booleansArray, char nextLetter)
    {
        this.currentPosition = currentPosition;
        this.wordsArray = wordsArray;
        this.booleansArray = booleansArray;
        this.nextLetter = nextLetter;
    }

    public Step doAStep()
    {

       if(goUp())
       {
           return new Step(currentPosition.getI()-1,currentPosition.getJ());
       }
       if(goDown())
       {
           return new Step(currentPosition.getI()+1,currentPosition.getJ());
       }
       if (goLeft())
       {
           return new Step(currentPosition.getI(),currentPosition.getJ()-1);
       }
       if(goRight())
       {
           return new Step(currentPosition.getI(),currentPosition.getJ()+1);
       }
       return null;
    }

   private boolean goUp()
   {
       return currentPosition.getI() - 1 >= 0 && !booleansArray[currentPosition.getI() - 1][currentPosition.getJ()]
               && wordsArray[currentPosition.getI() - 1][currentPosition.getJ()] == nextLetter;
   }
   private boolean goDown()
   {
       return currentPosition.getI() + 1 < wordsArray.length && !booleansArray[currentPosition.getI() + 1][currentPosition.getJ()]
               && wordsArray[currentPosition.getI() + 1][currentPosition.getJ()] == nextLetter;
   }
   private boolean goLeft()
   {
       return currentPosition.getJ() - 1 >= 0 && !booleansArray[currentPosition.getI()][currentPosition.getJ()-1]
               && wordsArray[currentPosition.getI()][currentPosition.getJ()-1] == nextLetter;
   }
   private boolean goRight()
   {
       return currentPosition.getJ() + 1 < wordsArray[0].length && !booleansArray[currentPosition.getI()][currentPosition.getJ()+1]
               && wordsArray[currentPosition.getI()][currentPosition.getJ()+1] == nextLetter;
   }

}
