import java.util.Scanner;

public class Test_Loop {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int i =0;
        boolean b = true;
       // for( i=0; i<3; i++) {
        while (b){
            System.out.println("Podaj swoje imie");

            String w = scanner.next();

            System.out.println("Witaj " + w);
            if(i<=3) { i++;}
            else b=false;
        }
         System.out.println("koniec");
    }
}
