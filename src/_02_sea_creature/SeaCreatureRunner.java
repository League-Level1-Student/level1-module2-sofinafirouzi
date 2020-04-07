package _02_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	
	SeaCreature spongebob = new SeaCreature("Spongebob");
	spongebob.eat();
	spongebob.laugh();
	SeaCreature patrick = new SeaCreature("Patrick");
	SeaCreature Squidward = new SeaCreature("Squidward");
	System.out.println(patrick.getName());
	System.out.println(Squidward.getName());
	patrick.eat();
	patrick.laugh();
	Squidward.eat();
	Squidward.laugh();
}
}
