package GreatestCommonDivisor;

public class Compute {
    public static int compute(int x, int y) {
        if(x == 1 || y == 1) return 1;

        int num  = 0;
        if(x > y){
            num = y;
        }else if(x < y){
            num = x;
        }

        for(int i = num; i != 0; i--){
            if(x%i == 0 && y%i==0){
                return i;
            }
        }
        return 0;

    }
}
