import java.util.Scanner;

public class Test_Switch {
    public static void main(String args[]){

    boolean h = true;
    int licznik = 0;

    {
        while ((licznik<2)&&(h)) {

            System.out.println("Podaj swoje imie");
            Scanner scanner = new Scanner(System.in);
            String x = scanner.next();
          //  System.out.println("Cześć " + x);
            //h=false;

          //  System.out.println("to jest próba " + licznik);

            if(x.equals("ela")) {System.out.println("Wpisz imie ponownie " + (licznik +1) + " próba");licznik++;}
            else {System.out.println("twoje imie to " + x);
            h=false;}


        }
        }
    }

}
