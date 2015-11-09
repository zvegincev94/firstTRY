package nat.zvegincev;

import java.util.Random;

public class Maaain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int n = 7;
		int[] min = new int [n];
		int[] min1 = new int [n];
		int mas[][] = new int [n][n];
		//int mas[][] = {{1,4,6,3},{9,7,10,9},{4,5,11,7},{8,7,8,5}};
		int[][] mas1 = new int [n][n];
		boolean[][] mask = new boolean [n][n];
		int[] dubl = new int [n];
		int[] dubl1 = new int [n];
		int minim = 99999;
		int[] rez = new int [n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				mas[i][j] = 1 + rand.nextInt(9);
				System.out.print(mas[i][j] + " ");
				mas1[i][j] = mas[i][j];
				mask[i][j] = false;
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
		for(int i=0; i<n; i++){
			min[i] = mas1[i][0];
			for(int j=0; j<n; j++){
				if(min[i] > mas1[i][j]){
					min[i] = mas1[i][j];
				}
			}
		}
		System.out.println("иру 1");
		for(int i=0; i<n; i++){
			System.out.print(min[i] + " ");
			for(int j=0; j<n; j++){
				mas1[j][i] -= min[j];
			}
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("иру 2");
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(mas1[i][j] + " ");
			}
			System.out.println(" ");
		}
		

		System.out.println(" ");
		System.out.println("иру 3");
		
		for(int i=0; i<n; i++){
			min[i] = mas1[0][i];
			for(int j=0; j<n; j++){
				if(min[i] > mas1[j][i]){
					min[i] = mas1[j][i];
				}
			}
			System.out.print(min[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				mas1[j][i] -= min[i];	
			}
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(mas1[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println("иру 4");
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(mas1[i][j] == 0){
					dubl[i] += 1;
				}
			}
			if(dubl[i] >= 2){
				for(int j=0; j<n; j++){
					mask[i][j] = true;
				}
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(mas1[j][i] == 0){
					dubl1[i] += 1;
				}
			}
			if(dubl1[i] >= 2){
				for(int j=0; j<n; j++){
					mask[j][i] = true;
				}
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(mask[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(mask[j][i] == false && minim > mas1[i][j]){
					minim = mas1[i][j];
				}
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(mask[j][i] == false){
					mas1[i][j] -= minim;
				}
			}
		}
		System.out.println("ахчѓыќђрђ");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(mas1[i][j]==0){
					rez[i] = mas[i][j]; 
				}
			}
			System.out.print(rez[i] + " ");
		}
	}
}
