package net.zvegincev;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	//static int mas1[][];
	//static int[] rez;
	//static int[] min;
	//static int mas[][] = {{15,10,9},{9,15,10},{10,12,8}};
	//static int n = 3;
	//static ArrayList<Integer> rez;
	
	public Main(){}
	
	/*public void WC(){
		for(int i=0; i<n; i++){
			min[i] = mas1[i][0];
			rez.clear();
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(mas1[i][j]<min[i]){
					min[i]=mas1[i][j];
				}
			}
			System.out.print(min[i] + " ");
			for(int j=0; j<n; j++){
				mas1[i][j] = mas1[i][j] - min[i];
			}
		}//Шаг 1 -- Нахождение минимального в строках (+)
		
		System.out.println("");
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				mas1[i][j] = mas1[i][j] - min[i]; 
			}
		}//шаг 1 -- вычитание (+)
		
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(mas1[i][j] == 0){
					rez.set(i, mas[i][j]);
				}
			}
			
		}//шаг 2
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		Random rand = new Random();
		//System.out.print("Введите n ");
		//n = sc.nextInt();
		//mas = new int [n][n];
		int n = 4;
		int mas[][] = {{1,4,6,3},{9,7,10,9},{4,5,11,7},{8,7,8,5}};
		int[][] mas1 = new int [n][n];
		int[] min = new int [n];
		int[][] rez = new int [n][2];
		//ArrayList rez = new ArrayList();
		//ArrayList<Integer> rez = new ArrayList<Integer>();
		boolean tr = false;
		boolean[] tr1 = new boolean [n];
		for(int i=0; i<n; i++){
			tr1[i] = false; 
		}

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				//mas[i][j] = 10 + rand.nextInt(90);
				mas1[i][j] = mas[i][j];
				System.out.print(mas[i][j] + " ");
			}
			System.out.println(" ");
		}//Генерирование значений
		
		//rez.ensureCapacity(n);
		
		while(tr == false){
			for(int i=0; i<n; i++){
				rez[i][0] = 0; 
				rez[i][1] = 0; 
			}
			for(int i=0; i<n; i++){
				min[i] = mas1[i][0];
			}
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(mas1[i][j]<min[i] && mas1[i][j] != 0){
						min[i]=mas1[i][j];
					}
				}
				//System.out.print(min[i] + " ");
				for(int j=0; j<n; j++){
					mas1[i][j] = mas1[i][j] - min[i];
				}
			}//Шаг 1 -- Нахождение минимального в строках (+)
			
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(mas1[i][j] == 0 && rez[i][1] == 0){
						rez[i][0] = mas[i][j];
						rez[i][1] = j;
					}
				}
			}//шаг 2
			
			tr = true;

			for(int i = 0; i<n;i++){
				for(int j = 0; j<n;i++){
					if(rez[i][0] == 0){
						tr = false;
					}
				}
			}
			if(tr == true){
				System.out.println(" ");
				for(int i= 0; i<n;i++){
					System.out.print(rez[i] + " ");
				}
				break;
			}
		}
		
	}
}

/*for(int i=0; i<n; i++){
for(int j=0; j<n; j++){
	mas1[i][j] = mas1[i][j] - min[i]; 
}
}//шаг 1 -- вычитание (+)
*/

/*for(int i=0; i<n; i++){
rez[i] = 0; 
}*/
//rez = new int [n];