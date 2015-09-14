

/**
 * The class Car has a certain fuel efficency and a certain amount of fuel in the gas tank. A car
 * may be driven a specified distance which reduces the amount of gas in the tank.
 * 
 * @author Andrew Souhrada
 * @version 9/10/15
 */
public class Car
{
    /** specifies the fuel efficency of the car in units of miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** specifies the amount of fuel in the gas tank in units of gallons */
    private double fuelInTank;

    /**
     * Constructor for objects of class Car that specifies the fuel efficiency of
     * the car.
     */
    public Car( double fuelEfficiency )
    {
        this.fuelInTank = 0.0;
        this.fuelEfficiency = fuelEfficiency;
    }

    /**
     * Simulates driving a car the specified distance in miles and reduces
     * amount of fuel in the car's tank.
     *
     * @pre        the specified distance cannot consume more than the fuel available
     *             in the tank
     * @param    distance   the specified distance to drive in miles
     */
    public void drive( double distance )
    {
        double gas = this.getGasInTank();
        fuelInTank -= distance / fuelEfficiency;
    }



    /**
     * Returns the number of gallons of gas in the car's tank.
     *
     * @return  the number of gallons of gas in the car's tank
     */
    public double getGasInTank()
    {
        return fuelInTank;
    }



    /**
     * Increments the fuel stored in the car's tank by the specified amount in gallons.
     *
     * @pre     gallonsOfGas must be positive
     * @param   gallonsOfGas   amount in gallosn to increment the fuel in the car's tank
     */
    public void addGas( double gallonsOfGas )
    {
        fuelInTank += gallonsOfGas;
    }
}
