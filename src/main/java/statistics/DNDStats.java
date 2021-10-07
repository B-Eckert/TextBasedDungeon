package statistics;

public class DNDStats implements Stats {
    public static final String STR = "Strength";
    public static final String CON = "Constitution";
    public static final String DEX = "Dexterity";
    public static final String WIS = "Wisdom";
    public static final String ITL = "Intelligence";
    public static final String CHA = "Charisma";

    public static final String[] STATS = {STR, CON, DEX, WIS, ITL, CHA};

    protected Stat str = new Stat(STR, 10);
    protected Stat con = new Stat(CON, 10);
    protected Stat dex = new Stat(DEX, 10);
    protected Stat wis = new Stat(WIS, 10);
    protected Stat itl = new Stat(ITL, 10);
    protected Stat cha = new Stat(CHA, 10);

    public DNDStats(){}

    /**
     * Sets a line of D8D stats with initial values.
     * @param st
     * Initial strength
     * @param cn
     * Initial constitution
     * @param dx
     * Initial dexterity
     * @param wi
     * Initial wisdom
     * @param it
     * Initial intelligence
     * @param ch
     * Initial charisma.
     */
    public DNDStats(int st, int cn, int dx, int wi, int it, int ch){
        str.setStat(st);
        con.setStat(cn);
        dex.setStat(dx);
        wis.setStat(wi);
        itl.setStat(it);
        cha.setStat(ch);
    }

    /**
     * Sets a line of DND stats based on an array of length 6. Fails otherwise.
     * @param stats
     * A 6-long array that indicates starting stats.
     */
    public DNDStats(int[] stats){
        if(stats.length >= 6){
            str.setStat(stats[0]);
            con.setStat(stats[1]);
            dex.setStat(stats[2]);
            wis.setStat(stats[3]);
            itl.setStat(stats[4]);
            cha.setStat(stats[5]);
        }
    }

    /**
     * Getter for the stats in the DNDStats class.
     * @param stat
     * The string parameter of stats (Expected input of the final class strings.)
     * @return
     * Returns the stat class of the stat.
     */
    public Stat getStat(String stat){
        if(stat.equals(STR))
            return str;
        if(stat.equals(CON))
            return con;
        if(stat.equals(DEX))
            return dex;
        if(stat.equals(WIS))
            return wis;
        if(stat.equals(ITL))
            return itl;
        if(stat.equals(CHA))
            return cha;
        return null;
    }
    public StatGhost getPublicStat(String stat){
        if(stat.equals(STR))
            return str.getStatGhost();
        if(stat.equals(CON))
            return con.getStatGhost();
        if(stat.equals(DEX))
            return dex.getStatGhost();
        if(stat.equals(WIS))
            return wis.getStatGhost();
        if(stat.equals(ITL))
            return itl.getStatGhost();
        if(stat.equals(CHA))
            return cha.getStatGhost();
        return null;
    }

}
