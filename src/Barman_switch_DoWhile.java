import java.util.Scanner;

public class Barman_switch_DoWhile {
    public static void main(String args[]) {
        boolean woj = false;
        Scanner scanner = new Scanner(System.in);

         do {
             System.out.println("Podaj swój wiek");
             double bar = scanner.nextDouble();
             // boolean woj = false;  Pisz tutaj : Nie mozna dwa razy zadeklarowac tej samej zmiennej

             if ((bar < 10) && (bar >= 0)) {
                 //woj= false; /// Program się tu skonczy poniewaz zostanie wywolana liczba i wartosć została zmieniona na fałsz.
                 System.out.println("Ty możesz dostac tylko mleko");
                 woj = false;
             } else if ((bar >= 11) && (bar < 18)) {
                 System.out.println("Ty mozesz dostac sok");
                 woj = false;
             } else if (bar >= 18) {
                 System.out.println("Ty mozesz ubiegac sie o alkohol");
                 woj = false;
             } else {
                 System.out.println("Podaj wartość w cyfrach");
                // woj=true;
             }
         }while (woj);
    }
}
