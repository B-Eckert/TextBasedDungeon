package rollers;

public class ModRoll extends DiceRoll {
    protected int modifier = 0;


    /**
     * Default constructor for a modroll (1d2+0)
     */
    public ModRoll(){super();}

    /**
     * Constructs a modifier'd roll with a default value.
     * @param inMax
     * Max dice roll.
     */
    public ModRoll(int inMax){
        super(inMax);
    }

    /**
     * Constructs a modifier'd roll with a max value and a modifier
     * @param inMax
     * Max value of the dice
     * @param inMod
     * Modifier to the dice roll.
     */
    public ModRoll(int inMax, int inMod){
        super(inMax);
        modifier = inMod;
    }

    /**
     * Modifies the modifier to the roll.
     * @param newMod
     * New modifier to add to the roll.
     */
    public void setModifier(int newMod){
        modifier = newMod;
    }

    /**
     * Creates a new dice roller with the base roll of any given dice set.
     * @return
     * Returns the base roll of any given dice set.
     */
    public DiceRoll getBaseRoll(){
        return new DiceRoll(max);
    }

    /**
     * New roll method; rolls with the modifier added.
     * @return
     * Returns the dice roll with modifier added.
     */
    @Override
    public int roll() {
        return super.roll() + modifier;
    }

    /**
     * Formats the roll into 1dx+n format
     * @return
     * A string indicating he number of dice, die face and modifier to the roll.
     */
    @Override
    public String toString() {
        return super.toString() + "+" + modifier;
    }


}
