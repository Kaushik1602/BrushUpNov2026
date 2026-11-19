package beginnerGuide;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    static void main(String[] args) {
        System.out.println(canConstructOptimised("abcb","babbcd"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        Map<Character, Integer> rCount = new HashMap<>();
        Map<Character, Integer> mCount = new HashMap<>();
        for(int i =0; i<magazine.length();i++){
           mCount.put(magazine.charAt(i), mCount.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i =0; i<ransomNote.length();i++){
            rCount.put(ransomNote.charAt(i), rCount.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for (char r: rCount.keySet()){
            if(!mCount.containsKey(r)){
                return false;
            }
            if(rCount.get(r)>mCount.get(r)){
                return false;
            }
        }
        return result;
    }

    public static boolean canConstructOptimised(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int i = magazine.indexOf(c, alphabet[c % 26]);
            if (i == -1) return false;
            alphabet[c % 26] = i + 1;
        }
        return true;
    }

}
