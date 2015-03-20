
public class tuna extends food{
	private	int hour;
	private int minute;
	private int second;

	public tuna() {
		this(0,0,0);
	}
	
	public tuna(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void displayTime() {
		System.out.println( hour + ":" + minute + ":" + second);
	}
	
	public void displayNormalTime() {
		System.out.println( (hour%12) + ":" + minute + ":" + second + (hour<12?" AM":" PM"));	
	}
	
	public void setHour(int h) {
		hour = (h>=0&&h<=24)?h:0;
	}
	public void setMinute(int m) {
		minute = (m>=0&&m<=60)?m:0;
	}
	public void setSecond(int s) {
		second = (s>=0&&s<=60)?s:0;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	public void eat() {
		System.out.println("call tuna's eat method");
	}
}
