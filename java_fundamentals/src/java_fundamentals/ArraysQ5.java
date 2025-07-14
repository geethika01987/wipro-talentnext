package java_fundamentals;
import java.util.*;
import java.util.Arrays;
public class ArraysQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]!=largest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		System.out.println("largest :"+largest);
		if(secondLargest==Integer.MIN_VALUE) {
			System.out.println("no second largest");
		}else {
		System.out.println("secondlargest is: "+secondLargest);
		}
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			}else if(arr[i]!=smallest && arr[i]<secondSmallest) {
				secondSmallest=arr[i];
			}
		}
		System.out.println("smallest is:"+smallest);
		if(secondSmallest==Integer.MAX_VALUE) {
			System.out.println("no second smallest found");
		}else {
		System.out.println("second smallest is:"+secondSmallest);
		}
		sc.close();
	}

}
