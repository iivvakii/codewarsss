package mumbling;

public class Mumbling {
    public static String accum(String s) {

        String res = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < i + 1; j++) {

                if (j == 0) {
                    res += String.valueOf(s.charAt(i)).toUpperCase();
                } else {
                    res += String.valueOf(s.charAt(i)).toLowerCase();
                }
            }

            if (i != s.length() - 1) {
                res += "-";
            }

        }
        return res;
    }
}
