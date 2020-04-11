package _99_extra;

public class Cat {
	String name;
	int napsPerDay;
	
	public static void main(String[] args) {
		Cat kit = new Cat();
		kit.SetName("Kit");
		kit.SetNap(5);
		kit.cat();
		
	}
	public void SetNap(int napsPerDay) {
		this.napsPerDay = napsPerDay;
	}
	
	public int GetNap() {
		return napsPerDay;
	}
	public void SetName(String name) {
		this.name = name;
		
	}
	public String GetName() {
		return name;
	}
public void cat() {
	 System.out.println( "Hi my name is " + GetName() + ", I take "+ GetNap() + " naps per day. Being a cat is fun");
	
	}
}
