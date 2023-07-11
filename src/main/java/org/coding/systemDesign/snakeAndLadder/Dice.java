package org.coding.systemDesign.snakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    int numberOfDice;
    int min = 1;
    int max = 6;

    Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int rollDice() {
        int result = 0;
        int diceUsed = 0;
        while(diceUsed<numberOfDice) {
            result += ThreadLocalRandom.current().nextInt(min, max+1);
            diceUsed++;
        }
        return result;
    }

}
