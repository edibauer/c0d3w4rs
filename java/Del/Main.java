import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int numbers[] = {20, 37, 20, 21};
        List<Integer> arr_num = new ArrayList<>();
        int occ = 1;
        int counter = 0; // less equal occ
        int shuwei = 0;

        /*
        for (int i = 0; i < numbers.length; i++ ) {
            shuwei = numbers[i];
            for (int j = 0; j < i; j++) {
                if (shuwei == numbers[j]) counter += 1;
            }
            
            if(counter < occ) {
                arr_num.add(shuwei);
                counter = 0;
            } else {
                counter = 0;
                continue;
            }
        }
        */

        int[] n = Delete.deleteNth(numbers, occ);
        System.out.println(Arrays.toString(n));


    }
}