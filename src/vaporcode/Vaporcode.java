package vaporcode;

public class Vaporcode {
    public static String vaporcode(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(i == s.length() - 1){
                result.append(Character.toUpperCase(s.charAt(i)));
            }
            else if(s.charAt(i)==' '){
                continue;
            }
            else{
                result.append(Character.toUpperCase(s.charAt(i)));
                result.append("  ");
            }
        }
        return result.toString();
    }
}
