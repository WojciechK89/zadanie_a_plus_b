import java.util.Scanner;

public class odejmowanie {
    public static void main(String[] args) {


        System.out.println("dodaj dwie liczby");
        Scanner scanner = new Scanner(System.in);

        float liczba = scanner.nextFloat();
        float liczba2 = scanner.nextFloat();

        System.out.println("Wynik ="+(liczba-liczba2));
    }
}