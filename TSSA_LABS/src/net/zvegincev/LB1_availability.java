package net.zvegincev;

public class LB1_availability {

	public LB1_availability() {
		
	}
	
	public boolean availability(float X, float Y, float conditionX1, float conditionX2, float conditionY1, float conditionY2) {
        if(X>=conditionX1 && X<=conditionX2){
        	if(Y>=conditionY1 && Y<=conditionY2){
        		return true;
        	}
        }
        return false;
    }  
	
}
