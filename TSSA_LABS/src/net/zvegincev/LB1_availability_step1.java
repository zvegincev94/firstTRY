package net.zvegincev;

public class LB1_availability_step1 {

	public LB1_availability_step1() {
		
	}
	
	public boolean availability(double X, double conditionX1, double rad) {
        if(X<=(conditionX1+rad) && X>=(conditionX1-rad)){
        	return true;
        }
        return false;
    }  
	
}
