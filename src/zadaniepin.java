import java.util.Scanner;

public class zadaniepin {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in); // Daczego takie ?
        final int pin= 1289;
        System.out.println("Podaj 4 cyfrowy PIN");
        int pin1 = scanner.nextInt();
        if (pin1 == pin)
        {System.out.println("Poprawny kod Pin");}
        else {System.out.println("Niepoprawny Pin");}
    }
}
