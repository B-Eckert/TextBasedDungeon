package statistics;

public class StatGhost {
    private int number = 10;
    private int bonus = 0;
    public StatGhost(int inum){
        number = inum;
        bonus = (int)(Math.floor((number - 10)/2)); // such that 9 - 10 (-1) / 2 (-.5) = -1
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
     * Gets the stat bonus of a stat
     * @return
     * Returns the bonus of the stat as an int.
     */
    public int getBonus(){
        return bonus;
    }
}
