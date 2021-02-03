import java.util.Scanner;

public class metody {
    public static void Odejmowanie(double a, double b){
    System.out.println(a-b);
    }
    public static void Dodawanie(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("co chesz zrobić dodawanie czy odejmowanie");
        String dzialanie = scanner.nextLine();
        if (dzialanie.equals("odejmowanie")){

            System.out.println("Podaj dwie cyfry");

        double liczba1 = scanner.nextDouble();
        double liczba2 = scanner.nextDouble();

        Odejmowanie(liczba1, liczba2);
    } else if (dzialanie.equals("dodawanie")) {

            System.out.println("Podaj dwie cyfry");

            int liczpa1 = scanner.nextInt();
            int liczpa2 = scanner.nextInt();

            Dodawanie(liczpa1, liczpa2);
        }
        else {System.out.println("Niepoprawne");}
    }


}