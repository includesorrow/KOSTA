/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author KOSTA
 */
public class Ex1_MyCanVasMock extends JFrame{
    private int arcNum = 360;
    private int x = 100, y = 100;
    private int r = 50;
    private Color col = Color.MAGENTA;
    public Ex1_MyCanVasMock() {
        Canvas can = new Canvas() {
            //repaint() => JVM => Update => Paint
            @Override
            public void update(Graphics g){
                paint(g);
                
            }
            @Override
            public void paint(Graphics g) {
                g.setColor(col);
            g.fillOval(x, y, r, r);
            }
            
        };
        add(can);
        can.setBackground(Color.red);
        setBounds(300, 300, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex1_MyCanVasMock();
    }
}
