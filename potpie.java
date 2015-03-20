
public class potpie extends food{
	private int month;
	private int day;
	private int year;
	
	public potpie() {
	}
	
	public potpie(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
	
	public void eat() {
		System.out.println("call potpie's eat method");
	}
}
