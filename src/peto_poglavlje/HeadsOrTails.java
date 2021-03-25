package peto_poglavlje;

import java.util.Random;

public class HeadsOrTails {
    /*(Simulation: heads or tails) Write a program that simulates flipping a coin one
million times and displays the number of heads and tails.*/
    public static void main(String[] args) {
        Random random = new Random();
        final int milionTimes = 1000000;
        int simulations;
        int count = 0;

        for (int i = 0; i < milionTimes; i++) {
            simulations = random.nextInt(2);
            if (simulations==0){
                count++;
            }
        }
        System.out.println("The number of heads is: " + count);
        System.out.println("The numbers od tails is: " + (milionTimes - count));
    }
}
