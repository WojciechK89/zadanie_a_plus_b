import java.util.Scanner;

public class DoWhile {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        boolean rts = false;
        int PIN = 3456;
        int licznik=0;

        do{
            System.out.println("Wprowadź numer pin");
            int kod = scanner.nextInt();


            if (kod == PIN) {
                System.out.println("Wprowadziłeś poprawny pin ");
                rts=false;
                //System.exit(0);                               //całkowite zakonczenie programu
            } else {
                System.out.println("Niepoprawny pin to jest twoja próba " +(licznik+1));licznik++;}
            // else (licznik==3) {System.out.println("Wykorzystaałeś swoje syzstkmoe proby");}

        } while ((licznik<3)&&(rts));


        // System.out.println("Test"); //to jest testowe do debugowania


    }

}


