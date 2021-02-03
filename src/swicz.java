import java.util.Scanner;

public class swicz {
    public static void main(String[] args) {

        System.out.println("Wybierz 1 2 3");
        Scanner scanner = new Scanner(System.in);

        int liczba = scanner.nextInt();

        switch (liczba){
            case 1:System.out.println("Sproboj jeszcze raz");

            case 2:System.out.println("A niech bd wygrales");
                break;
            case 3:System.out.println("jeszcze raz");
                break;
            default:System.out.println("wpisz 1 2 3");

        }
    }
}