package rollers;

import statistics.Stat;

public class MatchedStatDiceSet extends StatRoll {
    private int numDice = 1;
    DiceRoll baseDiceRoll = new DiceRoll();

    /**
     * Default constructor for a matched dice set.
     */
    public MatchedStatDiceSet(Stat basedOn){
        super(basedOn, 0);
    }

    /**
     * Constructs a matched dice set with a number of dice.
     * @param max
     * Maximum value of all dice.
     * @param num
     * Number of these dice.
     */
    public MatchedStatDiceSet(Stat basedOn, int num, int max){
        this(basedOn);
        baseDiceRoll = new DiceRoll(max);
        numDice = num;
    }

    /**
     * Constructs a matched dice set with a number of dice and a modifier.
     * @param max
     * maximum roll on each dice
     * @param inMod
     * modifier to the rolls
     * @param num
     * Number of dice
     */
    public MatchedStatDiceSet(Stat basedOn, int num, int max, int inMod){
        this(basedOn);
        baseDiceRoll = new DiceRoll(max);
        numDice = num;
        modifier = inMod;
    }

    @Override
    public int roll(){
        int rollSum = 0;
        for(int i = 0; i < numDice; i++){
            rollSum += baseDiceRoll.roll();
        }
        return rollSum + modifier + basedOn.getBonus();
    }

    @Override
    public String toString(){
        String fin = "";
        fin = numDice + baseDiceRoll.toString().substring(1);
        if(basedOn.getBonus() != 0)
            fin += "+" + basedOn.getBonus();
        if(modifier != 0)
            fin += "+" + modifier;
        return fin;
    }

}
