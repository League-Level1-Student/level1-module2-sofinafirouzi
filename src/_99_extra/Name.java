package _99_extra;

import javax.swing.JOptionPane;

public class Name {
	String myName = "Sofina";
	String otherName;
	// Write a method that takes a person’s name as a parameter. If it’s your name, return “awesome”, otherwise return “lame”. 
public static void main(String[] args) {
	Name name = new Name();
	name.GetName();
}
public void GetName() {
	otherName = JOptionPane.showInputDialog("What is your name?");
	if(otherName.equalsIgnoreCase(myName)) {
		System.out.println("awesome");
	}
	else {
		System.out.println("lame");
	}
}
}
