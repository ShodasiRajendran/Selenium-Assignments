package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stop";
		String text2="stops";
		//boolean Value=false;
		
		int text1length=text1.length();
		int text2length=text2.length();
		
		if(text1length!=text2length)
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		else 
		{
			char text1Array[]=text1.toCharArray();
			char text2Array[]=text2.toCharArray();
			
			Arrays.sort(text1Array);
			Arrays.sort(text2Array);
			
			for(int i=0; i<text1length;i++)
			{
				if(text1Array[i]==text2Array[i])
				{
					continue;
				}
				
				else
					System.out.println(text1+" and "+ text2+" are not Anagrams");
					return;
			
	}
			System.out.println(text1+" and "+ text2+" are Anagrams");
		}
}
}
