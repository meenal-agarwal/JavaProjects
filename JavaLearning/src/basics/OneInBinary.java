package basics;

public class OneInBinary {

	int x;
	String counter = " ";

	OneInBinary(int a) {
		x = a;
	}

	public int calBinary() {
		int count = 0;
		while (x > 0) {
			int d = x % 2;
			if (d == 1) {
				count++;
			}
			x = x >> 1;
			counter = d + counter;

		}
		System.out.println(counter);
		return count;
	}

	public int countOne() {
		int a = Integer.parseInt(counter.trim());
		System.out.println(a);
		int count = 0;
		while (a > 0) {
			if (a % 2 != 0) {
				count++;
				System.out.println("print");
			}
			a = a >> 1;
			System.out.println("a is "+a);
		}
		return count;
	}

	public static void main(String[] args) {
		OneInBinary bin = new OneInBinary(12);
		System.out.println(bin.calBinary());
		System.out.println(bin.countOne());
	}

}
