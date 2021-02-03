import java.util.Scanner;

public class ZmiennoprzecinkoweFor {

    public static void main(String args[]) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz jak masz na imie ");
        String y = scanner.next();
        for(int i=0; i<6; i++)
        {
         System.out.println("twoje imie jest " +y);
        }
        for( int j=3; j>0; j--)
        {
         System.out.println(j +" sek");
        Thread.sleep(1000);

        }
        System.out.println("BOOM");

    }
}
