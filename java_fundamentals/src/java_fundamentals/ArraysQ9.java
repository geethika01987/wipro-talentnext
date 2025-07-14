package java_fundamentals;
import java.util.*;
public class ArraysQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<size;i++) {
			if(arr[i]==10) {
				c++;
			}
		}
		int index=0;
		int arr2[]=new int[size];
		for(int i=0;i<size;i++) {
			if(arr[i]!=10) {
				arr2[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<c;i++) {
			arr2[index]=10;
			index++;
		}
		System.out.println(Arrays.toString(arr2));
		for(int i=0;i<size;i++) {
			if(arr2[i]==10) {
				arr2[i]=0;
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		
	}
}
