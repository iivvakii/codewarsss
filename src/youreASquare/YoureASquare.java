package youreASquare;

public class YoureASquare {
    public static boolean isSquare(int n) {
        if(n < 0 ){
            return false;
        }
        else if(n == 0){
            return true;
        }
        double res = Math.sqrt(n);
        int r = (int) res;
        if((double)r == res){
            return true;
        }else return false;

    }
}
