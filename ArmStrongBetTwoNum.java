package assignments;

public class ArmStrongBetTwoNum {

	public static void main(String[] args) 
	{

		int start = 100;
		int end = 999;

		for (int i = start; i <= end; i++) 
		{
			int count = 0;
			int temp = i;
			start = i;

			while (start > 0) 
			{
				count++;
				start = start / 10;

			}

			start = temp;
			int sum = 0;

			while (start > 0) 
			{
				int res = 1;
				int pow = count;

				int dig = start % 10;

				while (pow > 0) 
				{
					res = res * dig;
					pow--;
				}

				sum = sum + res;
				start = start / 10;
			}

			if (sum == temp)
			{
				System.out.println("Number is armstrong : " + sum);
			}
		}

	}

}



		//  2)  else if((a>60 && b>60 ) || (b>60 && c>60) || (a>60 && c>60) )
		//  3)  else {sop(fail)}





