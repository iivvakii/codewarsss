package printerErrors;

public class PrinterErrors {
    public static String printerError(String s) {

        int k = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='m'){
                continue;
            }else k++;
        }
        return String.format("%d/%d", k, s.length());
    }
}
