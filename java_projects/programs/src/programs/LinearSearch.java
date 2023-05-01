package programs;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {1,6,9,2,5,1,5,3,8,4};
		int key;
		Scanner sc=new Scanner(System.in);
		System.out.println("given array is");
		for(int e:arr)
			System.out.println(e+ "");
		key=sc.nextInt();
		
		//linear search
		boolean isFound=false;
		for(int i=0; i<arr.length;i++)
			if(arr[i]==key) {
				System.out.println(key+ "found at position" +(i+1));
				isFound=true;
				break;
				
			}
		if(isFound==false)
			System.out.println("not found");
		
		

	}

}
