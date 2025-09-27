package week3.day1;


import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		 int[] num= {2, 5, 7, 7, 5, 9, 2, 3};
		 System.out.print("Sorted Numbers are ");
		 for(int j=0;j<num.length-1;j++)
		 {
		 Arrays.sort(num);
		 System.out.println(num[j]);
		 }
		 System.out.println("Duplicates are ");
		 for(int i=0;i < num.length-1; i++)
		 {
			 if(num[i]==num[i+1])
				
				 System.out.println(num[i]);
		 }
		 
		 }
		 

	}


