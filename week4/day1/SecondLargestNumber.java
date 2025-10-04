package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num.add(3);
		num.add(2);
		num.add(11);
		num.add(4);
		num.add(6);
		num.add(7);
		
		Collections.sort(num);
		int size = num.size();
		
		for(int i=0; i<num.size();i++)
		{
			System.out.println(num.get(i));
		}
		int secondLargestIndex=size-2;
		System.out.println("Second Largest Number is "+num.get(secondLargestIndex));
	}

}
