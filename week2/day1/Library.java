package week2.day1;

public class Library {
	//Method bookTitle
	public String addBook(String bookTitle) {
		System.out.println(bookTitle + " book added successfully");
		return bookTitle;
		
	}
	//Private void Method issueBook
	private void issueBook() {
		System.out.println("Book issued successfully");

	}
	public static void main(String[] args) {
		Library bookDetails=new Library();
		bookDetails.addBook("Ponniyin Selvan");
		bookDetails.issueBook();
		//Getting the reurn value from Method and assigning it to variable
		String returnValue =bookDetails.addBook("Velpari");
		System.out.println("Printing the return value inside the main method "+returnValue);
	}

}
