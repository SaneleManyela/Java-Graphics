/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;;
import javax.swing.*;

/**
 *
 * @author EL.2021.T2D0G7
 */
public class CircleFrame extends JFrame{
    public CircleFrame() {
        super("Circle");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new DrawCircle());
        this.setSize(250, 250);
        this.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new CircleFrame();
    }
    
    class DrawCircle extends JPanel {
        int radius = 50;
        public DrawCircle() {
            DrawCircle.this.setPreferredSize(new Dimension(120, 120));
            DrawCircle.this.setBackground(Color.CYAN);
        }
        
        @Override
        public void paintComponent(Graphics comp) {
            Graphics2D comp2D = (Graphics2D) comp;
            comp2D.setPaint(Color.MAGENTA);
            comp2D.fillOval((120 / 2), (120 / 2), radius * 2, radius * 2);
        }
    }
}
