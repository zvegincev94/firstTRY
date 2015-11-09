package net.zvegincev;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int mas[][] = {{1,4,6,3},{9,7,10,9},{4,5,11,7},{8,7,8,5}};
		int mas1[][] = new int[n][n];
		int min[] = new int[n];
		
		for(int i=0;i<n;i++){
			min[i] = mas[i][0];
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mas1[i][j] = mas[i][j];
				System.out.print(mas[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(min[i]>mas1[i][j] && mas1[i][j] != 0){
					min[i] = mas1[i][j];
				}
			}
			for(int j=0;j<n;j++){
				mas1[i][j] -= min[i];
				System.out.print(mas1[i][j] + " ");
			}
			System.out.print("        " + min[i]);
			System.out.println(" ");	
		}
		
		
		
	}

}
