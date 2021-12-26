package com.snakeladder;

import java.util.*;
public class SnakeLadder {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int currentPosition=0;
        System.out.println("Game started with current position as 0.");

        //creating object of Random
        Random rm= new Random();

        //rolling a dice to get number between 1 to 6
        int diceValue=rm.nextInt(6);

        //printing the dice value
        System.out.print("You got: "+diceValue);

    }

}
