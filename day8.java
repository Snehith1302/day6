import java.util.ArrayList;
import java.util.List;

public class day8 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int a=candies[0];


        for(int i=1;i<candies.length;i++){
            if(a<candies[i]){
                    a=candies[i];

            }
        }
        List <Boolean> result=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=a){
                    result.add(true);
            }
            else{
                result.add(false);
            }
        }return result;
    }
}

