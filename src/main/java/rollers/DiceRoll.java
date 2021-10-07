package rollers;

import util.Random;

public class DiceRoll {
     protected int max = 2;

    /**
     * Default constructor for a dice roll (1d2)
     */
    public DiceRoll(){ }

    /**
     * Constructs a dice roll with a max value.
     * @param tMax
     * Max value on the dice.
     */
    public DiceRoll(int tMax){
        max = tMax;
    }

    /**
     * Rolls the dice specified.
     * @return
     * Returns the roll of the dice.
     */
    public int roll(){
        return (int)(Random.random() * max) + 1;
    }

    /**
     * Translates the dice into 1dx format
     * @return
     * Returns a string that indicates the number of dice (1) and face of dice (x)
     */
    public String toString(){
        return 1 + "d" + max;
    }

}
