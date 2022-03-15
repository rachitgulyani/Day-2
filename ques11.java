import java.util.Scanner;
public class ques11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book b1=new Book(100,"The invinsible man","Abc",1000);
		b1.displaydetails();
		System.out.print("Enter discount:");
		int discount=sc.nextInt();
		b1.discountedprice(discount);
	
	
	}

}
