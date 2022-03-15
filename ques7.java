import java.util.Scanner;
public class ques7 {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter a number:");
	 int num=sc.nextInt();
	 int fact=1;
	 do {
		 fact=fact*num;
		 num--;
	 }while(num>1);
	 System.out.print("Factorial is "+fact);
	 
	 
 }
}
