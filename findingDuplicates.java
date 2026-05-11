
import java.util.HashMap;

// 1. Write a program in java to find a duplicate character.
public class findingDuplicates {

    public static void main(String[] args) {
         String str = "hhlo";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch: str.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch, 0) + 1);

        }

        for(char c: hm.keySet()){
            if(hm.get(c) == 1){
                System.out.println(c  + " -> " + hm.get(c));
            }
        }
    }

}
