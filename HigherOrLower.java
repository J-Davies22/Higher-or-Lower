import java.awt.*;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class HigherOrLower
{
   public static Scanner in = new Scanner(System.in);

    //Function for generating a random number by providing an upper bound
    //(Gives random number in between zero and specified upper bound)
    public static int generateNumber(int upperBound)
    {
        Random rng = new Random();
        return rng.nextInt(upperBound);
    }

    public static String InputCollection()
    {
        System.out.println("Select which option you think the next number will be ");
        System.out.println("1) Higher than the current number");
        System.out.println("2) Lower than the current number");
        String choice=in.nextLine();
        System.out.println(choice);
        if (Objects.equals(choice, "1"))
        {
            System.out.println("done");
            return "1";
        }
        else if (Objects.equals(choice, "2"))return "2";
        else return InputCollection();
    }


    public static void main(String[] args)
    {

        int CurrentNum=generateNumber(11);
        int PreviousNum;
        int Score=0;

        while (true)
        {
            System.out.println("The current number is: "+CurrentNum);
            PreviousNum=CurrentNum;
            CurrentNum=generateNumber(11);

            String guess = HigherOrLower.InputCollection();
            if((guess.equals("1") &&CurrentNum>PreviousNum)||(guess.equals("2") &&CurrentNum<PreviousNum))
            {
                Score++;
            }
            else break;
        }
        System.out.println("you lose :(");
        System.out.println("your score was: " + Score);
    }
}
