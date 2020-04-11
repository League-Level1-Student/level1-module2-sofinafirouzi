package _07_tea_party;

public class TeaParty {
	String name;
	boolean isWoman;
	boolean isKnighted;
	String title;
	
    
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    //set get name
    
    
    public boolean getIsWoman() {
    	if(isWoman) {
    	return isWoman = true;
    }
    	else {
    		return isWoman = false;
    	}
    }
    	
    public void setIsWoman(boolean isWoman) {
    	this.isWoman = isWoman;
    }
    //set get is woman
    
    
    public boolean getIsKnighted() {
    	if(isKnighted ) {
        	return isKnighted = true;
        }
        	else {
        		return isKnighted = false;
        	}
    }
    public void setIsKnighted(boolean isKnighted) {
    	this.isKnighted = isKnighted;
    }
    //set get is knighted
    
    public String getTitle( boolean isWoman, boolean isKnighted) {
    	if(isWoman) {
    		if(isKnighted) {
    			title = "Lady";
    		}
    		else {
    			title = "Ms.";
    		}
    	}
    	else if(isWoman==false) {
    		if(isKnighted) {
    			title = "Sir";
    		}
    		else {
    			title = "Mr.";
    		}
    	}
		return title;
    			
    }
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
    	this.name = name;
    		return "Hello " + getTitle(isWoman, isKnighted)+ " " + name;
    		
        }
    
}//end tea party class