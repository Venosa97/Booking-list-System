package exClasassssssssssss;

public class Sqrt {
	
	public int mySqrt(int x) {

        int left = 0;
        int right = 46341;

        while(left + 1 < right){
            int mid = (right + left)/2;
            if(mid*mid > x){
                right = mid;
            } else {
                left = mid;
            }
        }
        
        return left;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
