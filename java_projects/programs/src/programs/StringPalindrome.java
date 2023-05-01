package programs;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String args[]) {
		//String s1="srilu";
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		//System.out.println(s1.length());
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
			//System.out.println("");
		}
		
		/*Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		boolean flag= true;
		int n=str.length();
		 
		for(int i=0, j=n-1; i<n/2; i++, j--) 
			if(str.charAt(i)!=str.charAt(j)) {
				boolean flag = false;
				break;
			}
		
		if(flag ==true) { 
		
			System.out.println("is palindrome");
			else 
				System.out.println("is not palindrome");
			
		
		System.out.println("");
		}
	}*/

}
}