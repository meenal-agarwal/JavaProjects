package basics;
import java.util.Scanner;

/**
 * Use of Conditional Expressions Part2. 
 * @author meenal
 *
 */
public class Micky {
	
public static void main(String[] args) {

	Scanner scobj = new Scanner(System.in);
	int hour = scobj.nextInt();
	int minute = scobj.nextInt();
	int second = scobj.nextInt();
	ConditionalExpressions consobj = new ConditionalExpressions(hour,minute,second);
	System.out.println();
	consobj.setTime(hour, minute, second);
	System.out.println(consobj.twoString());
}

}
