import java.util.Scanner;

public class ifscanner {
    public static void main(String[] args){

        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);

        int liczba = scanner.nextInt();
        if (liczba > 4){
            System.out.println("Większe od zera");
            if(liczba%2 == 0)
            {System.out.println("Liczba parzysta");}
            if(liczba%2 > 0)
            {System.out.println("Liczba nieparzysta");}
        }
        else{System.out.println("Mniejsze od zera");}
    }
}