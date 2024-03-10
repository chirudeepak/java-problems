###Anagrams###

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!=b.length())
            return false;
        int charcount[] = new int[256];
        for(char c:a.toCharArray())
            charcount[(int)c]++;
        for(char c:b.toCharArray())
            charcount[(int)c]--;
        for(int n:charcount)
        {
            if(n!=0)
                return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
