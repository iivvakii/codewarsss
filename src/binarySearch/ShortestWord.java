package binarySearch;

public class ShortestWord {
    public static int findShort(String s) {
        String[] arr = s.split(" ");
        int l = arr[0].length();
        for(int i = 1; i < arr.length; i++){
            if(arr[i].length() < l){
                l = arr[i].length();
            }
        }
        return l;
    }
}
