import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Delete {
    // attr
    // method
    public static int[] deleteNth(int[] elements, int maxOcc){
        List<Integer> arr_num = new ArrayList<>();
        int counter = 0; // less equal occ
        int shuwei = 0;

        for (int i = 0; i < elements.length; i++ ) {
            shuwei = elements[i];
            for (int j = 0; j < i; j++) {
                if (shuwei == elements[j]) counter += 1;
            }
            
            if(counter < maxOcc) {
                arr_num.add(shuwei);
                counter = 0;
            } else {
                counter = 0;
                continue;
            }
        }

        // Convert the ArrayList<Integer> to an int[]
        int[] result = new int[arr_num.size()];
        for (int i = 0; i < arr_num.size(); i++) {
            result[i] = arr_num.get(i); // Unboxing Integer to int
        }

        return result;
    }
}