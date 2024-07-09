package creditCardMask;

public class CreditCardMask {
    public static String maskify(String str) {
//         throw new UnsupportedOperationException("Unimplemented");
        if(str.length() <= 4){
            return str;
        }
        char[] arr = str.toCharArray();
        for(int i = 0; i < str.length() - 4; i++){
            arr[i] = '#';
        }

        return new String(arr);
    }
}
