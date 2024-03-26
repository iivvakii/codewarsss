package misleadingSigns;

public class MisleadingSigns {
    public static boolean gaslighting(String shirtWord, String yourWord, char[] friendsLetters) {

        for(int i = 0; i < shirtWord.length(); i++){
            if(shirtWord.charAt(i) != yourWord.charAt(i)){
                for(int j = 0; j < friendsLetters.length; j++){
                    if(shirtWord.charAt(i) == friendsLetters[j]){
                        return true;
                    }
                    else if(yourWord.charAt(i) == friendsLetters[j]){
                        return true;
                    }

                }
            }
        }

        return false;
    }
}
