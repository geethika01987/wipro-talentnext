package java_fundamentals;
import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphabet");
		char ch=sc.next().charAt(0);
		if(Character.isUpperCase(ch)) {
			System.out.println(Character.toLowerCase(ch));
			
		}else{
			System.out.println(Character.toUpperCase(ch));
		}

	}

}
