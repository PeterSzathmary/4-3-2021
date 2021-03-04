/*

Zadanie:
Vytvorte program, ktorý bude slúžiť ako kalkulačka pre 2 zadávané čísla.
V hlavnom programe bude vytvorené menu. Kde budú možnosti 1. Sčítať, 2. Odčítať, 3. Vynásobiť, 4. Vydeliť, 5. Koniec.
Po výbere jednej z možností sa zobrazí výzva na zadanie 1. a 2. čísla.
Následne sa výsledok zobrazí užívateľovi s hláškou, či chcete pokračovať.
Ak zadáte  písmeno a zobrazí sa znova menu, ak zadáte písmeno n, program skončí.
Dôležité je, aby ste na výpočty použili metódy.
Využite také metódy takého typu, ktoré sú najefektívnejšie a najvhodnejšie (nechcem zadať, či to má byť
metóda s argumentami alebo bez, či to má byť s návratovou hodnotou alebo bez). Ked Vám opravujem zadania stále
pridám komentár, kde boli chyby a prečo je to lepšie tak alebo onak. Zároveň som Vám posielal
program v pythone s obsahom a obvodom geometrických útvarov. Tým sa môžete inšpirovať.

Môže to vyzerať napr. takto:
Spocitat
Odcitat
Vynasobit
Vydelit
Koniec

Vyberte si volbu: 1

Zadaj 1. cislo: 6
Zadaj 2. cislo: 3

Sucet cisel je 9.
Chcete pokracovat [a/n]:


 */

import java.text.MessageFormat;
import java.util.Scanner;

public class NonGUI
{
    boolean isRunning;
    int choice;

    int[] numbers;

    public NonGUI()
    {
        isRunning = true;
        numbers = new int[2];
        start();
    }

    private void start()
    {
        while (isRunning)
        {
            showMenu();
            if (isRunning)
                choice = Helper.getAnswer(5);

            // -> +
            // -> -
            // -> *
            // -> /
            // end program
            switch (choice)
            {
                case 1 -> {
                    setNumbers();
                    addition(numbers[0], numbers[1]);
                    again();
                }
                case 2 -> {
                    setNumbers();
                    subtraction(numbers[0], numbers[1]);
                    again();
                }
                case 3 -> {
                    setNumbers();
                    multiplication(numbers[0], numbers[1]);
                    again();
                }
                case 4 -> {
                    setNumbers();
                    division(numbers[0], numbers[1]);
                    again();
                }
                case 5 -> isRunning = false;
            }
        }
    }

    private void division(int number, int number1)
    {
        System.out.println(MessageFormat.format("{0} / {1} = {2}", number, number1, (double) number / (double) number1));
    }

    private void multiplication(int number, int number1)
    {
        System.out.println(MessageFormat.format("{0} * {1} = {2}", number, number1, number * number1));
    }

    private void subtraction(int number, int number1)
    {
        System.out.println(MessageFormat.format("{0} - {1} = {2}", number, number1, number - number1));
    }

    private void again()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to go again? [y/n]: ");
        char again;
        do
        {
            again = scanner.next().charAt(0);
            if (again != 'y' && again != 'n')
                System.out.print("Please try again: ");
        } while (again != 'y' && again != 'n');

        if (again == 'n')
        {
            isRunning = false;
        }
    }

    private void addition(int number, int number1)
    {
        System.out.println(MessageFormat.format("{0} + {1} = {2}", number, number1, number + number1));
    }

    private void setNumbers()
    {
        System.out.print("Enter 1. number: ");
        numbers[0] = Helper.getInt();
        System.out.print("Enter 2. number: ");
        numbers[1] = Helper.getInt();
    }

    private void showMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        System.out.println("5. exit");
        System.out.print("Choose now: ");
    }


}
