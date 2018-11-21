import java.util.*;

public class FindWords {
    /*Given a string and a dictionary of words, find all words in the string (can have overlap)*/

    public static List<String> findWord(String sentence, Set<String> dict){
        //use build-in indexOf function
        List<String> result = new ArrayList<>();
        for(String word : dict){
            if(sentence.indexOf(word) != -1){
                result.add(word);
            }
        }
        return result;
    }

    public static void main(String[] args){
        String sentence = "The chore of searching for a pattern of characters, or a word, " +
                "in a larger text string is done in various fields. In bioinformatics, for example, " +
                "we may need to find a DNA snippet in a chromosome";
        List<String> dictList = Arrays.asList("chore", "example", "DNA", "snippet", "done", "fields", "none", "null",
                "Jesus", "mayOrMayNot", "Golden retriever", "Samoyed");
        Set<String> dict = new HashSet<>(dictList);
        List<String> result = findWord(sentence, dict);
        for(String s : result){
            System.out.println(s);
        }
    }

}
