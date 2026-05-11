
import java.util.Scanner;

public class impPlaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input value");
        String str = sc.nextLine();
        boolean res = isPalin(str);
        if(res){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }

    }
    static boolean isPalin(String str){
        int left =0 , right = str.length()-1;
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        left ++;
        right --;
        return true;
    }
}
