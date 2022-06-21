package assignments3Stringa;



public class StringOperations3 {

	public static void main(String[] args) {
		
		
		
		String str = "Java String pool refers to collection of String which are stored in heap memory";
		System.out.println(str);
		
		
		
		
		System.out.println(str.toLowerCase());
		
		
		System.out.println(str.toUpperCase());
		
		
		String replaceString=str.replace('a','$');
		System.out.println(replaceString);
		
		boolean isContains = str.contains("collection");
		System.out.println("Contains: " + isContains);
		
		System.out.println(str.matches("java string pool refers to collection of string which are stored in heap memory"));
		
		boolean isEqual = str.equals("java string pool refers to collection of string which are stored in heap memory");
		if(isEqual == true)
		{
			System.out.println("String is Equal ");
		}
		else
		{
			System.out.println("String is not Equal");
		}
	}

}


