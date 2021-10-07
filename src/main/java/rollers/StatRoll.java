package rollers;
import statistics.*;

public class StatRoll extends ModRoll {
    protected Stat basedOn = new Stat();

    /**
     * Generates a new statroll based on the reference to a statistic and a basis for that statistic.
     * @param based
     * Statistic it is based on.
     * @param max
     * Maximum roll.
     */
    public StatRoll(Stat based, int max){
        super(max);
        basedOn = based;
    }
    // ex: STR, 20 = d20 + [STR]
    /**
     * Generates a new statroll based on the reference to a statistic and a basis for that statistic.
     * @param based
     * Statistic it is based on.
     * @param max
     * Maximum roll.
     * @param mod
     * the modifier to the roll aside from the stat.
     */
    public StatRoll(Stat based, int max, int mod){
        super(max, mod);
        basedOn = based;
    }

    /**
     * Rolls a roll based on the stat and modifier
     * @return
     * Returns a stat roll.
     */
    @Override
    public int roll() {
        return super.roll() + basedOn.getBonus();
    }

    /**
     * Formsts the statroll into a visible roll.
     * @return
     * Returns a string with a component of 1dmax + statbonus + modifier.
     */
    @Override
    public String toString(){
        String fin = 1 + "d" + max;
        if(basedOn.getBonus() != 0)
            fin += "+" + basedOn.getBonus();
        if(modifier != 0)
            fin += "+" + modifier;
        return fin;
    }
}
