import java.util.Scanner;

public class dsa {
    public static void main(String[] args) {
        // rev a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        String str = sc.nextLine();
        
        System.out.println(rev(str));
    }
    static String rev(String str){
        String s = "";
        for(int i=str.length() - 1; i>=0; i--){
            s += str.charAt(i);
        }
        return s;

    }
}
