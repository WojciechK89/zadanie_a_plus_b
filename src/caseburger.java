import java.util.Scanner;

public class caseburger {

    public static void frytki(String zestaw1){

        if (zestaw1.equals("2"))
            System.out.println("Sold and chips");
        else
            System.out.println("No sole");
    }
    public static double frytki2(int a, int b){
        double c = a/b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Wybierz Zestaw wpisując numer");
        Scanner scanner = new Scanner(System.in);

        String zestaw = scanner.next();

        switch (zestaw) {
            case "1":
            case "89":
                int i=Integer.parseInt(zestaw);
                if(i==89)
                System.out.println("poprosze bez ketchupu");
                //System.out.println("poprosze");// Nie mozna dawac dwoch wymagan bez wąsa
                else
                    System.out.println("Z  ketchupem dawaj babo");
                break;
            case "2":
            case "45":
                frytki(zestaw);
                break;
            case "3":
                System.out.println("Zestaw 3");
                break;
            case "4":
                System.out.println("Zestaw 4");
                break;
            case "5":
                System.out.println("Zestaw 5");
                break;
            case "6":
                System.out.println("Zestaw 6");
                System.out.println(frytki2(2,7));

            default: System.out.println("zle");
            }


        }
    }
