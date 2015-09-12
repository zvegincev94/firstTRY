package net.zvegincev;

public class LB1_optimum_step2 {

	public LB1_optimum_step2() {
		
	}
	
	public boolean optimum(float mas, float mas2, float opt, float opt2, float opt3, float opt4) {
        if(mas>=opt && mas<=opt2){
        	if(mas2>=opt3 && mas2<=opt4){
        		return true;
        	}
        }
        return false;
    }
	
}
