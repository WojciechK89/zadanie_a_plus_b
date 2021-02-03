import java.util.Scanner;

public class warbez {
        public static void main(String []args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz ujemną liczbę a program obliczy jej wartość bezwzględną");
            double wb = scanner.nextDouble();

        if(wb<0)
        {wb*=-1;  // wb= wb+(-1)
            System.out.println(wb);

        }
        else{
            System.out.println(wb);
        }


           // System.out.println(Math.abs(wb));
        }








}

