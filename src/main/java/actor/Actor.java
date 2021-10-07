package actor;

/**
 * Actor is the basis for all NPCs and creatures in the world.
 * Currently features a robust
 */

import damage.*;
import statistics.DNDStats;
import statistics.Stats;

public class Actor {
    /// CLASS VARIABLES
    protected String name = "";
    protected String appearance = "";

    protected int health = 0;
    protected int maxHealth = 0;

    protected int mana = 0;
    protected int maxMana = 0;

    protected int ac = 0;

    protected boolean unconc = false;
    // dead is distinct from unconscious because you can be at 0 hp but still conscious.
    protected boolean dead = false;

    protected Stats stats;
/// CLASS VARIABLES END

    /**
     * Default actor constructor.
     */
    public Actor(){}

    /**
     * Constructor for a complete actor object with all fields.
     * @param nm
     * Name of an actor.
     * @param app
     * Appearance descriptor of an actor.
     * @param maxHP
     * Max health of an actor.
     * @param maxMP
     * Max mana of an actor.
     * @param inAC
     * AC or to-hit of an actor at base.
     */
    public Actor(String nm, String app, int maxHP, int maxMP, int inAC){
        name = nm;
        appearance = app;
        health = maxHP;
        maxHealth = maxHP;
        mana = maxMP;
        maxMana = maxMP;
        ac = inAC;
    }

    /// GETTERS

    /**
     * Returns the name of the actor
     * @return
     * Returns the name of the actor as a string.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name of an actor.
     * @param newName
     * The new name of the actor.
     */
    public void setName(String newName){
        name = newName;
    }

    /**
     * Getter for appearance.
     * @return
     * Returns physical description of character as a string.
     */
    public String getAppearance() {
        return appearance;
    }

    /**
     * Setter for the appearance of an actor
     * @param nApp
     * New appearance descriptor string.
     */
    protected void setAppearance(String nApp){
        appearance = nApp;
    }
    /**
     * Getter for the current HP of the actor
     * @return
     * Returns the HP of the actor as an integer.
     */
    public int getHP(){
        return health;
    }

    /**
     * Getter for the maxHP of the actor
     * @return
     * Returns maximum HP of an actor as an int.
     */
    public int getMaxHP(){
        return maxHealth;
    }

    /**
     * Returns the current MP of an actor
     * @return
     * Retuerns MP of an actor as an int.
     */
    public int getMP(){
        return mana;
    }

    /**
     * Returns MaxMP as an int.
     * @return
     * Returns MaxMP as an int.
     */
    public int getMaxMP(){
        return maxMana;
    }

    /**
     * Acquires the AC (to hit) of a character
     * @return
     * Returns the AC of a character as an int.
     */
    public int getAC(){
        return ac;
    }
/// GETTERS END

    /// VALUE FUNCTIONS
        // HEALTH FUNCTIONS

    /**
     * Causes the actor to take damage and respond accordingly.
     * @param damage
     * The amount of damage to reduce the character's hp by.
     */
    public void takeDamage(int damage){
        health -= damage;
        if(health <= 0){
            unconc = true;
        }
        if(health <= maxHealth * -1){
            dead = true;
        }
    }

    /**
     * Takes damage from the damage class.
     * @param damage
     * A Damage-type object containing the amount and type of damage.
     */
    public void takeDamage(Damage damage){
        health -= damage.getMagnitude();
        if(health <= 0){
            unconc = true;
        }
        if(health <= maxHealth * -1){
            dead = true;
        }
    }

    /**
     * Heals an actor and responds accordingly.
     * @param healing
     * The amount of healing to provide to a character.
     */
    public void heal(int healing){
        health += healing;
        if(health >= 0){
            unconc = false;
        }
    }
        // MANA FUNCTIONS

    /**
     * Deplete's the character's mana pool by a certain amount.
     * @param deplete
     * The amount of mana to remove from a character.
     */
    public void depleteMana(int deplete){
        mana -= deplete;
    }

    /**
     * Rest and increase all variable statistics to their maxmimum values. Restores consciousness if unconscious.
     */
    public void rest(){
        health = maxHealth;
        mana = maxMana;
        if(health >= 0){
            unconc = false;
        }
    }

}
