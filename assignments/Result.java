package assignments;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Sub 1 Marks :");
		int S1 = sc.nextInt();
		
		System.out.println("Enter Sub 2 Marks :");
		int S2 = sc.nextInt();
		
		System.out.println("Enter Sub 3 Marks :");
		int S3 = sc.nextInt();
		
		if( S1 > 60 && S2 > 60 && S3 > 60)
		{
			System.out.println("Pass");
		}
		else if ((S1 > 60 && S2 > 60) || (S2 > 60 && S3 > 60) || (S1 > 60 && S3 > 60))
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
