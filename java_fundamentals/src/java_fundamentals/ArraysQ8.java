package java_fundamentals;
import java.util.*;
public class ArraysQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int s=0;
		boolean valid=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==6) {
				valid=true;
			}
			if(!valid) {
				s+=arr[i];
			}
			if(valid && arr[i]==7) {
				valid=false;
			}
		}
		System.out.println(s);

	}

}
