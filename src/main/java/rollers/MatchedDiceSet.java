package rollers;

public class MatchedDiceSet extends ModRoll {
    private int numDice = 1;
    DiceRoll baseDiceRoll = new DiceRoll();

    /**
     * Default constructor for a matched dice set.
     */
    public MatchedDiceSet(){ max = 0; }

    /**
     * Constructs a matched dice set with a number of dice.
     * @param max
     * Maximum value of all dice.
     * @param num
     * Number of these dice.
     */
    public MatchedDiceSet(int num, int max){
        this();
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
    public MatchedDiceSet(int num, int max, int inMod){
        this();
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
        return rollSum + modifier;
    }

    @Override
    public String toString(){
        String fin = "";
        fin = numDice + baseDiceRoll.toString().substring(1);
        if(modifier != 0)
            fin += "+" + modifier;
        return fin;
    }

}
