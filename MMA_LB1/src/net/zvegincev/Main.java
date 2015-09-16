package net.zvegincev;

import java.util.Random;
import java.util.Scanner;

public class Main {

	static int mas;
	static int n;
	
	public Main(){}
	
	public char[] firstStep(){
		
		return null;
	}
	
	private int generateInt(int min, int max) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int number = (int)(min + rand.nextDouble()*(max - min));
		return number;
	}
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("¬ведите n");
		//n = sc.nextInt();
		Main main = new Main();
		System.out.print(mas = main.generateInt(2, 4));
			
		// TODO Auto-generated method stub

	}

	

}
