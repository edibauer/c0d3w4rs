public class Missing {
    // att
    // method
    public static int findMissing(int[] numbers) {
        int diff = 0;
        int step = 0;

        if (numbers[numbers.length - 1] == numbers[0]) return numbers[0]; // same value in the entire array

        step = (numbers[numbers.length - 1] - numbers[0]) / numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            diff = numbers[i] + step;

            if(numbers[i + 1] == diff) {
                continue;
                // System.out.println("equal");
            } else {
                // System.out.println("Not equal");
                // System.out.println(diff);
                // break;
                break;
            }
        }

        return diff;
    }
}