package assignments;

public class Armstrong {
	
	public static void main(String[] args)
	{
		int num = 153;
		int count = 0;
		int temp=num;
		
		while (num > 0)
		{
			
			count++;
			num = num / 10;
		}
		
		//System.out.println("Count of digit = " +count);
		
		num = temp;
		
		int sum = 0;
		while(num > 0)
		{
			int res = 1;
			int pow = count;
			
			int dig = num %10;
			
			while ( pow > 0)
			{
				res = res * dig;
				pow--;
				
			}
			
			sum = sum + res;
			num = num / 10;
			
		}
		
		if (sum == temp)
		{
			System.out.println("Number is armstrong");
		}
		
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
