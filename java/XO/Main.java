public class Main {
    public static void main(String[] args) {
        // System.out.println("I dont make mistakes");

        /*
        Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

        Examples input/output:

        XO("ooxx") => true
        XO("xooxx") => false
        XO("ooxXm") => true
        XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
        XO("zzoo") => false
        */

        String word = "xooxx";
        /*
        String upper_str = str.toUpperCase();
        int x_counter = 0;
        int o_counter = 0;

        char[] arr_str = upper_str.toCharArray();
        
        for (int i = 0; i < arr_str.length; i++) {
            // System.out.println(arr_str[i]);
            if ( arr_str[i] == 'X' ) {
                x_counter++;
            } else if ( arr_str[i] == 'O' ) {
                o_counter++;
            }
        }

        if ( x_counter == o_counter ) {
            System.out.println("Same qty");
        } else {
            System.out.println("Not same qty");
        }
        */

        // System.out.println(x_counter);
        // System.out.println(o_counter);

        // Method
        boolean ans = XO.getXO(word);
        System.out.println(ans);

        /*
        BEST PRACTICE
        public class XO {
  
        public static boolean getXO (String str) {
            str = str.toLowerCase();
            return str.replace("o","").length() == str.replace("x","").length();
            
        }
        }
         */
    }
}