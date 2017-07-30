package basics;
/**
 * Use of conditional Expressions.
 * @author meenal
 *
 */
public class ConditionalExpressions {
	private Integer abs;
	private int hour;
	private int minute;
	private int second;
	private int arr[];
	
	ConditionalExpressions(int hour,int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
		System.out.printf("Time is %02d:%02d:%02d",hour,minute, second,"sdfsd",1,1.0, arr);
		Object c = 1.0;
		int a = 100;
		
	}
	
	public void setTime(int hour,int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public void setHour(int hour){
		this.hour = (hour>=0 && hour<24 ? hour : 0);
	}
	public void setMinute(int minute){
		this.minute = (minute>=0 && minute<60 ? minute : 0);
	}
	public void setSecond(int second){
		this.second = (second>=0 && second<60 ? second : 0);
	}
	
	public String twoString(){
		return String.format("Time is %02d:%02d:%02d %s",(hour==0||hour==12 ? 12 : hour%12),minute,second,
				                                              (hour<12 ? "AM" : "PM"));
	}
		
}
