package thirtydaysofcode;

/**
 *
 * @author temisperez
 */
public class LoopPractice 
{
    public static void practiceWhileLoop()
    {
        int x = 0;
        while(x < 5)
        {
            System.out.println("The value of x is: " + x);
            x++;   
        }
    }
    
    public static void practiceDoWhileLoop()
    {
        int x = 0;
        do{
            System.out.println("The value of x is " + x);
            x++;
        }while(x < 10);
    }
    
    public static void practiceForLoop()
    {
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10 ; y++){
                System.out.println("("+x+","+y+")");   
            }
        }
    }
    
    public static void Loops(int n ){
//        for (int n; n <= 10;){
            for(int i = 1; i <=10; i++){
                System.out.println( n + " x " + i + " = " + n*i);
            
        }    
    }
    
    public static void main(String args[]){
    
       // practiceWhileLoop();
       //practiceDoWhileLoop();
        Loops(2);
    
    }
}
