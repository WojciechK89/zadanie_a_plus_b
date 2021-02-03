import java.util.Scanner;

public class ZmiennoprzecinkoweFinally {
//Napisz program który będzie przyjmował od użytkownika 3 liczbyi
//zmiennoprzecinkowe z zakresu od 1 - 5 //////następnie liczył ich średnią.
//⁃ Program powinien prosić o ponowne wpisanie liczby gdy część dziesiętna
//jest różna od 0.25, 0.5, 0.75
//⁃ Program powinien prosić o ponowne wpisanie wartość była już wcześniej
//prowadzona przez użytkownika

    public static void main(String args[])
    {
        Scanner scanner =new Scanner(System.in);

        double suma = 0;
        double u,x;
        int licznik =0;
      for(int i=0; i<3; i++) {
          boolean h=true;
          while ((licznik < 3) && (h)) {
              System.out.println(i+". Podja liczbe to jest twoja proba - " + (licznik + 1));
              u = scanner.nextDouble();
              x = u - (int) u;

              if ((u < 1) || (u > 5) || (x == 0.25) || (x == 0.5) || (x == 0.75)) {
                  System.out.println("zle sprobj jeszcze");
                  licznik++;
              } else {
                  System.out.println(" dobra cyfra "); suma=suma+u; //suma+=u;
                  h = false;
              }

          }
          System.out.println("Srednia 3 liczb to : "+ (suma/3));
      }

    }

}


///1.Napisz program ktory bd pytal o liczbe zmiennoprzecinkowa z zakresu 6 do 12
///2.Program powinien o ponowne wpisanie wartosci jesli jest poza zakresem pytanym
///3.Program powinnie poprosi o ponowne wypisanie licz 0,25, 0,50.