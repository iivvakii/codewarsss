package youreASquare;

public class BaseballGame {
    public int calPoints(String[] operations) {
        List<Integer> arr = new ArrayList<>();
        int sum = 0;
        for(String e : operations){
            if(e.equals("D")) {
                if(!arr.isEmpty()){
                    int a = arr.size() - 1;
                    arr.add(arr.get(a)*2);
                }
            }else if(e.equals("C")){
                if(!arr.isEmpty()){
                    int a = arr.size() - 1;
                    arr.remove(arr.get(a));
                }

            }else if(e.equals("+")){
                if(arr.size() > 1){
                    int a = arr.size() - 1;
                    int b = arr.size() - 2;
                    arr.add(arr.get(a)+arr.get(b));
                }
            }else{
                int num = Integer.parseInt(e);
                arr.add(num);
            }
        }

        for(Integer q : arr){
            sum += q;
        }
        return sum;
    }
}
