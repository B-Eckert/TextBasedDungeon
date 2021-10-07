package statistics;

public class Stat {
    protected String name = "default";
    protected int number = 10;
    protected int bonus = 0;

    /**
     * Default stat constructor.
     */
    public Stat(){}

    /**
     * Constructs a stat.
     * @param iname
     * Name of the stat.
     * @param inumber
     * Number value of the stat.
     */
    public Stat(String iname, int inumber){
        name = iname;
        number = inumber;
        bonusCalc();
    }

    /**
     * Gets the value of a stat.
     * @return
     * Returns the number of the stat as an int.
     */
    public int getValue(){
        return number;
    }

    /**
     * Sets the value of a stat
     * @param value
     * new value of the statistic.
     */
    public void setValue(int value){
        number = value;
        bonusCalc();
    }

    /**
     * Gets the stat bonus of a stat
     * @return
     * Returns the bonus of the stat as an int.
     */
    public int getBonus(){
        return bonus;
    }
    /**
     * Calculates the bonus of the stat.
     */
    protected void bonusCalc(){
        bonus = (int)(Math.floor((number - 10)/2)); // such that 9 - 10 (-1) / 2 (-.5) = -1
    }

    /**
     * Sets the stat's value to a new value.
     * @param value
     * New value to set the stat to.
     */
    public void setStat(int value){
        number = value;
        bonusCalc();
    }

    public StatGhost getStatGhost(){
        return new StatGhost(number);
    }

    public String toString(){
        return name + ": " + number + "(" + bonus + ")";
    }
}
