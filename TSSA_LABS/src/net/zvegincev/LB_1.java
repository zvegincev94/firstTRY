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
	
	private static int numb = 50;
	
	static double mas[][] = new double[50][2];
	static int x[] = new int[50];
	static int y[] = new int[50];
	static double ava[] = {0.3, 0.5, 0.5, 0.9};
	static double opt[] = {0.3, 0.4, 0.4, 0.7};
	static double exc[] = {0.4, 0.6};
	
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
		
		
		
		for(int i=0; i<numb; i++){
			int k = i + 1;
			//System.out.println("Точка №" + k + " " + x[i] + " " + y[i]);
			g.drawString(Integer.toString(k), x[i]+2, y[i]+5);
			g.drawOval(x[i]-2, y[i]-2, 4, 4);
		}
		
		for(int i=0; i <=numb; i++){
			g.drawString(Integer.toString(i), 7 + (int) Math.round(49*i), 10);
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
			//g.drawLine(10 + (int) Math.round(490*exc[0]), i,10 + (int) Math.round(490*exc[0]),i+7);
			//g.drawLine(i, 10 + (int) Math.round(490*exc[1]), i+7, 10 + (int) Math.round(490*exc[1]));
			i +=30;
		}
		g.setColor(Red);
		//g.drawRect(10 + (int) Math.round(490*ava[0]), 10 + (int) Math.round(490*ava[2]), 49, 98);
		//g.drawLine(10 + (int) Math.round(490*exc[0]), 0, 10 + (int) Math.round(490*exc[0]), 500);
		//g.drawLine(0, 10 + (int) Math.round(490*exc[1]), 500, 10 + (int) Math.round(490*exc[1]));
		g.drawOval((int)(exc[0]*490-39), (int)(exc[1]*490-39), 98, 98);
		
		LB1_availability_step1 step1 = new LB1_availability_step1();
		LB1_optimum_step2 step2 = new LB1_optimum_step2();
		LB1_excellence_step3 step3 = new LB1_excellence_step3();
		
		g.setColor(Black);
		for(int i=0; i<numb; i++){
			if(step1.availability(mas[i][0], mas[i][1], ava[0], ava[1], ava[2], ava[3]) && step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3]) && step3.excellence(mas[i][0], mas[i][1], exc[0], exc[1], 0.1)){
				//System.out.println("Точка " + k + " с координатами " + mas[i][0] + ", " + mas[i][1] + " прошла все шаги");
				g.drawOval(x[i]-1, y[i]-1, 2, 2);
				g.drawOval(x[i], y[i], 0, 0);
				g.drawOval(x[i]-2, y[i]-2, 4, 4);
				g.drawOval(x[i]-3, y[i]-3, 6, 6);
				//g.drawString("O", 8 + (int) Math.round(mas[i][0] * 490), 10 + (int) Math.round(mas[i][1] * 490));
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
		Random rand = new Random();
		for(int i=0; i<numb; i++){
			mas[i][0] = rand.nextDouble();
			mas[i][1] = rand.nextDouble();
			x[i] = (int) (10 + mas[i][0] * 490);
			y[i] = (int) (10 + mas[i][1] * 490);
		}
		
		LB1_availability_step1 step1 = new LB1_availability_step1();
		LB1_optimum_step2 step2 = new LB1_optimum_step2();
		LB1_excellence_step3 step3 = new LB1_excellence_step3();
		
		for(int i=0; i<numb; i++){
			int k = i + 1;
			if(step1.availability(mas[i][0], mas[i][1], ava[0], ava[1], ava[2], ava[3]) && step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3]) && step3.excellence(mas[i][0], mas[i][1], exc[0], exc[1], 0.1)){
				System.out.println("Точка " + k + " с координатами " + mas[i][0] + ", " + mas[i][1] + " прошла все шаги");
				//g.drawString("O", 8 + (int) Math.round(mas[i][0] * 490), 10 + (int) Math.round(mas[i][1] * 490));
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
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createMainFrame(); 
            }
        });
	}
}

