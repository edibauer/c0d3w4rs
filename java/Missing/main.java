public class main {
    public static void main(String[] args) {
        int arr[] = {35, -7, -49, -91, -133, -175, -217, -259, -301, -343, -385, -469, -511, -553, -595, -637, -679, -721, -763, -805, -847, -889, -931};
        int diff = 0;
        int step = 0;

        // if (arr[arr.length - 1] == arr[0]) return arr[0];

        // math
        step = (arr[arr.length - 1] - arr[0]) / arr.length;
        // System.out.println(arr[arr.length - 1] - arr[0]);
        // System.out.println(arr.length);
        // System.out.println(step);

        /*
        for (int i = 0; i < arr.length; i++) {
            diff = arr[i] + step;

            if(arr[i + 1] == diff) {
                System.out.println("equal");
            } else {
                System.out.println("Not equal");
                System.out.println(diff);
                break;
            }
        }
        */

        int ans = Missing.findMissing(arr);
        System.out.println(ans);
        
    }
}