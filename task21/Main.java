package task21;

import java.util.Arrays;
import java.util.Random;

import task2.MultiThreadSorting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[1000];
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(10);
		}
		int[] array2 = array.clone();
		int[] array3 = array.clone();
		long tstart = System.currentTimeMillis();
		summ(array);
		long tend = System.currentTimeMillis();
		System.out.println((tend - tstart) + " ms" + "- Static method sum");
		tstart = System.currentTimeMillis();
		MultiThreadSum.sum(array2, 2);
		tend = System.currentTimeMillis();
		System.out.println((tend - tstart) + " ms" + " - MultiThread sum");
		
	}
	
static void summ(int [] array){
long s=0;
for(int i=0;i<array.length;i++){
	s=s+array[i];
}
System.out.println(s);
}
}
