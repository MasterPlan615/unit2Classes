import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;


/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    
    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Skyscraper skyscraper1 = new Skyscraper( 400, 300, 90, 200, 9, 4);
        Skyscraper skyscraper2 = new Skyscraper( 600, 200, 50, 300, 14, 2);
        Skyscraper skyscraper3 = new Skyscraper( 500, 400, 100, 100, 4, 4);
        Skyscraper skyscraper4 = new Skyscraper( 200, 250, 75, 250, 12, 3);
        skyscraper1.draw(g2);
        skyscraper2.draw(g2);
        skyscraper3.draw(g2);
        skyscraper4.draw(g2);
        Sky background = new Sky();
        background.draw(g2);
        // invoke the draw method on each object in your Cityscape
        // ...
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
