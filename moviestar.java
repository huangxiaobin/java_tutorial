
public class moviestar {
	private String fname;
	private String lname;
	private static int member;
	
	moviestar(String f, String l) {
		fname = f;
		lname = l;
		member++;
	}
	
	public void display() {
		System.out.println(fname + " " + lname + "member is " + member);
	}
	
	public static int getMember() {
		return member;
	}
}
