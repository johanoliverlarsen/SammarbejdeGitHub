package DiceMan;

import java.util.Random;

public class Dice {
    private Random rand = new Random();

    public void rollDice() {
        diceRoll = rand.nextInt(6) + 1;
        antalRolls--;
    }
}
