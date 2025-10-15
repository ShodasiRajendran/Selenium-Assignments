package java;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		System.out.println("Enter a line: ");
		Scanner obj=new Scanner(System.in);
		String line=obj.nextLine();
		
		String[] word=line.split(" ");
		int indexOfLastWord = word.length-1;
		int lengthOfLastWord=word[indexOfLastWord].length();
		System.out.println("Last word is:"+word[indexOfLastWord]);
		System.out.println("Length of Last word is:"+lengthOfLastWord);

	}

}
