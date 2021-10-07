package items;
import damage.Damage;
import statistics.*;
import rollers.*;
import util.Pair;

public class Weapon extends Item {
    protected String statName;
    protected String damageType;
    protected DiceRoll damage;
    // TODO: Enchantment Functionality
    /**
     * Constructs a weapon using all parameters listed.
     * @param damRl
     * The damage roll used to calculate the damage.
     * @param dmT
     * The damage type as a string.
     * @param stN
     * the stat the weapon uses as a string.
     */
    public Weapon(DiceRoll damRl, String dmT, String stN){
        damage = damRl;
        damageType = dmT;
        statName = stN;
    }

    /**
     * Constructs a weapon using all parameters listed.
     * @param nm
     * Item name.
     * @param damRl
     * The damage roll used to calculate the damage.
     * @param dmT
     * The damage type as a string.
     * @param stN
     * the stat the weapon uses as a string.
     */
    public Weapon(String nm, DiceRoll damRl, String dmT, String stN){
        super(nm);
        damage = damRl;
        damageType = dmT;
        statName = stN;
    }
    /**
     * Constructs a weapon using all parameters listed.
     * @param nm
     * Item name.
     * @param dsc
     * Item description.
     * @param damRl
     * The damage roll used to calculate the damage.
     * @param dmT
     * The damage type as a string.
     * @param stN
     * the stat the weapon uses as a string.

     */
    public Weapon(String nm, String dsc, DiceRoll damRl, String dmT, String stN){
        super(nm, dsc);
        damage = damRl;
        damageType = dmT;
        statName = stN;
    }

    /**
     * Constructs a weapon using all parameters listed.
     * @param nm
     * Item name.
     * @param val
     * Item value.
     * @param damRl
     * The damage roll used to calculate the damage.
     * @param dmT
     * The damage type as a string.
     * @param stN
     * the stat the weapon uses as a string.
     */
    public Weapon(String nm, int val, DiceRoll damRl, String dmT, String stN){
        super(nm, val);
        damage = damRl;
        damageType = dmT;
        statName = stN;
    }

    /**
     * Constructs a weapon using all parameters.
     * @param nm
     * Item name.
     * @param val
     * Item value.
     * @param wg
     * Item weight.
     * @param damRl
     * The damage roll used to calculate the damage.
     * @param dmT
     * The damage type as a string.
     * @param stN
     * the stat the weapon uses as a string.
     */
    public Weapon(String nm, int val, int wg, DiceRoll damRl, String dmT, String stN){
        super(nm, val, wg);
        damage = damRl;
        damageType = dmT;
        statName = stN;
    }

    /**
     * Constructs a weapon using all parameters.
     * @param nm
     * Item name.
     * @param dsc
     * Item description.
     * @param val
     * Item value.
     * @param wg
     * Item weight.
     * @param damRl
     * The damage roll used to calculate the damage.
     * @param dmT
     * The damage type as a string.
     * @param stN
     * the stat the weapon uses as a string.

     */
    public Weapon(String nm, String dsc, int val, int wg, DiceRoll damRl, String dmT, String stN){
        super(nm, dsc, val, wg);
        damage = damRl;
        damageType = dmT;
        statName = stN;
    }

    /**
     * Rolls the damage for the given weapon.
     * @return
     * Returns the damage of the given weapon.
     */
    public Damage damage(){
        return new Damage(damage.roll(), damageType);
    }


}
