import java.util.Scanner;

public class ifgra {
    public static void main(String[] args) {

        System.out.println("Wybierz 1 2 3");
        Scanner scanner = new Scanner(System.in);

        int liczba = scanner.nextInt();
        if(liczba == 1){
            System.out.println("Sproboj jeszcze raz");
        }
        else if(liczba ==2){
            System.out.println("Jeszcze raz probój");
        }
        else if(liczba ==3){
            System.out.println("Wygrałes talon");
        }
        else {
            System.out.println("Podaj 1 lub 2 lub 3");
        }


    }
}