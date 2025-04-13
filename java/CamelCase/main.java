public class main {
    public static void main(String[] args) {
        /*
         Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
            Examples
            "the-stealth-warrior" gets converted to "theStealthWarrior"

            "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

            "The_Stealth-Warrior" gets converted to "TheStealthWarrior"

         */

        String str = "The_Stealth-Warrior";
        char arr_str[] = str.toCharArray();
        // String new_str = "";
        int flag = 0;
        String ans = "";

        /*
        // validate frist letter
        char first_letter = arr_str[0];
        if ( first_letter == Character.toUpperCase(first_letter) ) {
            System.out.println("same");
        } else {
            System.out.println("Not the same");
        }
        
        // new_str += Character.toString(arr_str[0]);
        // System.out.println(new_str);

        // validate continue score or underscore
        for (int i = 0; i < arr_str.length; i++) {
            
            if ( arr_str[i] == '-' || arr_str[i] == '_' ) {
                flag = 1;
                System.out.println(flag);
                continue;
            } else {
                flag = 0;
                System.out.println(arr_str[i]);
                System.out.println(flag);
            }   
        }
        */

        /*
        // main
        for (int i = 0; i < arr_str.length; i++) {
            // First letter
            
            if ( i == 0 ) {
                char first_letter = arr_str[i];
                if ( first_letter == Character.toUpperCase(first_letter) ) {
                    new_str += Character.toString(Character.toUpperCase(arr_str[i]));
                } else {
                    new_str += Character.toString(arr_str[0]);
                }
            }
            

            // validate score, underscore
            if ( arr_str[i] == '-' || arr_str[i] == '_' ) {
                flag = 1;
                // System.out.println(flag);
                continue;
            }

            if ( flag == 0 ) {
                new_str += Character.toString(arr_str[i]);
            } else if ( flag == 1 ) {
                new_str += Character.toString(Character.toUpperCase(arr_str[i]));
                flag = 0;
            }

        }

        System.out.println(new_str);
        */

        // method
        ans = CamelCase.toCamelCase(str);
        System.out.println(ans);


    }
}