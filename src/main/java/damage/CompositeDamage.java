package damage;

import java.util.ArrayList;

public class CompositeDamage extends Damage {
    private int[] damageMags;
    private String[] damageTypes;

    public CompositeDamage(int[] damages, String[] types){
        damageMags = damages;
        damageTypes = types;
        calcMagnitude();
        concatenateTypes();
    }

    public void calcMagnitude(){
        int sum = 0;
        for(int i : damageMags)
            sum += i;
        magnitude = sum;
    }

    public void concatenateTypes(){
        String fin = "";
        for(String i : damageTypes){
            fin += i + ", ";
        }
        if(damageTypes.length != 0)
            fin += "\b\b";
        type = fin;
    }

    public int[] getMagnitudes(){
        return damageMags;
    }
    public String[] getTypes(){
        return damageTypes;
    }
}
