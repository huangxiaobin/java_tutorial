
public class people {
	private String name;
	private potpie birthday;
	
	public people(String n, potpie b) {
		name = n;
		birthday = b;
	}
	
	public String toString() {
		return new String("name is: " + name + " birthday is: " + birthday);
	}
}
