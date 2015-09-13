package net.zvegincev;

public class LB1_availability_step1 {

	public LB1_availability_step1() {
		
	}
	
	public boolean availability(double X, double Y, double conditionX1, double conditionX2, double conditionY1, double conditionY2) {
        if(X>=conditionX1 && X<=conditionX2){
        	if(Y>=conditionY1 && Y<=conditionY2){
        		return true;
        	}
        }
        return false;
    }  
	
}
