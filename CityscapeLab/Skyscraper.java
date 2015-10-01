import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/** A skyscraper that can be positioned anywhere on the screen */
public class Skyscraper
{
    private int xLeft;
    private int yTop;
    private int width;
    
    /** Constructs a skyscraper with a given top left corner.
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner
     */
    public Skyscraper( int x, int y, int w )
    {
        xLeft = x;
        yTop = y;
        width = w;
    }
    /** Draws skyscrapers
     * @param g2 the graphics content
     */
    public void draw( Graphics2D g2 )
    {
        Rectangle backbuild1 = new Rectangle(xLeft, yTop, width/3, width*2/3);
        
        g2.draw(backbuild1);
    }
}