import java.util.Scanner;

public class Kalkulator {
    public static void main(String args[]) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
        System.out.println("POodaj opcje jaka checesz wykonac : ");
        System.out.println("1. Dodawanie ");
        System.out.println("2. Odeejmowanie ");
        System.out.println("3. Mnozenie : ");
        System.out.println("4. Dzielenie : ");
        System.out.println("5. Exit : ");

        int c = scanner.nextInt();

        if(c==5){System.out.println("Sproboj jeszcze raz ");

        System.exit(0);}  //zakancza dzialanie programu



        System.out.println("Podaj dwie cyfry");

        float a = scanner.nextFloat();
        float b= scanner.nextFloat();

        // w switchu  nie moze byc float double



            switch (c) {
                case 1:
                    System.out.println("wynik dodawania to " + (a+b));
                    Thread.sleep(2000);   //ufnkcja czasu
                    break;
                case 2:
                    System.out.println("wynik odejmowania to " + (a-b));
                    break;
                case 3:
                    System.out.println("wynik mnozenia to " + (a*b));
                    break;
                case 4:
                    System.out.println("wynik dzielniea to " + (a/b));
                    break;
                case 5:
                    System.out.println("Wyszedles z programu");
                    x=false;
                    break;
                default:
                    System.out.println("Podano nieprawdiłową wartośc");
                    break;
            }

        }
    }
}

