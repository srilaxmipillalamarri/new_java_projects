package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int r,sum=0,temp;
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(sum==temp) 
			System.out.println("is palindrome " +temp);
			
		else
			System.out.println("is not palindrome " +temp);
		
		}
		
		

	}

