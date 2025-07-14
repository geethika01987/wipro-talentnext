package java_fundamentals;
import java.util.*;
public class ArraysQ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int index=0;
		int result[]=new int[size];
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
			result[index]	=arr[i];
				index++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				result[index]=arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(result));
		
		sc.close();

	}

}
