package _07_tea_party;


public class TeaParty {
	String name;
	boolean isWoman;
	boolean isKnighted;
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
		this.name = name;
		this.isWoman = isWoman;
		this.isKnighted = isKnighted;
    }
    public String getName() {
    	return name;
    }
    public String setName(String name) {
    	this.name = name;
    }
    //set get name
    public boolean getIsWoman() {
    	return isWoman;
    }
    public boolean setIsWoman(boolean isWoman) {
    	this.isWoman = isWoman;
    }
    //set get is woman
    public boolean getIsKnighted() {
    	return isKnighted;
    }
    public boolean setIsKnighted(boolean isKnighted) {
    	this.isKnighted = isKnighted;
    }
    //set get is knighted
    
    
    
}//end tea party class