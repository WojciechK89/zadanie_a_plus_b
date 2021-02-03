import com.sun.source.tree.DoWhileLoopTree;

import java.util.Scanner;


public class dnityg {
    public static void main(String[] args) {
        System.out.println("Wybisz dzien tygodnia");
        Scanner scanner = new Scanner(System.in);

        int zestaw = scanner.nextInt();


        // String.valueOf(Integer()); poszukac jak sie konwertuje ze stringa na int
        if (zestaw > 7) {
            while (zestaw > 7) {
                zestaw = zestaw - 7;
            }
        }
        //if((zestaw>=1)||(zestaw<=5)){System.out.println("Dzien Pracujacy");}
        //else {System.out.println("Dzien wolny");}
        switch (zestaw) {


            case 1:
                //  case "8":
                // case "15":
                //case "22":
                System.out.println("Pn");

                break;
            case 2:
                System.out.println("Wt");
                break;
            case 3:
                System.out.println("Sr");
                break;
            case 4:
                System.out.println("Cz");
                break;
            case 5:
                System.out.println("Pt");
                break;
            case 6:
                System.out.println("Sb");
                break;
            case 7:
                System.out.println("Nd");
                //System.out.println("niepracujaca"); Lepiej nie robic tak
                break;
            default:
                System.out.println("nie rozrozniam tego");
                //System.out.println("Wpisz numer zestawu od 1 do 6");
                break;

        }
        if ((zestaw >= 1) || (zestaw <= 5)) {
            System.out.println("Dzien Pracujacy");
        } else {
            System.out.println("Dzien wolny");
        }
    }

}


