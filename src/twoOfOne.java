import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.*;

public class twoOfOne {
    public static String longest (String s1, String s2) {
        String res = "";
        s1 += s2;
        char[] arr = s1.toCharArray();
        sort(arr);
        s1 = new String(arr);
        while(s1.length() != 0){
            res += s1.charAt(0);
            s1 = s1.replaceAll(String.valueOf(s1.charAt(0)), "");
        }
        return res;
    }
}
