package lambda;


@FunctionalInterface
interface Arithmetic{
	int arithmetic(int a,int b);
}

public class LamdaArithmetic {

	public static void main(String[] args) {
		
		Arithmetic add=(a,b)->(a+b);
		System.out.println("The addition of two numbers is "+add.arithmetic(10, 20));
		
		Arithmetic multiply=(a,b)->(a*b);
		System.out.println("The multiplication of two numbers "+multiply.arithmetic(10, 10));
		
		Arithmetic div=(a,b)->(a/b);
		System.out.println("The division of two numbers is "+div.arithmetic(100, 10));
		
		Arithmetic sub=(a,b)->(a-b);
		System.out.println("The subtraction of two numbers is "+sub.arithmetic(100, 10));
		
		

	}

}
