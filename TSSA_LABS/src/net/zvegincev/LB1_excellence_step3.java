package net.zvegincev;

public class LB1_excellence_step3 {

	public LB1_excellence_step3() {
		
	}
	
	public boolean excellence(double mas1, double mas2, double exc1, double exc2, double rad) {
        if(mas1<=(exc1+rad) && mas1>=(exc1-rad) && mas2<=(exc2+rad) && mas2>=(exc2-rad)){
        	return true;
        }
        return false;
    }  
	
}
