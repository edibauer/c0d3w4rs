import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*
        An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

        Example: (Input --> Output)

        "Dermatoglyphics" --> true
        "aba" --> false
        "moOse" --> false (ignore letter case)
         */

        String str = "moOse";
        System.out.println(str.toLowerCase());
        boolean iso = Isogram.isIsogram(str);
        System.out.println(iso);

        // System.out.println(str);
        /*
        String arr[] = str.split("");

        HashMap<String, Integer> letters = new HashMap<>();

        if(str.length() == 0) {
            System.out.println(0);
        }

        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            if(letters.containsKey(arr[i])) {
                System.out.println("True");
            } 
            letters.put(arr[i], 1);
        }
        */
            

    }
}