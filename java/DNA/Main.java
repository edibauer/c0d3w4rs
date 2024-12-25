public class Main {
    public static void main(String[] args) {
        
        /*
        Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

        If you want to know more: http://en.wikipedia.org/wiki/DNA

        In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

        More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

        Example: (input --> output)

        "ATTGC" --> "TAACG"
        "GTAT" --> "CATA"
         */

        String str = "GTAT";
        // char[] strArr = str.toCharArray();
        
        // System.out.println(str.length()); --4
        /*/
        for (int i = 0; i < strArr.length; i++) {
            // System.out.println(strArr[i]); GTAT
            if (strArr[i] == 'G') {
                strArr[i] = 'C';
            } else if (strArr[i] == 'T') {
                strArr[i] = 'A';
            } else if (strArr[i] == 'C') {
                strArr[i] = 'G';
            } else if (strArr[i] == 'A') {
                strArr[i] = 'T';
            }
        }
        */

        /*
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
        */

        String ans = DnaStrand.makeComplement(str);
        System.out.printf("%s", ans);

    }
}