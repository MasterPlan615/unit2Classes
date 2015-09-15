

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    /** Name/description of the door object*/
    private String name;
    
    /** State of the door object*/
    private String state;

    /**
     * Default constructor for objects of class Door
     */
    public Door( String name, String state )
    {
        this.state = state;
        this.name = name;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre     door has a state
     * @post    changes door state to open
     */
    public void open()
    {
        this.state = "open";
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     door has a state
     * @post    changes door state to closed
     */
    public void close()
    {
        this.state = "closed";
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     door has a name   
     * @return  name of the door
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     door has a name
     * @return  state of the door
     */
    public String getState()
    {
        return this.state;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @post    sets name of door
     * @param   newName   new name for door
     */
    public void setName( String newName )
    {
        this.name = newName;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @post    sets state of door
     * @param   newState   new state for door
     */
    public void setState( String newState )
    {
        this.state = newState;
    }

}
