import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;
import java.util.Scanner;

//This code will take names and times from the user and print the running order.
public class runnerrecord
{
    public static void main(String[] args)
    {

        //This section is where we get user's names and times.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter runner's name:");
        String runnerOne = keyboard.nextLine();
        System.out.println("Enter runner's time in minutes:");
        int runnerOneTime = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter runner's name:");
        String runnerTwo = keyboard.nextLine();
        System.out.println("Enter runner's time in minutes:");
        int runnerTwoTime = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter runner's name:");
        String runnerThree = keyboard.nextLine();
        System.out.println("Enter runner's time in minutes:");
        int runnerThreeTime = keyboard.nextInt();

        //1, 2, 3
        if (runnerOneTime <= runnerTwoTime && runnerTwoTime <= runnerThreeTime)
        {
            System.out.println("The running order is: " + runnerOne + ", " +
                                runnerTwo + ", " + runnerThree);
        }
        //2, 3, 1
        else if (runnerTwoTime <= runnerThreeTime && runnerThreeTime <= runnerOneTime)
        {
            System.out.println("The running order is: " + runnerTwo + ", " +
                                runnerThree + ", " + runnerOne);
        }
        //1, 3, 2
        else if (runnerOneTime <= runnerThreeTime && runnerThreeTime <= runnerTwoTime)
        {
            System.out.println("The running order is: " + runnerOne + ", " +
                                runnerThree + ", " + runnerTwo);
        }
        //3, 1, 2
        else if (runnerThreeTime <= runnerOneTime && runnerOneTime <= runnerTwoTime)
        {
            System.out.println("The running order is: " + runnerThree + ", " +
                                runnerOne + ", " + runnerTwo);
        }
        //2, 1, 3
        else if (runnerTwoTime <= runnerOneTime && runnerOneTime <= runnerThreeTime)
        {
            System.out.println("The running order is: " + runnerTwo + ", " +
                                runnerOne + ", " + runnerThree);
        }
        //3, 2, 1
        else
        {
            //This section of code will print out the running order from fastest to slowest.
            System.out.println("The running order is: " + runnerThree + ", " +
                                runnerTwo + ", " + runnerOne);
        }

        keyboard.close();
    }
}
