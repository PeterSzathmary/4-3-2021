import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Would you like to play with GUI or without?");
        System.out.println("1. GUI");
        System.out.println("2. Non-GUI");
        System.out.print("Choose now: ");

        //int choice = Helper.getAnswer(2);
        int choice = 2;

        if (choice == 1)
            new Calculator();
        else if (choice == 2)
            new NonGUI();
    }
}
