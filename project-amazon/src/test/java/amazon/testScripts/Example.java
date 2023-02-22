package amazon.testScripts;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers e.g 33 11");

		int first=sc.nextInt();
		int second=sc.nextInt();
		
		for(int i=0;i<=100;i++) {
			first=first+i;
			if((first%second)==0 && first<i) {
				System.out.println(first);
			}
			if((first%second)==0) {
				System.out.println(first);
			}
		}
		
		
	}

}
