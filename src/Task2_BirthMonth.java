import java.util.Scanner;

/**
 *
 * @author wulft
 */
public class Task2_BirthMonth 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0; // should be 1 to 12
        String newLine = "";
        String trash = "";
        // Input the item price
        System.out.print("Enter the month you were born (1-12): ");
        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            newLine = in.nextLine();
            if(birthMonth < 1 || birthMonth > 12)
            {
                System.out.println("You told me you were born in an illegal month: " + birthMonth);
            }
            else
            { 
                System.out.println("You told me you were born in " + birthMonth);
                
            }
            
        }
        else
        {
           trash = in.nextLine();
           System.out.println("You must enter a valid month 1-12: " +  trash);
        }
    }
    
}
