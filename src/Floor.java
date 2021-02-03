import java.util.Scanner;

public class Floor {
    public static void main(String args[])
    {
       double nazwa;
        // double x;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Podaj zmienna przecinkową");

        nazwa = scanner.nextDouble();

        System.out.println("Twoja cyfra NORALNA PRZED ZRZUTEM to: " + nazwa);
        //nazwa=(int)nazwa;
        System.out.println("Twoja cyfra to jest podłoga? a co to jest podłoga? " + Math.floor(nazwa));

        System.out.println("Twoja cyfra to jest sufit? a co to jest sufit? " + Math.ceil(nazwa));
        nazwa=nazwa-Math.floor(nazwa);
        System.out.println("Twoja cyfra ZRZUTOWANA i skonwetowana do samej zmiennoprzecinkowej " + nazwa);
    }
}
