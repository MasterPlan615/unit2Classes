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
    private int columns;
    private int height;
    
    /** Constructs a skyscraper with a given top left corner.
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner
     */
    public Skyscraper( int x, int y, int w, int h, int l, int c)
    {
        xLeft = x;
        yTop = y;
        width = w;
        levels = l;
        columns = c;
        height = h;
    }
    /** Draws skyscrapers
     * @param g2 the graphics content
     */
    public void draw( Graphics2D g2 )
    {
        int var = xLeft;
        int var2 = yTop;
        for (int a = 0; a < levels; a += 1)
        {
            for (int b = 0; b < columns; b += 1)
            {
                Rectangle window = new Rectangle(var + 10, var2 + 10, 10, 10);
                g2.draw(window);
                var += 20;
            }
            var = xLeft;
            var2 += 20;
        }
        Rectangle backbuild1 = new Rectangle(xLeft, yTop, width, height);
        g2.draw(backbuild1);
        
    }
}