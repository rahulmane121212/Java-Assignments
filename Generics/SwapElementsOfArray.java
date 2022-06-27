package Generics;

import java.util.Arrays;

public class SwapElementsOfArray {

	public static final <T> void swap (T[] arrays, int i, int j) {
        T t = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = t;
        }
	
	public static void main(String[] args) {
		Integer [] arrays = new Integer[] {10,30,40,50};
        swap(arrays, 0, 1);
        System.out.println("a:"+Arrays.toString(arrays));
        swap(arrays, 2, 3);    
        System.out.println("a:"+Arrays.toString(arrays));

       

	}

}
