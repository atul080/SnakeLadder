package com.snakeladder;

import java.util.*;
public class SnakeLadder {


    static int minValOfDice=1;
    static int maxValOfDice=6;
    static int winPosition=100;
    static int playerOneDiceRollCount=0;
    static int playerTwoDiceRollCount=0;

    public static int diceRoll(int currentPosition,int player)
    {
        System.out.println("**************** Player "+player+" turn.****************");

        if(player==1)
            playerOneDiceRollCount++;
        else
            playerTwoDiceRollCount++;

        //creating object of Random
        Random rm= new Random();

        //rolling a dice to get number between 1 to 6
        int diceValue= rm.nextInt((maxValOfDice - minValOfDice) + minValOfDice)+1;

        //getting option for steps
        int step = rm.nextInt(3);

        if (step == 0) {
              System.out.println("You got no play.");
              return currentPosition;
        } else if (step == 1)
        {
               System.out.println("You got ladder. So moving by " + diceValue + " steps.");

            //checking if new position is exact 100 or more than that.
            int newPosition = currentPosition + diceValue;

            if(newPosition<winPosition)
            {
                currentPosition = newPosition;
                System.out.println("Current:"+currentPosition);
                currentPosition=diceRoll(currentPosition,player);
            }
            else if (newPosition==winPosition)
            {
                currentPosition=newPosition;
                System.out.println("Congratulations!!! Player "+player+" won the game in total "+playerOneDiceRollCount+" plays.");
                System.exit(0);
            }
            else
                System.out.println("Sorry! You need exact "+(winPosition-currentPosition)+" to win.");

            return currentPosition;
        } else {
            System.out.println("Opps!! You got a snake bite. Moving down by " + diceValue + " position.");
            currentPosition = currentPosition - diceValue;
            if (currentPosition < 0)
                currentPosition = 0;
        }

        return currentPosition;
    }





    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("*******Game started with Player 1 current position as 0.*******");

        int PlyOneCurrentPosition=0;
        int PlyTwoCurrentPosition=0;


        //loop for calling method for dice roll
        while(true)
        {

            PlyOneCurrentPosition=SnakeLadderDoublePlayer.diceRoll(PlyOneCurrentPosition,1);
            System.out.println("Player 1 new postion is: " + PlyOneCurrentPosition);
            PlyTwoCurrentPosition=SnakeLadderDoublePlayer.diceRoll(PlyTwoCurrentPosition,2);
            System.out.println("Player 2 new postion is: " + PlyTwoCurrentPosition);
        }


    }

}
