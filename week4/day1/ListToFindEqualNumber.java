package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListToFindEqualNumber {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(11);
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.print("List1 are:");
		for(int i=0;i<list1.size();i++)
		{
		System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		System.out.print("List2 are:");
		for(int i=0;i<list2.size();i++)
		{
		System.out.print(list2.get(i)+" ");
		}
		System.out.println();
		System.out.print("Duplicate Values are:");
		for(int i=0;i<list1.size();i++)
		{
			int count =0;
			for(int j=0;j<list2.size();j++)
				{
				if(list1.get(i).equals(list2.get(j)))
			     {
				count++;
			}
				}
			if(count!=0)
				System.out.print(list1.get(i)+" ");
		}
		
	}

}
