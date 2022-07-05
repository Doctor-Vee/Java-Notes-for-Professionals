package hackerrank_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunWithAnagrams {

    public static void main(String[] args) {

        List<String> text = Arrays.asList("code", "doce", "ecod", "framer", "frame");
        System.out.println(funWithAnagrams(text));

    }

    public static List<String> funWithAnagrams(List<String> text) {
        // Write your code here
        List<String> textCopy = new ArrayList<>(text);

        List<String> checkedToRemain = new ArrayList<>();
        for(int i = 0; i < text.size(); i++){
            String word = text.get(i);
            char [] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String rearrangedWord = new String(charArray);
            if (checkedToRemain.contains(rearrangedWord)){
                textCopy.remove(text.get(i));
            } else {
                checkedToRemain.add(rearrangedWord);
            }
        }
        Collections.sort(textCopy);
        return textCopy;
    }
}
