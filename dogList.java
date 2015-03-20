
public class dogList {
	private dog[] list = new dog[5];
	private int i = 0;
	
	public void add(dog d) {
		list[i] = d;
		System.out.println("the dog index is " + i);
		i++;
	}
}
