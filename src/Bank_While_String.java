import java.util.Scanner;

public class Bank_While_String {


//Mam podac pin z trzema probami// Na while mam to zrobic.

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        String PIN="opl";
        boolean x = true;
        int licznik = 0;

        while ((licznik<3)&&(x)) {
            System.out.println("Podaj pin");
            String o = scanner.next();
// jesli porownujemy stringi to korzystamy z metody equls
            if (PIN.equals(o))
            { System.out.println("Poprawny Pin");
                x=false; }
            else { System.out.println("zly pin");

                licznik ++;
                System.out.println("To był proba "+ licznik);}
        }
        if (licznik == 3)System.out.println("zaablokowana karta");
    }
}
