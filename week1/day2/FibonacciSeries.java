package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum=0;
		int secondNum=1;
		
		for (int i = 0; i <=5; i++) {
		
			if (i==0) {
				System.out.println(firstNum);
				System.out.println(secondNum);
			}
			
		
			int nextNum=firstNum+secondNum;
			System.out.println(nextNum);
			firstNum=secondNum;
			secondNum=nextNum;
			
		}
		

	}

}
