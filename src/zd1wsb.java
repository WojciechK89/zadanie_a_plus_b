import java.util.Scanner;

public class zd1wsb {
    public static void main(String[]args){

        System.out.println("Podaj imię bez Nazwiska");
        Scanner scanner = new Scanner(System.in);
        String nazwa = scanner.nextLine();


        System.out.println("Twoje imię ma " +(nazwa.length()) + " znaków");
    }
}
