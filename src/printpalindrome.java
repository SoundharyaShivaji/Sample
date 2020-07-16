
public class printpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print Palindrome from 1 to 1000");
		
		for (int k = 1; k <= 1000; k++) {

			int a = k, n = 0;
			int i = 0, j = 0;
			n = a;
			while (a > 0) {
				i = a % 10;
				j = (j * 10) + i;
				a = a / 10;
			}
			if (n == j) {
				System.out.println(j);
			}

		}
	}

}
