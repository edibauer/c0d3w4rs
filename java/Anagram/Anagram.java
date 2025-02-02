import java.util.Arrays;

class Anagram {
    // att
    // method
    public static boolean isAnagram(String a, String b) {
        String s_sorted = "";
        String s2_sorted = "";

        char s_arr[] = a.toUpperCase().toCharArray();
        char s2_arr[] = b.toUpperCase().toCharArray();

        Arrays.sort(s_arr);
        Arrays.sort(s2_arr);

        s_sorted = new String(s_arr);
        s2_sorted = new String(s2_arr);

        if (s_sorted.contentEquals(s2_sorted)) return true;

        return false;
    }
}