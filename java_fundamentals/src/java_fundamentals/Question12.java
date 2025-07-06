package java_fundamentals;
import java.util.*;
public class Question12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter code");
		char code=sc.next().charAt(0);
		if(Character.isLowerCase(code)){
			code=Character.toUpperCase(code);
		}
		switch(code) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid Code");	
		}
		sc.close();
	}
}
