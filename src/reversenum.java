import java.util.Scanner;

public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reverse of the number");
		int num,num1,rev=0;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sn.nextInt();
		num1 = num;
		while(num>0)
		{
			num1 = num % 10;
			rev = (rev * 10)+num1;
			num = num / 10;
		}
		System.out.println(rev);
	}

}
