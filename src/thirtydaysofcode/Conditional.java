package thirtydaysofcode;

/**
 *
 * @author temisperez
 */
public class Conditional {
    
    public String conditionals(int n)
    {
        //int n = 0;
    
        if (n % 2 != 0)
        {   return "Weird"; }
        //{   System.out.println("Weird");}  
        
        else if (n % 2 == 0 && (n >= 2 && n <= 5)) 
        {   return "Not Weird"; }
        //{   System.out.println("Not Weird");}
            
        else if (n % 2 == 0 && (n >=6 && n <= 20))
        {   return "Weird"; }
        //{   System.out.println("Weird");}
            
        else if (n % 2 == 0 && n > 20)
        {   return"Not Weird";   }
        //{   System.out.println("Not Weird");}
        return null;
    }
    
    public static void main(String args[])
    {
        Conditional practice = new Conditional();
        System.out.println(practice.conditionals(3));
        System.out.println(practice.conditionals(24));
    }
}
