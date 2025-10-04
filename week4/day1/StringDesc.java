package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringDesc {

	public static void main(String[] args) {
		List<String> word=new ArrayList<String>();
		word.add("HCL");
		word.add("Wipro");
		word.add("Aspire Systems");
		word.add("CTS");
		
		Collections.sort(word);
		for(int i=word.size()-1;i>=0;i--)
		{
		System.out.print(word.get(i));
		if(i>0)
		{System.out.print(", ");
		}

}
}}