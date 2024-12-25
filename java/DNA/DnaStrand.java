public class DnaStrand {
    // att
    // method
    public static String makeComplement(String dna) {
        char[] strArr = dna.toCharArray();

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

        return String.valueOf(strArr);
    }
}
