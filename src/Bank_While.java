import java.util.Scanner;

public class Bank_While {


//Mam podac pin z trzema probami// Na while mam to zrobic.

public static void main(String args[])
{
    Scanner scanner = new Scanner(System.in);

    int PIN=1234;
    boolean x = true;
    int licznik = 0;

    while ((licznik<3)&&(x)) {
    System.out.println("Podaj pin");
        int o = scanner.nextInt();

       if (PIN == o)
           { System.out.println("Poprawny Pin");
           x=false; }
       else { System.out.println("zly pin");

      licznik ++;
       System.out.println("To był proba "+ licznik);}
   }
    if (licznik == 3)System.out.println("zaablokowana karta");
}
}
