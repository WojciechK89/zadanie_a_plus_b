import java.util.Scanner;

public class Barman_zadanie_While_trzyzleodp {
    public static void main(String args[]) {
        boolean woj = true;   //false program sie nie wykona poniewaz nie jest spełniony. // przywhile i prawie zawsze boolean musi byc ustawiony na tru zeby porownywac wartosci a true jest dla tego zeby przyjmowac wartość tak jakby dodatnia ponieawz ujemna nie wykona sie +;
        Scanner scanner = new Scanner(System.in);
        int licznik = 3;
        while ((woj)&&(licznik>0)) {
            System.out.println("Podaj swój wiek");
            double bar = scanner.nextDouble();
            // boolean woj = false;  Pisz tutaj : Nie mozna dwa razy zadeklarowac tej samej zmiennej

            if ((bar < 10) &&(bar>=0)) {
                //woj= false; /// Program się tu skonczy poniewaz zostanie wywolana liczba i wartosć została zmieniona na fałsz.
                System.out.println("Ty możesz dostac tylko mleko");
                woj= false;
            } else if ((bar >= 11) && (bar < 18)) {
                System.out.println("Ty mozesz dostac sok");
                woj= false;
            } else if (bar >= 18) {
                System.out.println("Ty mozesz ubiegac sie o alkohol");
                woj= false;
            } else {
                System.out.println("Podaj wartość w cyfrach");
                licznik--;
                System.out.println("zostało ci prób : " + licznik);
            }

        }

    }
}


