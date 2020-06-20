
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
   import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
/**
 *
 * @author denis
 */

    


public class G2d extends JFrame {
    
    public G2d()
    {
        setSize(780, 680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void drawMoon(Graphics g) {
        
         Graphics2D g2 = (Graphics2D) g;
          
         int x = 300;
         int y  = 200;
         int h = 300;
         int w = 500;
         int start = 90;
         int arc = 180;
         g2.drawArc(x, y, w, h, start, arc);
         g2.drawArc(250, 200, 600, 300, 90, 180);
          
    }
    void drawFace(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double  head = new Ellipse2D.Double(30,30,100,150);
        g2.draw(head);
        g2.setColor(Color.red);
        Rectangle eye = new Rectangle(55,65,15,15);
        g2.fill(eye);
        eye.translate(40, 0);
        g2.fill(eye);
        
        g2.setColor(Color.BLACK);
        Line2D.Double month = new Line2D.Double(55,135,105,135);
        g2.draw(month);
    }
    

    public void paint(Graphics g) {
        drawMoon(g);
        drawFace(g);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new G2d().setVisible(true);
    }
    
}

