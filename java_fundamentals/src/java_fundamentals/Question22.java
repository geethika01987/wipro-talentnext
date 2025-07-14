package java_fundamentals;
import java.util.*;
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers ");
		int n=sc.nextInt();
		int original=n;
		int count=0;
		while(n>0) {
			int a=n%10;
			count=count*10+a;
			n=n/10;
		}
		if(original==count) {
			System.out.println(original+": is a palindrom");
		}else {
			System.out.println(original+": is not palindrom");
			
		}
		sc.close();

	}

}
