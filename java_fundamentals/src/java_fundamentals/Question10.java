package java_fundamentals;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Gender");
		String gender=sc.nextLine();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		if((gender.equals("Female")) && (age>=1 && age<=58)) {
			System.out.println("8.2%");
		}else if((gender.equals("Female")) && (age>=59 && age<=100)) {
			System.out.println("9.2%");
		}else if((gender.equals("Male")) && (age>=1 && age<=58)) {
			System.out.println("8.4%");
		}else  {
			System.out.println("10.5%");
		}
		sc.close();
	}

}
