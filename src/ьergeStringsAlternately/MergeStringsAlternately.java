package ьergeStringsAlternately;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int k = 0;
        if(word1.length() < word2.length() || word1.length() == word2.length() ){
            k = word2.length();
        }
        else{
            k = word1.length();
        }

        for(int i = 0; i < k; i++){
            if(i < word1.length()){
                s.append(word1.charAt(i));
            }
            if(i < word2.length()){
                s.append(word2.charAt(i));
            }
        }
        return s.toString();

    }
}
