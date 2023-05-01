package programs;

import java.util.Scanner;

public class BinarySearch {

	
		
public static void main(String[] args) {
	int arr[]= {10,15,20,40,50,55,70,90};
	int key;
	Scanner sc=new Scanner(System.in);
	System.out.println("given sorted list");
	for(int e:arr)
		System.out.println(e+ "");
	System.out.println("\n enter key to search");
	key =sc.nextInt();
	//binary search
	
	int low=0,high=arr.length-1,mid;
	while(low<=high) {
		mid=(low+high)/2;
		if(key==arr[mid]) {
			System.out.println(key+ "found position" +(mid+1));
			break;
		}//if loop
		
		else if(key>arr[mid]) 
			low=mid+1;
			else 
				high=mid-1;

		
		}//while loop
	
		if(low>high) {
			System.out.println("search failed");
			
		}
	}
	
	
	
	
}


