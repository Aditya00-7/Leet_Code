package Array_Hashing;
import java.util.*;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Group_Anagrams solution = new Group_Anagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution.groupAnagrams(input));
    }
}


// Understanding the Problem:
//You are given a list of strings, and you need to group together words that are anagrams of each other.
//Anagram: Two words are anagrams if one word can be formed by rearranging the letters of the other.
//Example: "eat", "tea", and "ate" are anagrams because they contain the same letters.
//Your task is to return a list of lists, where each sublist contains words that are anagrams of each other.

//Approach to Solve the Problem:
//Sort Each Word:
//Anagrams have the same letters in a different order.
//Sorting the letters of a word helps in identifying anagrams easily.
//Example: "eat" → "aet", "tea" → "aet", "ate" → "aet" (same sorted version).
//Use a HashMap (Dictionary):
//Create a dictionary where:
//The key is the sorted version of the word.
//The value is a list of words that match that sorted version.
//Return the values of the dictionary:
//The values will be lists of anagram groups.

