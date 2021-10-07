package actor.features;

import rollers.*;
import statistics.Stat;

public class Skill {
    //         DiceRoll xStrSave = new StatRoll(XalthorStats.getStat(DNDStats.STR), 20, 10);

    private String name = "";
    private int proficiencyLevel = 0; // 0 = not proficient, 1 = proficient, 2 = expertise, etc.
    private int profBonus = 1;
    private int flatBonus = 0;
    private Stat depStat = null;
    private DiceRoll skillRoll = new DiceRoll(20);

    public Skill(String inName, Stat inDep, int inProfBonus, int profLevel){
        name = inName;
        profBonus = inProfBonus;
        proficiencyLevel = profLevel;
        depStat = inDep;
        skillRoll = new StatRoll(depStat, 20);
    }

    public void updatePrf(int newPrf){
        profBonus = newPrf;
    }

    public void updateProfLevel(int newPrfLevel){
        proficiencyLevel = newPrfLevel;
    }

    public void giveFlatBonus(int flatBon){
        flatBonus = flatBon;
    }

    public String getName(){
        return name;
    }

    public int getTotalBonus(){
        return depStat.getBonus() + (proficiencyLevel * profBonus) + flatBonus;
    }



    public int rollStat(){
        return skillRoll.roll() + (profBonus * proficiencyLevel);
    }

    public String presentedStat(){
        return name + ": " + this.rollStat();
    }

    public String toStringDetailed() {
        String fin = skillRoll.toString();
        if(proficiencyLevel != 0){
            fin += "+" + (profBonus * proficiencyLevel);
        }
        if(flatBonus != 0){
            fin += "+" + flatBonus;
        }
        return fin;
    }

    public String toString(){
        return name + ": 1d20+" + this.getTotalBonus();
    }
}
