package code_signal_algorithms;

import java.util.HashSet;

/**
 * Codewriting
 *
 * 2000
 *
 * Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.
 *
 * Example
 *
 * For s = "abacabad", the output should be
 * firstNotRepeatingCharacter(s) = 'c'.
 *
 * There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.
 *
 * For s = "abacabaabacaba", the output should be
 * firstNotRepeatingCharacter(s) = '_'.
 *
 * There are no characters in this string that do not repeat.
 */
public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(firstNotRepeatingCharacter("abacabaabacaba"));
    }

    public static char firstNotRepeatingCharacter(String s) {
        HashSet<Character> seen = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            if(!s.substring(i+1).contains(String.valueOf(s.charAt(i))) && !seen.contains(s.charAt(i))){
                return s.charAt(i);
            } else {
                seen.add(s.charAt(i));
            }
        }
        return '_';
    }

}
