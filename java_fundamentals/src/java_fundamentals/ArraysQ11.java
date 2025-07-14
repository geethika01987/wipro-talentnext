package java_fundamentals;
import java.util.*;
public class ArraysQ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Size");
		int size=sc.nextInt();
		int arr[]=new int [size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		boolean contain=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=4 && arr[i]!=1) {
				 contain=false;
				break;
			}
		}if(contain==true) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
		sc.close();

	}

}
