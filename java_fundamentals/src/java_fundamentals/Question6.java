package java_fundamentals;
import java.util.*;
public class Question6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
		sc.close();
	}

}
