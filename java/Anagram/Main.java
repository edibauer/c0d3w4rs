import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).

        Note: anagrams are case insensitive

        Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.

        Examples
        "foefet" is an anagram of "toffee"

        "Buckethead" is an anagram of "DeathCubeK"
         */

        String str = "Buckethead";
        String str2 = "DeathCubeK";
        String s_sorted = "";
        String s2_sorted = "";
        // String str_arr[] = str.split("");
        // String str_arr2[] = str2.split("");
        /*
        char s_arr[] = str.toUpperCase().toCharArray();
        char s2_arr[] = str2.toUpperCase().toCharArray();

        Arrays.sort(s_arr);
        Arrays.sort(s2_arr);

        s_sorted = new String(s_arr);
        s2_sorted = new String(s2_arr);

        System.out.println(s_sorted.contentEquals(s2_sorted));
        
        System.out.println(s_sorted);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(s_arr[i]);
        }
        */
        boolean ans = Anagram.isAnagram(str, str2);
        System.out.println(ans);

        
    }
}