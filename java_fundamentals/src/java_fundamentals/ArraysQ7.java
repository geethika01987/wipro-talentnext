package java_fundamentals;
import java.util.*;
public class ArraysQ7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("soretd "+Arrays.toString(arr));
		//rd=removeduplicates
		int rd=0;
		for(int i=1;i<size;i++) {
			if(arr[rd]!=arr[i]) {
				rd++;
				arr[rd]=arr[i];
			}
		}
		int unique[]=new int[rd+1];
		for(int i=0;i<=rd;i++) {
			unique[i]=arr[i];
			
		}
		System.out.println("unique"+Arrays.toString(unique));
		sc.close();
		
	}
}
