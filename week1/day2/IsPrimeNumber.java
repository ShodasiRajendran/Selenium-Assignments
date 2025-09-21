package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
	for (int i =2; i <=15; i++) 
	{
		if(i<=3)
			{
				if(i%2==0 || i%3==0)
				System.out.println(i +" is a prime number");
				else
				System.out.println(i +" is not a prime number");
			}
		if(i>3)
			{
				if(i%2!=0) 
					{
					if(i%3!=0)  
					System.out.println(i +" is a prime number");
					else
					System.out.println(i +" is not a prime number");
					}
					else
					System.out.println(i +" is not a prime number");
			}
		}
	}

}


