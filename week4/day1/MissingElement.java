package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(10);
		num.add(6);
		num.add(8);
		
		Collections.sort(num);
		System.out.print("Input is:");
		for(int i=0;i<num.size();i++)
		{
			System.out.print(num.get(i)+" ");
		}
		System.out.println();
		System.out.print("Output is:");
		for(int j=0;j<num.size()-1;j++)
		{
			if(num.get(j+1)!=num.get(j)+1)
			{
				System.out.print(num.get(j)+1+" ");
			}
		}
	}

}
