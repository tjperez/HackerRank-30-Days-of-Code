package thirtydaysofcode;

/**
 *
 * @author temisperez
 */

public class Operators 
{
    public void solve(double meal_cost, int tip_percent, int tax_percent)
    {
        double tipPercent = tip_percent;
        double taxPercent = tax_percent;
        
        double total_cost = meal_cost + 
            (meal_cost * (tipPercent/100)) +
            (meal_cost * (taxPercent/100));
        
         
        System.out.println((int)total_cost);
    }
    
    public static void main(String args[])
    {
        Operators operation = new Operators();
        operation.solve(10.25, 17, 5);
        //Output = 12
        //Expected Output = 13
    }
}
