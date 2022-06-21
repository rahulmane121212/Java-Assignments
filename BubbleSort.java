package assignments;

import java.util.Scanner;

public class BubbleSort {
	
	public void bubbleSort(int arr[])
	{
		int n = arr.length;
		int temp=0;
		
		for(int i=0; i<n; i++ )
		{
			for(int j=0; j < n-1; j++)
			{
				 if(arr[j] > arr[j+1])
				 {  
                     //swap elements  
                     temp = arr[j];  
                     arr[j] = arr[j+1];  
                     arr[j+1] = temp;  
				 }
			}
	    }
	}
	
	void printArray(int arr[])
	{
		for(int i=0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");  
     
	}

	public static void main(String[] args) {
		
		BubbleSort bs = new BubbleSort();
		int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
		
		System.out.println("Array Before sort=");
		bs.printArray(arr);
		
		bs.bubbleSort(arr);
		System.out.println("Sorted Array=");
		 System.out.println("Array After Bubble Sort");  
		 bs.printArray(arr);
         
	}

}
