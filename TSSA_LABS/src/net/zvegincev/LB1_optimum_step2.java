package net.zvegincev;

public class LB1_optimum_step2 {

	public LB1_optimum_step2() {
		
	}
	
	public boolean optimum(double x, double y, double opt1, double opt2, double opt3, double opt4) {
        if(x>=opt1 && x<=opt2){
        	if(y>=opt3 && y<=opt4){
        		return true;
        	}
        }
        return false;
    }
	
}
