package net.zvegincev;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.zvegincev.LB1_availability_step1;
import net.zvegincev.LB1_optimum_step2;
import net.zvegincev.LB1_excellence_step3;

public class LB_1 extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private static int numb = 10;
	
	static double mas[][] = new double[10][2];
	static int x[] = new int[10];
	static int y[] = new int[10];
	static double ava[] = {0.2, 0.6, 0.2, 0.4};
	static double opt[] = {0.3, 0.6, 0.1, 0.4};
	static double exc[] = {0.5, 0.3};
	static double step = 0.05;
	
	public LB_1(){}
	
	public void paint(Graphics g)
	{

		Color Red = new Color(255, 0, 0);
		Color Black = new Color(0, 0, 0);
		Color Green = new Color(0, 255, 0);
		g.setColor(Black);
		
		
		
		for(int i=0; i<numb; i++){
			int k = i + 1;
			g.drawString(Integer.toString(k), x[i]+2, y[i]+5);
			g.drawOval(x[i]-2, y[i]-2, 4, 4);
		}
		
		for(int i=0; i <=numb; i++){
			g.drawString(Integer.toString(i), 7 + (int) Math.round(49*i), 10);
			g.drawString(Integer.toString(i), 0, 15 + (int) Math.round(49*i));
		}
		for(int i=0; i <500; i++){
			g.setColor(Green);
			g.drawLine(10 + (int) Math.round(490*opt[0]), i,10 + (int) Math.round(490*opt[0]),i+7);
			g.drawLine(10 + (int) Math.round(490*opt[1]), i,10 + (int) Math.round(490*opt[1]),i+7);
			g.drawLine(i, 10 + (int) Math.round(490*opt[2]), i+7, 10 + (int) Math.round(490*opt[2]));
			g.drawLine(i, 10 + (int) Math.round(490*opt[3]), i+7, 10 + (int) Math.round(490*opt[3]));
			i +=30;
		}
		g.setColor(Red);
		g.drawRect(10 + (int) Math.round(490*(exc[0]-step)), 10 + (int) Math.round(490*(exc[1]-step)), (int) Math.round(490*step*2), (int) Math.round(490*step*2));
		LB1_availability_step1 step1 = new LB1_availability_step1();
		LB1_optimum_step2 step2 = new LB1_optimum_step2();
		LB1_excellence_step3 step3 = new LB1_excellence_step3();		
		g.setColor(Black);
		for(int i=0; i<numb; i++){
			if(step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3])){
				//g.drawOval(x[i]-1, y[i]-1, 2, 2);
				g.drawOval(x[i], y[i], 0, 0);
			}
			if(step1.availability(mas[i][0], exc[0], step) && step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3])){
				g.drawOval(x[i], y[i], 0, 0);
				g.drawOval(x[i]-2, y[i]-2, 4, 4);
			}
			if(step1.availability(mas[i][1], exc[1], step) && step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3])){
				g.drawOval(x[i], y[i], 0, 0);
				g.drawOval(x[i]-2, y[i]-2, 4, 4);
			}
			if(step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3]) && step3.excellence(mas[i][0], mas[i][1], exc[0], exc[1], step)){
				g.drawOval(x[i]-1, y[i]-1, 2, 2);
				g.drawOval(x[i], y[i], 0, 0);
				g.drawOval(x[i]-2, y[i]-2, 4, 4);
				g.drawOval(x[i]-3, y[i]-3, 6, 6);
			}
		}
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
		for(int i=0; i<numb; i++){
			int k = i + 1;
			int mask = (int)((ava[0] + Math.random() * (ava[1]-ava[0]))*100);
			double mask2 = (double)mask/100;
			int mask3 = (int)((ava[2] + Math.random() * (ava[3]-ava[2]))*100);
			double mask4 = (double)mask3/100;
			mas[i][0] = mask2;
			mas[i][1] = mask4;
			System.out.println("Точка №" + k + ": " + mas[i][0] + " " + mas[i][1]);
			//System.out.println(mask + " " + mask2);
			x[i] = (int) (10 + mas[i][0] * 490);
			y[i] = (int) (10 + mas[i][1] * 490);
		}
		LB1_availability_step1 step1 = new LB1_availability_step1();
		LB1_optimum_step2 step2 = new LB1_optimum_step2();
		LB1_excellence_step3 step3 = new LB1_excellence_step3();		
		for(int i=0; i<numb; i++){
			int k = i + 1;
			if(step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3])){
				System.out.println("Система " + k + " с координатами " + mas[i][0] + ", " + mas[i][1] + " является пригодной");
			}
			if(step1.availability(mas[i][0], exc[0], step) && step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3])){
				System.out.println("Система " + k + " с координатами " + mas[i][0] + ", " + mas[i][1] + " является оптимальной по y1");
			}
			if(step1.availability(mas[i][1], exc[1], step) && step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3])){
				System.out.println("Система " + k + " с координатами " + mas[i][0] + ", " + mas[i][1] + " является оптимальной по y2");
			}
			if(step2.optimum(mas[i][0], mas[i][1], opt[0], opt[1], opt[2], opt[3]) && step3.excellence(mas[i][0], mas[i][1], exc[0], exc[1], step)){
				System.out.println("Система " + k + " с координатами " + mas[i][0] + ", " + mas[i][1] + " является превосхоной");
			}
		}
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createMainFrame(); 
            }
        });
	}
}

