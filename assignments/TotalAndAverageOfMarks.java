package assignments;

import java.util.Scanner;

public class TotalAndAverageOfMarks {

	public static void main(String[] args) {
	   int stud = 3;
	   int t1 = 0;
	   
	   for(int i=0 ; i<3 ; i++)
	   {
		  
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the Marks for A :");
		   int A = sc.nextInt();
		   
		   System.out.println("Enter the Marks for B :");
		   int B = sc.nextInt();
		   
		   System.out.println("Enter the Marks for C :");
		   int C = sc.nextInt();
		   
		   int total = (A+B+C);
		   
		   
		    t1 = t1 + total;
		   System.out.println(t1);
		   
		   int avg = t1/3;
		   System.out.println("Average: "+avg);
		   
		   
		  
	   }
	   
	  //System.out.println("Total: "+total);
	   
	}

}
