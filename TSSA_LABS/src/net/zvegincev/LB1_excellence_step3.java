package net.zvegincev;

public class LB1_excellence_step3 {

	public LB1_excellence_step3() {
		
	}
	
	public boolean excellence(double mas1, double mas2, double exc1, double exc2, double rad) {
        if(Math.pow(mas1 - exc1, 2) + Math.pow(mas1 - exc1, 2) <= Math.pow(rad, 2)){
        	return true;
        }
        return false;
    }  
	
}
