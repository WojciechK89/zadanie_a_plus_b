import java.util.Scanner;

public class imie {
    public static void main(String[] args) {

        System.out.println("podaj imie");
        Scanner scanner = new Scanner(System.in);

        String imie = scanner.nextLine();


        System.out.println("Witaj "+(imie));
        System.out.println("Twoje ime ma długość "+(imie.length()) + " znakow");

        System.out.println("Twoje ime ma długość "+(imie.toLowerCase()) + " znakow");
        System.out.println("Twoje ime ma długość "+(imie.toUpperCase()) + " znakow");
        System.out.println("Twoje ime ma długość "+(imie.charAt(2)) + " znakow");

    }
}