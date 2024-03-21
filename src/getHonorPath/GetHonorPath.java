package getHonorPath;

public class GetHonorPath {
    public static String getHonorPath(int honorScore, int targetHonorScore) {
        if(targetHonorScore <= honorScore){
            return "";
        }
        int oneLvl = 0;
        int twoLvl = 0;

        int dif = targetHonorScore - honorScore;
        if(dif%2 == 0){
            oneLvl = dif/2;
            return String.format("2kyus: %d, 1kyus: %d", twoLvl, oneLvl);
        }
        else{
            oneLvl = dif/2;
            twoLvl = dif%2;
            return String.format("2kyus: %d, 1kyus: %d", twoLvl, oneLvl);
        }


    }
}
