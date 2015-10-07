import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;


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
        Random color = new Random();
        int newcolor = color.nextInt(9);
        //Remove colors that match with background
        if (newcolor == 1)
        {
            g2.setColor(Color.RED);
        }
        else if (newcolor == 2)
        {
            g2.setColor(Color.ORANGE);
        }
        else if (newcolor == 3)
        {
            g2.setColor(Color.YELLOW);
        }
        else if (newcolor == 4)
        {
            g2.setColor(Color.GREEN);
        }
        else if (newcolor == 5)
        {
            g2.setColor(Color.BLUE);
        }
        else if (newcolor == 6)
        {
            g2.setColor(Color.MAGENTA);
        }
        else if (newcolor == 7)
        {
            g2.setColor(Color.CYAN);
        }
        else if (newcolor == 8)
        {
            g2.setColor(Color.WHITE);
        }     
        Rectangle backbuild = new Rectangle(xLeft, yTop, width, height);
        g2.draw(backbuild);
        g2.fill(backbuild);
        for (int a = 0; a < levels; a += 1)
        {
            for (int b = 0; b < columns; b += 1)
            {
                Rectangle window = new Rectangle(var + 10, var2 + 10, 10, 10);
                Random color2 = new Random();
                int newcolor2 = color2.nextInt(9);
                if (newcolor2 == 1)
                {
                    g2.setColor(Color.RED);
                }
                else if (newcolor2 == 2)
                {
                    g2.setColor(Color.ORANGE);
                }
                else if (newcolor2 == 3)
                {
                    g2.setColor(Color.YELLOW);
                }
                else if (newcolor2 == 4)
                {
                    g2.setColor(Color.GREEN);
                }
                else if (newcolor2 == 5)
                {
                    g2.setColor(Color.BLUE);
                }
                else if (newcolor2 == 6)
                {
                    g2.setColor(Color.MAGENTA);
                }
                else if (newcolor2 == 7)
                {
                    g2.setColor(Color.CYAN);
                }
                else if (newcolor2 == 8)
                {
                    g2.setColor(Color.WHITE);
                }
                g2.draw(window);
                g2.fill(window);
                var += 20;
            }
            var = xLeft;
            var2 += 20;
        }
    }
}