package com.snakeladder;

import java.util.*;
public class SnakeLadder {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int currentPosition=0;
        int minValOfDice=1;
        int maxValOfDice=6;
        int winPosition=100;
        System.out.println("Game started with current position as 0.");

        //creating object of Random
        Random rm= new Random();


        //looping to get win position
        while(currentPosition<winPosition)
        {
            //rolling a dice to get number between 1 to 6
            int diceValue= rm.nextInt((maxValOfDice - minValOfDice) + minValOfDice)+1;

            //printing the dice value
            System.out.println("Rolling dice.You got: "+diceValue);

            int step = rm.nextInt(3);

            if (step == 0) 
			{
                System.out.println("You got no play.");
            } else if (step == 1) {
                System.out.println("You got ladder. So moving by " + diceValue + " steps.");
                currentPosition = currentPosition + diceValue;
             } else {
                System.out.println("Opps!! You got a snake bite. Moving down by " + diceValue + " position.");
                currentPosition = currentPosition - diceValue;
                if (currentPosition < 0)
                    currentPosition = 0;
             }
        }

        System.out.println("Congratulations!!! You won the game.");
    }

}
