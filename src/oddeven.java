import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sn.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("The given number "+num+" is even");
		}
		else
		{
			System.out.println("The given number "+num+" is odd");
		}
	}

}
