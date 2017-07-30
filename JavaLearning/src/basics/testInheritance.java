package basics;

	class X 
	{
	    Y b = new Y();
	    X() 
	    { 
	        System.out.print("X"); 
	    }
	}
	class Y 
	{
	    Y() 
	    { 
	        System.out.print("Y"); 
	    }
	}
	public class testInheritance extends X 
	{
//	    Y y = new Y();
	    testInheritance() 
	    { 
	        System.out.print("Z"); 
	    }
	    Y y = new Y();
	    public static void main(String[] args) 
	    {
	           new testInheritance();
	    }
	}

