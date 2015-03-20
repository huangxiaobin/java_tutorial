
public enum friend {
	xiaomei("nice", 22),
	xiaoli("tall", 23),
	mary("prety", 21),
	nicole("italian", 22),
	julia("hot", 23),
	candy("happy", 21);
	
	private String desc;
	private int age;
	
	friend(String d, int a) {
		desc = d;
		age =a;
	}
	public String toString() {
		return new String("she is \t" + desc + "\t and she is \t" + age);
	}
}
