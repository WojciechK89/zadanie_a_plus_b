import java.util.Scanner;

public class dodawanie {
    public static void main(String[] args) {


        System.out.println("dodaj dwie liczby");
        Scanner scanner = new Scanner(System.in);

        int liczba = scanner.nextInt();
        int liczba2 = scanner.nextInt();

        System.out.println("Wynik ="+(liczba+liczba2));
    }
}