import java.util.Scanner;

public class zd2wsb {
    public static void main(String[]args){

        int liczba1;
        int liczba2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe");
        liczba1 = scanner.nextInt();

        System.out.println("podaj druga liczbe");
        liczba2 = scanner.nextInt();
        System.out.println("twoja reszta z dzielenia to " + (liczba1%liczba2));

    }
}
