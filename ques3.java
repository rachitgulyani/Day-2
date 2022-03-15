import java.util.Scanner;
public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter string:");
	String str=sc.nextLine();
	String reverse="";
	for(int i=0;i<str.length();i++) 
	{
		char ch=str.charAt(i);
		reverse=ch+reverse;
		
    }
	if(str.equals(reverse))
		System.out.println("Pallindrone string");
	else
		System.out.println("Not a pallindrone string");
	
	
	
	
	
	
	}
}
