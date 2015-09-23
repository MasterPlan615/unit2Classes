import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/** A target that can be positioned anywhere on the screen */
public class Target
{
    private int xLeft;
    private int yTop;
    
    /** Constructs a target with a given top left corner.
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner
     */
    public Target( int x, int y )
    {
        xLeft = x;
        yTop = y;
    }
    /** Draws the target
     * @param g2 the graphics content
     */
    public void draw( Graphics2D g2 )
    {
        Ellipse2D.Double outerRing = new Ellipse2D.Double(xLeft + 100, yTop + 100, 400, 400);
        Ellipse2D.Double middleRing = new Ellipse2D.Double(xLeft + 150, yTop + 150, 300, 300);
        Ellipse2D.Double middleRing2 = new Ellipse2D.Double(xLeft + 200, yTop + 200, 200, 200);
        Ellipse2D.Double innerRing = new Ellipse2D.Double(xLeft + 250, yTop + 250, 100, 100);
        g2.fill(middleRing);
        g2.fill(innerRing);
        g2.draw(outerRing);
        g2.draw(middleRing);
        g2.draw(middleRing2);
        g2.draw(innerRing);
    }
}