package java_fundamentals;
import java.util.*;
public class ArrayQ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		System.out.println("enter a elements");
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		int b[]=new int[3];
		System.out.println("enter b elements");
		for(int i=0;i<3;i++) {
			b[i]=sc.nextInt();
			
		}
		int arr[]=new int[2];
			arr[0]=a[1];
			arr[1]=b[1];
		
		System.out.println(Arrays.toString(arr));
		sc.close();

	}

}
