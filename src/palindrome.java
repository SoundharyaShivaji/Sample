import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Palindrome of a number");
		int num,num1,i=0,rev=0;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sn.nextInt();
		num1 = num;
		while(num1>0)
		{
			i = num1 % 10;
			rev = (rev * 10) + i;
			num1 = num1/10;
		}
		if(num == rev)
		{
			System.out.println("The given number "+num+" is palindrome");
		}
		else
		{
			System.out.println("The give number "+num+" is not palindrome");
		}
	}

}
