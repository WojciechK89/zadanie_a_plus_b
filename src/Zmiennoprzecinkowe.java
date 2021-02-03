import java.util.Scanner;

public class Zmiennoprzecinkowe {
    /*1.Napisz słow Wojtek 3 razy - skorzystaj z petli while
     */
public static void main(String args[])


    {
        boolean t=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie ");
        String y = scanner.next();
        int licznik =0;

        while (t) {
            System.out.println("Witaj " + y);
            licznik++;
            if(licznik==3){t=false;}
        }
    }

}
