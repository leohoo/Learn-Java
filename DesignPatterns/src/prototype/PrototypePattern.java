package prototype;

/**
 * Prototype class
 */
abstract class Prototype implements Cloneable {
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }
 
    public abstract void setX(final short X);
 
    public abstract void printX();
 
    public abstract short getX();
}
 
/**
 * Implementation of prototype class
 */
class PrototypeImpl extends Prototype {
    private short x;
 
    /**
     * Constructor
     * @param X
     */
    public PrototypeImpl(final short X) {
        setX(X);
    }
 
    @Override
    public void setX(final short X) {
        x = X;
    }
 
    @Override
    public void printX() {
        System.out.println("Value :" + x);
    }
 
    @Override
    public short getX() {
        return x;
    }
}
 
/**
 * Client code
 */
public class PrototypePattern {
    public static void main(String args[]) throws CloneNotSupportedException {
        Prototype prototype = new PrototypeImpl((short) 1000);
 
        for (byte y = 1; y < 10; y++) {
            Prototype tempotype =  prototype.clone();
 
            // Usage of values in prototype to derive a new value.
            tempotype.setX((short) (tempotype.getX()*y));
            tempotype.printX();
        }
    }
}