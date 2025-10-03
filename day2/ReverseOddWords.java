package week3.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] split = test.split(" ");
		String word;
		for(int i=0; i<split.length;i++)
		{
			if(i%2!=0)
			{
				int length = split[i].length();
				word = split[i];
				for(int j=length-1;j>=0;j--)
				{
					System.out.print(word.charAt(j));
				}
				System.out.println();
			}
			else
				System.out.println(split[i]);
		}
	}

}
