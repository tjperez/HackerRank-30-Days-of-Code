
package thirtydaysofcode;

import java.util.Scanner;

/**
 * @author temisperez
 */
public class LetReview {
    
    public static void main(String args [])
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i <= N; i++)
        {
            String myName = scanner.nextLine();
            
            char[] myCharArray = myName.toCharArray();
            for(int k = 0; k < myName.length() ;k++ )
            {
                if(k % 2 == 0)
                {
                    System.out.print(myCharArray[k]);     
                };
            }
            System.out.print(" ");
            for(int j = 0; j < myName.length(); j++)
            {
                if(j % 2 != 0)
                {
                    System.out.print(myCharArray[j]);
                }
            }
            System.out.println(" ");
        
        }    
        
    
    }
}

