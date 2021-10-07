package items;

public class Item {

    /// class variables
    protected String name = "Tester's Cube";
    protected String desc = "The testing item. You shouldn't ever see this.";
    protected int value = 0;
    protected int weight = 1;

    /**
     * Instantiates a new Tester's Cube
     */
    public Item(){}

    /**
     * Sets a new item with a name.
     * @param nm
     * Item name.
     */
    public Item(String nm){
        name = nm;
    }


    /**
     * Instantiates a new item.
     * @param nm
     * Item name.
     * @param dsc
     * Item description.
     */
    public Item(String nm, String dsc){
        name = nm;
        desc = dsc;
    }

    /**
     * Instantiates a new item.
     * @param nm
     * Item name.
     * @param val
     * Item value.
     */
    public Item(String nm, int val){
        this(nm);
        value = val;
    }

    /**
     * Instantiates a new item.
     * @param nm
     * Item name.
     * @param idesc
     * Item description.
     * @param val
     * Item value.
     */
    public Item(String nm, String idesc, int val){
        this(nm, val);
        desc = idesc;
    }


    /**
     * Instantiates a new item.
     * @param nm
     * Item name.
     * @param idesc
     * Item description.
     * @param val
     * Item value.
     * @param wg
     * Item weight.
     */
    public Item(String nm, String idesc, int val, int wg){
        this(nm, idesc, val);
        weight = wg;
    }

    /**
     * Instantiates a new item.
     * @param nm
     * Item name.
     * @param val
     * Item value.
     * @param wg
     * Item weight.
     */
    public Item(String nm, int val, int wg){
        this(nm, val);
        weight = wg;
    }
    /// getters

    /**
     * Gets the name of the item.
     * @return
     * Returns the name as a string.
     */
    public String getName(){
        return name;
    }


    /**
     * Sets the name of the item.
     * @param n
     * New name.
     */
    public void setName(String n){
        name = n;
    }

    /**
     * Gets the description of the item.
     * @return
     * Returns the description as a string.
     */
    public String getDesc(){
        return desc;
    }

    /**
     * Sets the description of the item.
     * @param nDesc
     * New description.
     */
    public void setDesc(String nDesc){
        desc = nDesc;
    }

    /**
     * Gets the value of the item.
     * @return
     * Returns the value (at-cost price of sale/purchase) of the item.
     */
    public int getValue(){
        return value;
    }

    /**
     * Sets the value of the item.
     * @param nVal
     * new value of the item.
     */
    public void setValue(int nVal){
        value = nVal;
    }

    /**
     * Gets the weight of an item.
     * @return
     * Returns the weight of an item.
     */
    public int getWeight(){
        return weight;
    }

    public String toString(){
        return name + "(" + value + "," + weight + "lbs.), " + desc;
    }
}
