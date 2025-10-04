package week4.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("cash on delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upi payments");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payments");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internet Banking");
		
	}
public static void main(String[] args) {
	Amazon obj=new Amazon();
	obj.cashOnDelivery();
	obj.upiPayments();
	obj.cardPayments();
	obj.internetBanking();
	obj.recordPaymentDetails();
	
}
}
