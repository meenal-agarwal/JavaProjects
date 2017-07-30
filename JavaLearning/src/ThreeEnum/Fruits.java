package ThreeEnum;
//import java.util.EnumSet;

public enum Fruits {
	Apple("Red","Sour"),
	Mango("Yellow","Sweet"),
	Grapes("Grapes","Mix");
	
	private final String colour;
	private final String taste;
	
	fruits(String col, String tst){
		colour = col;
		taste = tst;
	}
	
	public String getColour(){
		return colour;
	}

	public String getTaste(){
		return taste;
	}
}
