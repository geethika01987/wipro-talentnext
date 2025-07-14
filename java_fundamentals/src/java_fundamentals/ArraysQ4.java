package java_fundamentals;
import java.util.*;
public class ArraysQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("ASCII VALUE \t:Character");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t\t:"+(char)arr[i]);
		}
		sc.close();


	}

}
