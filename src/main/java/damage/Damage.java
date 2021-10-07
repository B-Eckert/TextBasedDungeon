package damage;

public class Damage {
    protected int magnitude = 0;
    protected String type = "";

    /**
     * Default constructor for damage.
     */
    protected Damage(){}
    /**
     * Creates a new instance of damage.
     * @param mag
     * The magnitude of the damage.
     * @param t
     * The type of the damage.
     */
    public Damage(int mag, String t){
        magnitude = mag;
        type = t;
    }

    /**
     * Gets the magnitude of inflicted damage.
     * @return
     * Returns inflicted damage magnitude.
     */
    public int getMagnitude(){
        return magnitude;
    }

    /**
     * Gets the type of damage inflicted.
     * @return
     * Returns inflicted damage type.
     */
    public String getType(){
        return type;
    }

    /**
     * Formats the damage type as a string
     * @return
     * mag type damage as a string.
     */
    public String toString(){
        return magnitude + " " + type + " damage";
    }
}
