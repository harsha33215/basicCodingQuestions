
import java.util.Scanner;

public class factorial {
    static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
        
    }
    public static void main(String[] args) {
        // find the factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println(res);
    }
}
