
public class oddcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Count the odd numbers from 1 to 100");
		int count = 0;
		for(int i = 1;i<=100;i++)
		{
			if (i % 2 == 1)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
