package programs;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int countwords= str.split(" ").length;
		System.out.println(countwords);
		

	}

}
