
public class sumofeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of the even numbers from 1 to 500");
		int sum = 0;
		for(int i = 1;i<=500;i++)
		{
			if (i % 2 == 0)
			{
				sum+=i;
			}
		}
		System.out.println("The sum of the even numbers from 1 to 500 is: "+sum);
	}

}
