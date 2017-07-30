	package basics;

public class ChecktoString {
	private static int day;
	private static int month;
	private static int year;
	
	public void date(int d,int m, int y){
		day = d;
		month = m;
		year = y;
	
		System.out.printf("Today's date is %s",this,1,"hu");
	}
	
	/*
	 * String format would take arguments in 2nd part as per the number of parameters used in 1st part 
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return String.format("%02d/%02d/%02d%s",day,month,year,"go");
	}
}




//private void getSome(Object aa[])
//{
//	
//}
//
//private void getSomeTwo(Object ...aa)
//{
//	
//}
//
//private void abc(){
//	Object abc[]= {1212,121,""};
//	getSome(new Object[]{});
//	getSome(abc);
//	getSome(4,9,"","");
//	getSomeTwo(4,9,"","");
//}
//
//public void test(){
//	Object a[] = new Object[5]; 
//	int e[] = new int[5];
//	int f[];
//	Object b[] = {1,2,3,4,5};
//	Object c[] = new Object[]{1,2,3,4,5};
//	Object d[] = new Object[]{2,2,3};
//	
//	getSome(a);
//	getSome(b);
//	getSome(new Object[10]);
//	getSome(new Object[]{1,2});
//}