package basics;

public class Palindrome {

	int num;

	Palindrome(int x) {

		num = x;
	}

	public boolean isPalindrome() {
		String str = Integer.toString(num);
		int i = 0;
		int j = (str.length()) - 1;
		while (i < j) {
			if ((str.charAt(i)) == (str.charAt(j))) {
				i++;
				j--;
			} else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Palindrome pd = new Palindrome(1001001);
		System.out.println(pd.isPalindrome());
	}
}
