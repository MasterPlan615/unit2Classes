import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;


/** The sky with assorted objects */
public class Sky
{
    private String tod;
    
    /** Constructs the sky.
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner(?)
     */
    public Sky( String to )
    {
        tod = to;
    }
    /** Draws the sky.
     * @param g2 the graphics content
     */
    public void draw( Graphics2D g2 )
    {
        int roadx = 30;
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
        Ellipse2D.Double sun = new Ellipse2D.Double( 50, 50, 100, 100);
        if (tod.equals("Day"))
        {
            g2.setColor(Color.YELLOW);
        }
        else if (tod.equals("Evening"))
        {
            g2.setColor(Color.RED);
        }
        else if (tod.equals("Night"))
        {
            g2.setColor(Color.GRAY);
        }
        g2.fill(sun);
        g2.draw(sun);
    }
}