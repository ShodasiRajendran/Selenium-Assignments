package week3.day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		String str="changeme";
		
		char[] charArray = str.toCharArray();
		
		for(int i=0; i<str.length();i++)
		{
			if(i%2!=0) {
			System.out.print(Character.toUpperCase(charArray[i]));			
				
			}
			else
				System.out.print(charArray[i]);
		}
		
		

	}

}
