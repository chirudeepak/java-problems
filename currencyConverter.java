/* 
A single double-precision number denoting .

Constraints

Output Format

On the first line, print US: u where  is  formatted for US currency.
On the second line, print India: i where  is  formatted for Indian currency.
On the third line, print China: c where  is  formatted for Chinese currency.
On the fourth line, print France: f, where  is  formatted for French currency.

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
Explanation

Each line contains the value of  formatted according to the four countries' respective currencies.*/

///code

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        String usa = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
       
        String india=NumberFormat.getCurrencyInstance(new Locale("EN","IN")).format(payment);
        
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + usa);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
