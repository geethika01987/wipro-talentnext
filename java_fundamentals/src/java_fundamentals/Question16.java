package java_fundamentals;
import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		sc.close();

	}

}
