package net.zvegincev;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	
	public Main(){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		Random rand = new Random();
		System.out.print("Введите n ");
		n = sc.nextInt();
		
		Object[] massivs = new Object[n];
		int mas[][] = new int[n][n];
		int mas1[][] = new int[n][n];
		int[] rez = new int[n];
		int[] min = new int[n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				mas[i][j] = 10 + rand.nextInt(90);
				System.out.print(mas[i][j] + " ");
				mas1[i][j] = mas[i][j];
			}
			System.out.println(" ");
		}//Генерирование значений
		
		while(true){
			for(int i=0; i<n; i++){
				min[i] = mas1[i][0];
			}
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(mas[i][j]<min[i]){
						min[i]=mas[i][j];
					}
				}
			}//Шаг 1 -- Нахождение минимального в строках (+)
			
			System.out.println(" ");
			
		
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					mas1[i][j] = mas1[i][j] - min[i]; 
					System.out.print(mas1[i][j] + " ");
				}
				System.out.println(" ");
			}//шаг 1 -- вычитание (+)
			
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(mas1[i][j] == 0){
						rez[i]=mas[i][j];
					}
				}
				System.out.print(rez[i] + " ");
			}//шаг 2
			break;
		}
		
		
		
	}
}
