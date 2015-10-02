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
    private int levels;
    
    /** Constructs a skyscraper with a given top left corner.
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner
     */
    public Skyscraper( int x, int y, int w, int l )
    {
        xLeft = x;
        yTop = y;
        width = w;
        levels = l;
    }
    /** Draws skyscrapers
     * @param g2 the graphics content
     */
    public void draw( Graphics2D g2 )
    {
        int i = 0;
        int var = xLeft;
        int var2 = yTop;
        while (i<levels)
        {
            Rectangle window = new Rectangle(var, var2 += 10, 10, 10);
            Rectangle window2 = new Rectangle(var+=10, var2, 10, 10);
            g2.draw(window);
            g2.draw(window2);
            i++;
        }
        Rectangle backbuild1 = new Rectangle(xLeft, yTop, width/3, width*2/3);
        g2.draw(backbuild1);
        
    }
}