package drivingage;
import java.util.Scanner;

public class DrivingAge
{
    public static void main(String[] args)
    {
        // Set up Scanner and welcome user.
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!  This program will help you figure out if you're old enough to drive.");
        
        // Get user's age.
        System.out.print("What is your age? ");
        int age = input.nextInt();
        
        // Output whether or not user can drive.
        if (age > 15)
        {
            System.out.println("You can drive!");
        }
        else if (age == 15)
        {
            System.out.println("You can drive with a permit!");
        }
        else if (age == 14)
        {
            System.out.println("You can drive with a farm permit!");
        }
        else
        {
            System.out.println("You cannot drive...yet!");
        }
        
        System.out.println("Thanks for using our program!");
    }
}
