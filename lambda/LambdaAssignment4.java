package lambda;

import java.util.*;
import java.util.function.Predicate;

public class LambdaAssignment4 {

	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<>(Arrays.asList("Rahul","Amol","Amit","Chiku","Suraj"));
		Predicate<String> filter = str->(str.length()%2!=0);
		System.out.println("Orignal ArrayList "+name);
		boolean value=name.removeIf(filter);
		System.out.println("Returned value "+value);
		System.out.println("ArrayList after removeIf() "+name);

	}

}
