package week1.day2;

public class IsPalindrome {

	public static void main(String[] args) {
		
		int originalNum=121;
		int reversedNum=0;
		int rem = 0;
		for (int i=originalNum;i>0;) {
			rem= i%10;
			reversedNum=reversedNum*10+rem;
			i=i/10;

		}
		if(reversedNum==originalNum)
			System.out.println(originalNum+" is a palindrome");
		else
			System.out.println(originalNum+" is not a palindrome");
		}

	}


