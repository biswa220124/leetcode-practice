import java.lang.reflect.Array;
import java.util.Arrays;

public class annagram {
    public static boolean isAnnagram(String s, String t){
        s = s.replaceAll("\\s+","");
        t = t.replaceAll("\\s+","");

        if(s.length()!=t.length()){
            return false;
        }else{
            char c[] = s.toLowerCase().toCharArray();
            char d[] = t.toLowerCase().toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);
            return Arrays.equals(c,d);
        }
    }

    public static void main(String[] args) {
        String s = "Silent";
        String t = "Listen";
       boolean x = isAnnagram(s,t);
       if(x){
           System.out.println("Given word is anagram");
       }
    }
}
