package Strings;

import java.util.Scanner;

/**
 *
 * @author temisperez
 */
public class CamelCase 
{
    static int camelcase(String s) 
    {
        int count = 1;
        // loop that goes through the length of s... 
        for (int i = 0; i < s.length(); i++) 
        {
            //variable that holds each char...
            char c = s.charAt(i);
            // if char c is upper case increase the count else keep lopping...
            if (c == Character.toUpperCase(c)) 
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        System.out.println(camelcase(s));
    }
}
