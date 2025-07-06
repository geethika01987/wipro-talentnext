package java_fundamentals;
import java.util.*;
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0) {
			int a=n%10;
			count=count+a;
			n=n/10;
		}
		System.out.println("sum of the digits is:"+count);

	}

}
