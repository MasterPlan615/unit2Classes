import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/** The sun in the sky*/
public class Sun
{
    private String tod;
    
    /** Constructs the sun.
     * @param   to   The user inputed variable for the Time Of Day
     */
    public Sun( String to )
    {
        tod = to;
    }
    /** Draws the sun.
     * @param g2 the graphics content
     */
    public void draw( Graphics2D g2 )
    {   
        if (tod.equals("Day"))
        {
            Ellipse2D.Double sun = new Ellipse2D.Double( 50, 50, 100, 100);
            g2.setColor(Color.YELLOW);
            g2.fill(sun);
            g2.draw(sun);
        }
        else if (tod.equals("Evening"))
        {
            Ellipse2D.Double sun = new Ellipse2D.Double( 650, 50, 100, 100);
            g2.setColor(Color.RED);
            g2.fill(sun);
            g2.draw(sun);
        }
        else if (tod.equals("Night"))
        {
            Ellipse2D.Double sun = new Ellipse2D.Double( 50, 50, 100, 100);
            g2.setColor(Color.GRAY);
            g2.fill(sun);
            g2.draw(sun);
        }
    }
}