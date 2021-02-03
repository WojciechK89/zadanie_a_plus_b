import java.util.Scanner;

public class RzutowanieFor {
public static void main(String args[])
    {
        double nazwa;
       // double x;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Podaj zmienna przecinkową");

        nazwa = scanner.nextDouble();

        System.out.println("Twoja cyfra NORALNA PRZED ZRZUTEM to: " + nazwa);
        //nazwa=(int)nazwa;
        System.out.println("Twoja cyfra ZRZUTOWANA i zmieniona na bezprzecinkowa " + (int)nazwa);

        nazwa=nazwa-(int)nazwa;
        System.out.println("Twoja cyfra ZRZUTOWANA i skonwetowana do samej zmiennoprzecinkowej " + nazwa);
    }
}
