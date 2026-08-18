import java.util.*;

public class Day03_Strings {
    public static void main(String[] args) {

        String s = "level";
        System.out.println("Palindrome? " + isPalindrome(s));
        System.out.println("Frequencies: " + frequency("banana"));

    }

    static boolean isPalindrome(String s){ int l=0,r=s.length()-1; while(l<r) if(s.charAt(l++)!=s.charAt(r--)) return false; return true; }
static Map<Character,Integer> frequency(String s){ Map<Character,Integer> m=new LinkedHashMap<>(); for(char c:s.toCharArray()) m.put(c,m.getOrDefault(c,0)+1); return m; }

}
