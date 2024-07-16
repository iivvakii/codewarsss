package perfectSquare;

public class PerfectSquare {
    public static long findNextSquare(long sq) {
        double a;
        if(Math.sqrt(sq) % 1 == 0){
            a = Math.sqrt(sq) + 1;
            double res = a * a;
            return (long)res;
        }
        return -1;
    }
}
