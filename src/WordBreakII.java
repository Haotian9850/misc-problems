import java.util.List;
import java.util.Set;

public class WordBreakII {
    /*
    * Word break II: return all possible breaking combinations
    * */

    public static List<String> split(Set<String> dict, String sentence){
        //DFS approach
    }

    private void DFS(List<String> result, List<String> temp, Set<String> dict, String sentence){
        //return condition
        if(sentence == ""){
            StringBuilder tempResult = new StringBuilder();
            for(String s : temp){
                tempResult.append(s + " ");
            }
            result.add(tempResult.toString());
        }
        for(String word : dict){

        }
    }
}
