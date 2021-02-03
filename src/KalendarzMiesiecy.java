import java.util.Scanner;

public class KalendarzMiesiecy {
    public static void main(String args[])
    //Wczytuje cyfre scanerem od 1 do 10 rozpoznaje jako parzyste nie parzyste dla 11 i 12 sczytuje to jako listopad i grudzen. jesli wartosc jest ujemne to mozesz powtorzyc to 3 razy. jesli cyfra wyjdzie wieksze niz 12 to podziel przez zmienia zmiena

    {
        boolean w = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbe");
        int licznik=0;

        while ((licznik<3)&&(w)) {
            int skaner = scanner.nextInt();
            int h = skaner/12;
            switch (skaner) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:

                    System.out.println("Dzień nieparzysty");
                    w=false;
                    break;

                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                    System.out.println("Dzień parzysty");
                    w=false;
                    break;

                case 11:
                    System.out.println("Listopad");
                    w=false;
                    break;
                case 12:
                    System.out.println("Grudzien");
                    w=false;
                    break;
            }

                if(skaner>12)System.out.println("twoja liczba skonwetowana to " + h);
                else if(skaner<0)System.out.println("Wprowadź dodatnią liczbę");
                licznik++;
                System.out.println("To była twoja próba " + licznik);
            // if((skaner>=1)&&(scaner<=10))System.out.println();

        }
        if(licznik==3)System.out.println("Wykorzystałes swoje wszystkie próby");
    }
}