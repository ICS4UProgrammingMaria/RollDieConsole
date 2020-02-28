package com.company;

import java.util.Scanner;

public class Main {

    //global int
    static int userNum = 0;

    public static int rollDice(){

        int dice = (int)(Math.random()*userNum+1);
        return dice;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter a number below");

        Scanner reader = new Scanner(System.in);
        userNum = (int) reader.nextDouble();
        reader.nextLine();

        //this is where the function is called
        rollDice();
        int diceLocal = rollDice();

        //print it out
        System.out.println("The number rolled was");
        System.out.println(diceLocal);
    }
}
