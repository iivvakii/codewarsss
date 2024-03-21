package digitsExplosion;

public class DigitsExplosion {
    public static String explode(String digits) {
        StringBuilder result = new StringBuilder();
        String[] arr = digits.split("");
        result.append("");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < Integer.parseInt(arr[i]); j++){
                result.append(digits.charAt(i));
            }
        }
        return result.toString();
    }
}
