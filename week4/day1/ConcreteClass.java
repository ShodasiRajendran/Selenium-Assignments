package week4.day1;

public class ConcreteClass implements DBConnectionInterface{


	@Override
	public void connect() {
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate");
		
	}

	public static void main(String[] args) {
		ConcreteClass obj=new ConcreteClass();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
	}

	
}
