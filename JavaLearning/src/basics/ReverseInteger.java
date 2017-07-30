package basics;

import java.util.Scanner;

public class ReverseInteger {

	int n;
	int res = 0;

	ReverseInteger(int x) {
		n = x;
	}

	public void reverse() {
		int num = n;
		if (n < 0) {
			num = num * (-1);
		}
		while (num > 0) {
			res = (res * 10) + (num % 10);
			num = num / 10;
		}
		if (n < 0){
			res = res * (-1);
		}
	}

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter num to get reversed of it: ");
			int x = sc.nextInt();
			ReverseInteger rit = new ReverseInteger(x);
			rit.reverse();
			System.out.println("reverse is: " + rit.res);
		}
	}

}
