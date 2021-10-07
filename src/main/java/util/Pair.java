package util;

public class Pair<T, V> {
    T a;
    V b;

    /**
     * Instantiates a new Pair of type t, v
     * @param iA
     * the variable of type t
     * @param iB
     * the variable of type v
     */
    public Pair(T iA, V iB){
        a = iA;
        b = iB;
    }

    /**
     * Gets the 'a' object of the pair (of type t)
     * @return
     * Gets the T-type object of Pair
     */
    public T getA(){
        return a;
    }

    /**
     * Sets the A object.
     * @param nA
     * An object of type T to set A to.
     */
    public void setA(T nA){
        a = nA;
    }

    /**
     * Gets the 'b' object of the pair
     * @return
     * Returns the V-type object of Pair.
     */
    public V getB(){
        return b;
    }

    /**
     * Sets the 'b' object of the pair.
     * @param nB
     * An object of type V to set b to.
     */
    public void setB(V nB){
        b = nB;
    }
}
