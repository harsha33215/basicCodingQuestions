
import java.util.Scanner;

public class pal {

    public static void main(String[] args) {
        // check it is palindrome or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        String str = sc.nextLine();
        boolean res = palind(str);
        if (res) {
            System.out.println(" It is a palindrome");
        } else {
            System.out.println(" it is not a palindrome");
        }

    }

    static boolean palind(String str) {
        StringBuilder sb = new StringBuilder(str);
        String result = sb.reverse().toString();
        return str.equals(result);
    }
}
