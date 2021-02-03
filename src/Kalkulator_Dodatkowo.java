import java.util.Scanner;

public class Kalkulator_Dodatkowo {

public static void main(String args[])    {
        boolean v = true;
        Scanner scanner = new Scanner(System.in);
        int licznik = 3;
    while((licznik>0)&&(v)) {
        System.out.println("Jakie działanie chcesz wykonać ");
        System.out.println("1. Odejmowanie ");
        System.out.println("2. Dodawanie ");

        int w = scanner.nextInt();

        if(w==1) {System.out.println("Wybrałeś Odejmowanie ");

            System.out.println("podaj 2 liczby ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a - b;
            if((a==0)||(b==0)) {System.out.println("nie działa "); licznik--;}
            else {System.out.println("dobrze" ); v=false;
                System.out.println("wynik to " + c);}}

        else if(w==2) {System.out.println("Wybrałeś dodawanie ");
            System.out.println("podaj 2 liczby ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a + b;
            if((a==0)||(b==0)) {System.out.println("nie działa "); licznik--;}
            else {System.out.println("dobrze" ); v=false;
                System.out.println("wynik to " + c);}}

        else {System.out.println("Wychodze");  System.exit(0);}  //tam gdize system exit tam koniec programu



        }
    }
}
