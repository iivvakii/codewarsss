package ownedCatAndDog;

public class CatYearsDogYears {
    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int cat = catYears;
        int dog = dogYears;
        int k = 0;
        int j = 0;
        int[] arr = new int[]{15, 9, 4, 5};


        for(int i = 0; i < arr.length; i++){
            if(i == 2){
                cat /= arr[i];
                dog /= arr[i+1];
                if(cat < 0){
                    cat = 0;
                }
                if(dog < 0){
                    dog = 0;
                }
                return new int[]{k+cat, j+dog};
            }
            cat -= arr[i];
            dog -= arr[i];
            if(cat < 0){}else k++;

            if(dog < 0){}else j++;


        }



        return new int[]{k, j};
    }
}
