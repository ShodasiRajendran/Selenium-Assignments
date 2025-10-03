package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		String str="TestLeaf";
		char[] str1 = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.print(str1[i]);
		}
		
	}

}
