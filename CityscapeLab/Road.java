import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/** The road of the city */
public class Road
{
    private int roadx;
    
    /** Constructs the road.
     * @param   x   The x-coordinate of the top left corner (where the road will be built)
     */
    public Road( int x )
    {
        int roadx = x;
    }
    /** Draws the road.
     * @param g2 the graphics content
     */
    public void draw( Graphics2D g2 )
    {
        
        Rectangle asphalt = new Rectangle( 0, 500, 800, 100);
        g2.setColor(Color.BLACK);
        //Set road to gray if night
        g2.draw(asphalt);
        g2.fill(asphalt);
        for (int a = 0; a <= 7; a += 1)
        {
            Rectangle roadmark = new Rectangle( roadx, 525, 40, 10);
            g2.setColor(Color.YELLOW);
            g2.draw(roadmark);
            g2.fill(roadmark);
            roadx += 100;
        }
    }
}


