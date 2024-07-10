package sum;

public class Sum {
    public int GetSum(int a, int b){
        if(a == b) return a;
        if(a < b) return loop(a, b);
        else return loop(b, a);

    }
    public int loop(int a, int b){
        int sum = 0;
        for(int i = a; i < b+1; i++){
            sum+= i;
        }
        return sum;
    }
}
