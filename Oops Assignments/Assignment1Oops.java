package assignments2;


class Singleton
 {
	private static Singleton obj = null;
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if (obj == null)
		{
			obj = new Singleton();
			
		}
		return obj;
	}
	
	
 }


public class Assignment1Oops {

	public static void main(String[] args) {
		Singleton sgl = Singleton.getInstance();
		
		

	}

}
