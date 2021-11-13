/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ellipse;

import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class Ellipse extends JFrame {
    public Ellipse() {
        super("Ellipse");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500, 200);
        try {
            this.add(new DrawEllipse());
            this.setVisible(true);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(Ellipse.this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Ellipse();
    }
    
}

class DrawEllipse extends JPanel {
    int x, y;
    Ellipse2D.Double ellipse;
    
    public DrawEllipse() throws  NumberFormatException{
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an x-axis value:", "X-Axis", JOptionPane.QUESTION_MESSAGE));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a y-axis value:", "Y-Axis", JOptionPane.QUESTION_MESSAGE));
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setColor(Color.BLACK);
        ellipse = new Ellipse2D.Double((this.getWidth() / 2), (this.getHeight() / 2), x, y);
        comp2D.draw(ellipse);
   }
    
}
