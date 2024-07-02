package powerOfTwo;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        int k = 0;
        while(true){
            if(n != 1){
                if(n % 2 == 0) n /= 2;
                else return false;
            }else break;
        }
        return true;
    }
}
