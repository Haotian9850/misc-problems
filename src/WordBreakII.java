import java.util.*;

public class WordBreakII {
    /*
    * Word break II: return all possible breaking combinations
    * */

    public static List<String> findAll(String s, Set<String> dict){
        //find all possible combinations
        //DP with mem approach
        //used HashMap<String, List<String>> as cache for better runtime
        return DFS(s, dict, new HashMap<>());
    }

    private static List<String> DFS(String sentence, Set<String> dict, HashMap<String, List<String>> cache){
        if(cache.containsKey(sentence)){
            return cache.get(sentence);
        }
        List<String> tempResult = new ArrayList<>();
        for(String word : dict){
            if(sentence.startsWith(word)){
                String nextSen = sentence.substring(word.length());
                //check return condition here!
                if(nextSen.length() == 0){
                    tempResult.add(word);
                }else{
                    List<String> resultList = DFS(nextSen, dict, cache);
                    for(String i : resultList){
                        tempResult.add(word + " " + i);
                    }
                }
            }
        }
        //update mem
        cache.put(sentence, tempResult);
        return tempResult;
    }

    public static void main(String[] args){
        Set<String> dict = new HashSet<>(Arrays.asList("cats", "cat", "and", "sand", "dog"));
        List<String> result = findAll("catsanddog", dict);
        for(String s : result){
            System.out.print(s);
        }
    }
}
