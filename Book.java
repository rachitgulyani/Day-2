
public class Book {
	int isbn,price;
	String author,title;
public Book(int isbn,String title,String author,int price) {
	this.isbn=isbn;
	this.title=title;
	this.author=author;
	this.price=price;
}
public void displaydetails()
{
	System.out.println("ISBN:"+isbn);
	System.out.println("Title:"+title);
	System.out.println("Author:"+author);
	System.out.println("Price:"+price);
}
public void discountedprice(int discount) {
	System.out.print("Disounted Price"+(price-discount*0.01*price));
}
}
