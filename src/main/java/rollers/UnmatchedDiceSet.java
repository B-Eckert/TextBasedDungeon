package rollers;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import util.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UnmatchedDiceSet extends ModRoll{
    private ArrayList<DiceRoll> subsets = new ArrayList<>();

    /**
     * Default constructor for an unmatched dice set.
     */
    public UnmatchedDiceSet(){max = 0;}

    /**
     * Unmatched dice set constructor based on an array of pairs.
     * @param maxNums
     * An array of integer, integer pairs that contain the max roll and the number of each dice subset.
     */
    public UnmatchedDiceSet(Pair<Integer, Integer>[] maxNums){
        this();
        for(Pair<Integer,Integer> i : maxNums){
            subsets.add(new MatchedDiceSet(i.getA(), i.getB()));
        }
    }

    /**
     * Unmatched dice set constructor based on an array of pairs.
     * @param maxNums
     * An array of integer, integer pairs that contain the max roll and the number of each dice subset.
     * @param mod
     * The modifier to the overall roll.
     */
    public UnmatchedDiceSet(Pair<Integer, Integer>[] maxNums, int mod){
        this(maxNums);
        modifier = mod;
    }
    /**
     * Unmatched dice set constructor based on an iterable object of pairs.
     * @param maxNums
     * An array of integer, integer pairs that contain the max roll and the number of each dice subset.
     */
    public UnmatchedDiceSet(Iterable<Pair<Integer, Integer>> maxNums){
        this();
        for(Pair<Integer,Integer> i : maxNums){
            subsets.add(new MatchedDiceSet(i.getA(), i.getB()));
        }
    }
    /**
     * Unmatched dice set constructor based on an iterable object of pairs.
     * @param maxNums
     * An array of integer, integer pairs that contain the max roll and the number of each dice subset.
     * @param mod
     * The modifier to the overall roll.
     */
    public UnmatchedDiceSet(Iterable<Pair<Integer, Integer>> maxNums, int mod) {
        this(maxNums);
        modifier = mod;
    }

    /**
     * Adds a new dice roll to the unmatched set of dice.
     * @param added
     * The new roll to be added to the set of dice.
     */
    public void addDice(DiceRoll added){
        subsets.add(added);
    }

    /**
     * The dice roll to be removed from the set of dice.
     * @param diceRoll
     * The toString result of the dice roll (i.e. 4d6)
     */
    public boolean remove(String diceRoll){
        for(DiceRoll i : subsets){
            if(i.toString().equals(diceRoll)){
                subsets.remove(i);
                return true;
            }
        }
        return false;
    }

        /**
         * Rolls all of the matched dice sets in the subsets.
         * @return
         * The completed roll.
         */
    @Override
    public int roll() {
        int rollSum = 0;
        for(DiceRoll i : subsets){
            rollSum += i.roll();
        }
        return rollSum + modifier;
    }

    /**
     * Adds together all of the subset rolls and shows them together.
     * @return
     */
    @Override
    public String toString() {
        String fin = "";
        for(DiceRoll i : subsets){
            fin += i.toString() + "+";
        }
        if(!subsets.isEmpty())
            fin += "\b";
        if(modifier != 0)
            fin += "+" + modifier;
        return fin;
    }
}
