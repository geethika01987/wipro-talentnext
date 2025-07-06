package java_fundamentals;

import java.util.Scanner;
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digits");
		int n=sc.nextInt();
		int reverse=0;
		while(n>0) {
			int a=n%10;
			reverse=reverse*10+a;
			n=n/10;
			
		}
		System.out.println("reverse:"+reverse);
		sc.close();

	}

}
