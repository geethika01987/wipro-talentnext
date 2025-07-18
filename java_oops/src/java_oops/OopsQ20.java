package java_oops;
import java.util.*;
public class OopsQ20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = new String[5];

		// Using Optional to handle null safely
		Optional<String> optionalName = Optional.ofNullable(names[0]);

		int length = optionalName.map(String::length).orElse(0);

		System.out.println("Length of names[0]: " + length);

	}

}
