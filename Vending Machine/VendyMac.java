

/**
 * Simulates a VendyMac™ Vending Machine that dispences beverages
 * 
 * @Andrew Souhrada 
 * @9/17/15
 */
public class VendyMac
{
    /** Number of beverages in the machine */
    private int stock;
    
    /** Number of tokens machine has */
    private int payout = 0;

    /**
     * Default constructor for objects of class VendyMac™
     */
    public VendyMac()
    {
        this.stock = 10;
    }

    /**
     * Constructor for objects of class VendyMac™
     */
    public VendyMac(int beverages)
    {
        this.stock = beverages;
    }
    
    /**
     * Fills up VendyMac™ with more beverages
     *
     * @pre      number of beverages is positive
     * @post     number of beverages increases
     * @param    beverages    number of beverages to put in VendyMac™
     */
    public void fillUp(int beverages)
    {
        this.stock += beverages;
    }

    /**
     * VendyMac™ dispenses a beverage and gains token
     *
     * @pre     VendyMac™ has beverages in it
     * @post    VendyMac™ loses a beverage and a gains a token
     */
    public void insertToken()
    {
        this.stock -= 1;
        this.payout += 1;
    }

    /**
     * Returns the amount of beverages in VendyMac™
     *
     * @pre     number of beverages is positive
     * @return  amount of beverages in VendyMac™
     */
    public int getCanCount()
    {
        return this.stock;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     VendyMac™ has tokens in it
     * @return  amount of tokens in VendyMac™
     */
    public int getTokenCount()
    {
        return this.payout;
    }

}
