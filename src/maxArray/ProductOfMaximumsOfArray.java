package maxArray;

import java.util.Arrays;

public class ProductOfMaximumsOfArray {
    public static long maxProduct(int[] numbers, int sub_size)
    {
        Arrays.sort(numbers);
        long res = 1;
        for(int i = numbers.length -1; i != numbers.length - sub_size -1; i--){
            res *= numbers[i];
        }
        return res; // Do your magic!
    }
}
