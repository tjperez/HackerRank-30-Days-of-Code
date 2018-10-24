package thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author temisperez
 */
public class Arrays 
{    
    public static void main(String[] args)
    {
        System.out.println("Insert the lenght of the array: ");
        Scanner input = new Scanner(System.in);
        int arrSize = input.nextInt();
        int [] arr = new int[arrSize];
        for(int i = 0; i < arrSize ; i++)
        {
            arr[i] = input.nextInt();
        }
        input.close();
        
        //reverse the order of the array
        for (int i = arrSize - 1; i >= 0 ;i--)
        {
            System.out.print(arr[i] + " ");
        }
        
        
    }
}
