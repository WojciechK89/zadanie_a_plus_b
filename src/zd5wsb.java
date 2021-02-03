import java.util.Scanner;

public class zd5wsb{

    public static void main(String[]args) {
        final String dog = "pies";
        final String kot = "kot";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Rodzaj zwierzęcia");
        String rodzaj = scanner.nextLine();
        if ((rodzaj.equals("pies")) || (rodzaj.equals("kot")))  // jesli rodzj jest pies lub kot to spytamy cie o imie

            System.out.println("Jak ma na imie twoje zwierze?");
        String imie = scanner.nextLine();
        ////////////////////////////
        if (rodzaj.equals(dog)) {
            System.out.println("Twój pies ma na imię " + imie);

        } else if (rodzaj.equals("kot")) {
            System.out.println("Twój kot ma na imie " + imie);
        } else {
            System.out.println("Zły rodzaj zwierzęcia możesz podać psa lub kota");

        }


    }}
/*
tablica prawdy
spojnik i && - &            spojnik lub || - |              !
true  false -> false        true false -> true
true & true - true          true & true - true
false & false - false       false & false - false
false & true - false        false & true - true


 {
    public static void TestWyboru(int a , int b){
        System.out.print(a +b);
        System.out.print("test");

    }
        TestWyboru(3,4);
    }
 */