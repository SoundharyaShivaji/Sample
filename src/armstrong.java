import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Find out whether the number is armstrong or not");
		int a = 153, n = 0;
		int i = 0, j = 0;
		n = a;
		while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
		}
		if (n == j) {
			System.out.println("Amstrong");
		} else {
			System.out.println("Not a amstrong number");
		}
		
	}

}
