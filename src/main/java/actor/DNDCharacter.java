package actor;

import actor.features.*;
import rollers.UnmatchedDiceSet;
import statistics.DNDStats;
import statistics.StatGhost;
import util.*;

import java.util.ArrayList;

public class DNDCharacter extends Actor {
    public static final String[] SKILLS = {
            "STR_SAVE", "DEX_SAVE","CON_SAVE","WIS_SAVE","ITL_SAVE","CHA_SAVE",
            "Acrobatics", "Animal Handling", "Arcana", "Athletics", "Deception", "History",
            "Insight", "Intimidation", "Investigation", "Medicine", "Nature", "Perception",
            "Performance", "Persuasion", "Religion", "Sleight of Hand", "Stealth", "Survival"};
    public static final String[] BASED_ON = {
            DNDStats.STR, DNDStats.DEX, DNDStats.CON, DNDStats.WIS, DNDStats.ITL, DNDStats.CHA,
            DNDStats.DEX, DNDStats.WIS, DNDStats.ITL, DNDStats.STR, DNDStats.CHA, DNDStats.ITL,
            DNDStats.WIS, DNDStats.CHA, DNDStats.ITL, DNDStats.WIS, DNDStats.ITL, DNDStats.WIS,
            DNDStats.CHA, DNDStats.CHA, DNDStats.ITL, DNDStats.DEX, DNDStats.DEX, DNDStats.WIS
    };

    public ArrayList<Skill> skills = new ArrayList();

    public DNDCharacter(){
        stats = new DNDStats();
        genSkills();
    }

    private void genSkills(){
        for(int i = 0; i < SKILLS.length; i++){
            skills.add(new Skill(SKILLS[i], this.stats.getStat(BASED_ON[i]), profBonus, 0));
        }
    }

    private int level = 0;
    private UnmatchedDiceSet hitDie = new UnmatchedDiceSet();
    private int profBonus = 1;

    // TODO: literally everything else. All thats set up is setting up basic skills.
}
