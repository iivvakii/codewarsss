package incrementer;

public class Incrementer {
    public static int[] incrementer(int[] numbers) {
        if(numbers.length == 0){
            return new int[]{};
        }
        for(int i = 0, j = 1; i < numbers.length; i++, j++){

            if(numbers[i] + j >= 10){
                numbers[i] = (numbers[i] +j) % 10;
            }
            else{
                numbers[i] += j;
            }
        }

        return numbers; // replace with your code ..
    }
}
