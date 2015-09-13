package net.zvegincev;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.zvegincev.*;

import java.util.Random;
import java.util.Scanner;

public class LB_1 extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public LB_1(){}
	
	public void paint(Graphics g)
	{
		Color oldColor = g.getColor();
		Color Blue = new Color(0, 0, 255);
		Color Red = new Color(255, 0, 0);
		Color Black = new Color(0, 0, 0);
		Color Green = new Color(0, 255, 0);
		//g.drawString("Y2", 5, 12);//Везде +25 к координатам
		//g.drawString("Y1", 470, 470);//Везде +25 к координатам	
		g.setColor(Black);
		double mas[][] = new double[50][2];

		Random rand = new Random();
		for(int i=0; i<50; i++){
			int k = i + 1;
			for(int j=0; j<2; j++){
				mas[i][j] = rand.nextDouble();
			}
			int x = 10 + (int) Math.round(mas[i][0] * 490);
			int y = 10 + (int) Math.round(mas[i][1] * 490);
			g.drawString("x" + k, x, y);
		}
		double ava[] = new double[4];
		ava[0] = (double) 0.3;
		ava[1] = (double) 0.5;
		ava[2] = (double) 0.5;
		ava[3] = (double) 0.9;
		double opt[] = new double[4];
		opt[0] = (double) 0.3;
		opt[1] = (double) 0.4;
		opt[2] = (double) 0.4;
		opt[3] = (double) 0.7;
		double exc[] = new double[2];
		exc[0] = (double) 0.4;
		exc[1] = (double) 0.6;
		
		for(int i=0; i <=50; i++){
			g.drawString(Integer.toString(i), 7 + (int) Math.round(49*i), 475);
			g.drawString(Integer.toString(i), 0, 15 + (int) Math.round(49*i));
		}
		for(int i=0; i <500; i++){
			g.setColor(Blue);
			g.drawLine(10 + (int) Math.round(490*ava[0]), i, 10 + (int) Math.round(490*ava[0]), i+15);
			g.drawLine(10 + (int) Math.round(490*ava[1]), i, 10 + (int) Math.round(490*ava[1]), i+15);
			g.drawLine(i, 10 + (int) Math.round(490*ava[2]), i+15, 10 + (int) Math.round(490*ava[2]));
			g.drawLine(i, 10 + (int) Math.round(490*(ava[3])), i+15, 10 + (int) Math.round(490*ava[3]));
			g.setColor(Red);
			g.drawLine(10 + (int) Math.round(490*opt[0]), i,10 + (int) Math.round(490*opt[0]),i+15);
			g.drawLine(10 + (int) Math.round(490*opt[1]), i,10 + (int) Math.round(490*opt[1]),i+15);
			g.drawLine(i, 10 + (int) Math.round(490*opt[2]), i+15, 10 + (int) Math.round(490*opt[2]));
			g.drawLine(i, 10 + (int) Math.round(490*opt[3]), i+15, 10 + (int) Math.round(490*opt[3]));
			g.setColor(Green);
			g.drawLine(10 + (int) Math.round(490*exc[0]), i,10 + (int) Math.round(490*exc[0]),i+7);
			g.drawLine(i, 10 + (int) Math.round(490*exc[1]), i+7, 10 + (int) Math.round(490*exc[1]));
			i +=30;
		}
		g.setColor(Red);
		//g.drawRect(10 + (int) Math.round(490*ava[0]), 10 + (int) Math.round(490*ava[2]), 49, 98);
		g.drawLine(10 + (int) Math.round(490*exc[0]), 0, 10 + (int) Math.round(490*exc[0]), 500);
		g.drawLine(0, 10 + (int) Math.round(490*exc[1]), 500, 10 + (int) Math.round(490*exc[1]));
		g.setColor(Black);
		LB1_availability_step1 step1 = new LB1_availability_step1();
		LB1_optimum_step2 step2 = new LB1_optimum_step2();
		LB1_excellence_step3 step3 = new LB1_excellence_step3();
		for(int i=0; i<50; i++){
			int k = i + 1;
			if(step1.availability(mas[i][0], mas[i][1], ava[0], ava[1], ava[2], ava[3]) && step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3]) && step3.excellence(mas[i][0], mas[i][1], exc[0], exc[1])){
				System.out.println("Точка " + k + " с координатами " + mas[i][0] + ", " + mas[i][1] + " прошла все шаги");
				g.drawString("O", 8 + (int) Math.round(mas[i][0] * 490), 10 + (int) Math.round(mas[i][1] * 490));
				/*if(step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3])){
					g.drawString("O", 8 + (int) Math.round(mas[i][0] * 490), 10 + (int) Math.round(mas[i][1] * 490));
					System.out.println("Точка " + k + " с координатами " + mas[i][0] + ", " + mas[i][1] + " прошла 1 и 2 шаг");
					if(step3.excellence(mas[i][0], mas[i][1], exc[0], exc[1])){
						//g.drawString("O", 8 + (int) Math.round(mas[i][0] * 490), 10 + (int) Math.round(mas[i][1] * 490));
						System.out.println("Точка " + k + " с координатами " + mas[i][0] + ", " + mas[i][1] + " прошла 1 и 2, и 3 шаг");
					}
				}*/
			}
		}
		// && step3.excellence(mas[i][0], mas[i][1], exc[0], exc[1])
		// && step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3])
	}
	
	private static void createMainFrame()
	{
		JPanel panel = new LB_1();
        panel.setOpaque(true);
        JFrame mainFrame = new JFrame("Graphica");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        mainFrame.setContentPane(panel);
        mainFrame.setSize(500, 515);
        mainFrame.setVisible(true);
        mainFrame.setBackground(Color.white);
	}

	public static void main(String[] args)
	{
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createMainFrame(); 
            }
        });
	}
}

