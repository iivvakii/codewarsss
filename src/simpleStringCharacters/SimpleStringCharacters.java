package simpleStringCharacters;

public class SimpleStringCharacters {
    public static int[] Solve(String word) {
        int[] arr = new int[]{0, 0, 0, 0};
        char[] charArr = word.toCharArray();
        for(int i = 0; i < charArr.length; i++){
            if(Character.isUpperCase(charArr[i])){
                arr[0] += 1;
            }
            else if(Character.isLowerCase(charArr[i])){
                arr[1] += 1;
            }
            else if(Character.isDigit(charArr[i])){
                arr[2] += 1;
            }
            else{
                arr[3] += 1;
            }
        }
        return arr;

    }
}
