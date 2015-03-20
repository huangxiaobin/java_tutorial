
public class chris {
	public chris() {
	}
	
	public chris(String name) {
		gf_name = name;
	}
	
	public void simpleMessage() {
		System.out.println("simple message");
	}
	
	public void simpleMessage(String name) {
		System.out.println("hello " + name);
	}
	
	public void setName(String name) {
		gf_name = name;
	}
	
	public String getName() {
		return gf_name;
	}
	
	public void saying() {
		System.out.println("your first gf is " + getName());
	}
	
	private String gf_name;
 }
