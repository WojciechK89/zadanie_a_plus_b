import java.util.Scanner;

public class Kalendarz {
    public static void main(String args[]) {
        boolean k = true;
        Scanner scanner = new Scanner(System.in);


        while (k) {
            System.out.println("Wpisz dzien tygodnia ");
            int kal = scanner.nextInt();
            //kal/=7;
            switch (kal) {
                case 1:
                case 3:
                case 5:
                    System.out.println("Ten dzien jest Nieparzysty");
                    k=false;
                    break;
                case 2:
                case 4:
                    System.out.println("Ten dzien jest parzysty");
                    k=false;
                    break;
                //case3:
                //   System.out.println("Ten dzien jest nieparzysty");
                // break;
//case5:

                //System.out.println("Ten dzien to parzysty");
                // break;
//case5:

                //System.out.println("Ten dzien jest nieparzysty");
                // break;
                case 6:
                    System.out.println("Sobota");
                    break;
                case 7:
                    System.out.println("Niedziela");
                    break;
                default:
                    System.out.println("Podałes zla cyfre podaj od 1 do 7");
                   // k=false;
            }
            if ((kal >= 1) && (kal <= 5)) {
                System.out.println("Dzien pracujacy");
            } else if (kal == (6) || kal == (7)) {
                System.out.println("dzien niepracujący");
            }
            //else System.out.println("zla wartosc");

        }
    }
}
