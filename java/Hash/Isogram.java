import java.util.HashMap;

class Isogram {
    // att
    // methods
    public static boolean isIsogram(String str) {
        String lowerStr = str.toLowerCase();
        String arr[] = lowerStr.split("");
        HashMap<String, Integer> letters = new HashMap<>();

        if(str.length() == 0) return true;

        for (int i = 0; i < arr.length; i++) {
            if(letters.containsKey(arr[i])) return false;
            letters.put(arr[i], 1);
        }

        return true;

    }
}