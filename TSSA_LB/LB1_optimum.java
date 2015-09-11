

public class LB1_optimum {

	public LB1_optimum() {
		
	}
	
	public boolean optimum(float X, float Y, float optimumX1, float optimumX2, float optimumY1, float optimumY2) {
        if(X>=optimumX1 && X<=optimumX2){
        	if(Y>=optimumY1 && Y<=optimumY2){
        		return true;
        	}
        }
        return false;
    }
	
}
