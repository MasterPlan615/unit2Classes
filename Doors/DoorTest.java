

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class DoorTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class DoorTest
     */
    public DoorTest()
    {
        Door door = new Door("Front","Open");
    }
    
    @Test
    public void testCloseDoor()
    {
        close();
    }
    
    @Test
    public void testGetState()
    {
        getState();
        assertEquals( "closed", getState());
    }
    
    @Test
    public void testGetName()
    {
        getName();
        assertEquals( "Front", getName());
    }
}
