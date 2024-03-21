package stonePick;

public class StonePick {
    public static int stonePick(String[] arr) {
        if(arr.length == 0){
            return 0;
        }
        int cobblestone = 0;
        int sticks = 0;
        int wood = 0;

        for(String item : arr){
            if(item == "Cobblestone"){
                cobblestone++;
            }else if(item == "Sticks"){
                sticks++;
            }else if(item == "Wood"){
                wood++;
            }
        }

        if(wood < 1 && sticks < 2){
            return 0;
        }
        else if(cobblestone < 3){
            return 0;
        }
        wood *= 4;
        sticks += wood;
        sticks /= 2;
        cobblestone /= 3;
        if(cobblestone < sticks){
            return cobblestone;
        }else{
            return sticks;
        }


    }
}
