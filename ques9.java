import java.util.Scanner;
public class ques9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		/*for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		*/
		
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.print("Maximum number is "+max);
		
		
		
	
	
	
	}

}
