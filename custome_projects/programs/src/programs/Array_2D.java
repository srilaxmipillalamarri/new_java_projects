package programs;

import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {
		int [][]a=new int [3][2];
		//int i=0,j=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<a.length;i++) {
			System.out.println("enter elements in row" +(i+1));
			
		for(int j=0; j<a[i].length;j++) {
			System.out.println("enter elements in row" +(j+1)+ " ");
			a[i][j]=sc.nextInt();
		}
		}
		System.out.println("\n elements in matrix form");
		int j=0;
		for(int  i=0; i<a.length;i++) 
			System.out.println(a[i][j]+" ");
			System.out.println();
		
		}
		
		

	}


