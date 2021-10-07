import actor.DNDCharacter;
import items.*;
import rollers.*;
import statistics.*;
import util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /*DNDStats XalthorStats = new DNDStats(new int[] { 22, 16, 14, 16, 12, 14 } );
        DiceRoll xStrSave = new StatRoll(XalthorStats.getStat(DNDStats.STR), 20, 10);
        Stat xalStr = XalthorStats.getStat(DNDStats.STR);
        System.out.println("Xalthor, make a strength saving throw: " + xStrSave.roll());
        Weapon soulFlayer = new Weapon(new MatchedStatDiceSet(xalStr, 3, 6, 3), "radiant slashing", "Strength");
        System.out.println("And he lifted the soulflayer on high and did: " + soulFlayer.damage().toString());
        DiceRoll test = new DiceRoll(20);
        for(int i = 0; i < 100; i++){
            System.out.print(test.roll() + " | ");
            if((i+1) % 10 == 0)
                System.out.println();
        }*/

        System.out.println(DNDCharacter.SKILLS.length);
    }
}
