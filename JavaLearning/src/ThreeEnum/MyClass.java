package ThreeEnum;
import java.util.EnumSet;

public class MyClass {
	public static void main(String[] args) {
		for(Fruits phal : Fruits.values())
			System.out.printf("%s\t%s\t%s\n", phal,phal.getColour(),phal.getTaste());
		
		for(Fruits phal : EnumSet.range(Fruits.Mango, Fruits.Grapes))
			System.out.printf("\n\n%s\t%s\t%s\n", phal,phal.getColour(),phal.getTaste());
	}

}
