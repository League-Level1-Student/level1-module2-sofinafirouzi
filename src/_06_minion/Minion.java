package _06_minion;

public class Minion {
	String name;
	int eyes;
	String color;
	String master;
	
	public Minion (String name , int eyes, String color, String master  ) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
		
	}//end constructor
		
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//set get name

public int getEyes() {
	return eyes;
}

public void setEyes(int eyes) {
	this.eyes = eyes;
}
//set get eyes
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
	//set get color
public String getMaster() {
	return master;
}
public void setMaster(String master) {
	this.master = master;
}
//set get master

}//end minion class
