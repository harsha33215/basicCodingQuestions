
import java.util.Scanner;

public class slargest {

    static int secondLargest(int arr[]) {
        int FL = Integer.MIN_VALUE;
        int SL = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > FL) {
                SL = FL;
                FL = arr[i];
            } else if (arr[i] != FL && arr[i] > SL) {
                SL = arr[i];
            }

        }
        return SL;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = secondLargest(arr);
        System.out.println(res);

    }
}
