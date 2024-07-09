package Mypack;

import java.util.Scanner;

public class ReverseNumber1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("enter a number");
    	int num=sc.nextInt();
    	//sc.close();
		//rev=0;
	
		StringBuffer sb= new  StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("reverse number is " + rev);

	}


}
