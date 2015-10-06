import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/** The sky with assorted objects */
public class Sky
{
    
    /** Constructs the sky.
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner(?)
     */
    public Sky()
    {
        // Stuff
    }
    /** Draws the sky.
     * @param g2 the graphics content
     */
    public void draw( Graphics2D g2 )
    {
        int roadx = 30;
        Rectangle asphalt = new Rectangle( 0, 500, 800, 100);
        g2.setColor(Color.BLACK);
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
        Ellipse2D.Double sun = new Ellipse2D.Double( 50, 50, 100, 100);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        g2.draw(sun);
        
    }
}