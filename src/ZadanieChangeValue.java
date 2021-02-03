import java.util.Scanner;

public class ZadanieChangeValue {
    // uzytkownik pyta cie o cyfre zmiennoprzecinkowa miedzy 1 a 9 jesli podasz inna cyfre niz te z przedzialu to mozesz je wpisac ponownie do 3 razy
    //Jesli dziesietna cyfry bd zawierac 0.5 lub 0.25 to program ponownie zapyta cie o cyfre
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        boolean w = true;
        int licznik=0;
        double x,y;
        while ((licznik<3)&&(w))
        {
       System.out.println("Podaj cyfr zmiennoprzecinkowa miedzy 1 a 9 program nie  uwzglednia jedynie 0.25 i 0.5 - Masz prob "+ (licznik+1));

        x = scanner.nextDouble();
          //  y=x-Math.floor(x);
            y=x-(int)x;
            System.out.println(y);
            if((x<1)||(x>9)||(y==0.25)||(y==0.5)){licznik ++;}

            else {  {System.out.println("podałes dobra liczbe");
            w=false;} }

            //String b ="231";
           // System.out.println(b.contains("2"));
          //b.toUpperCase();


        }

    }

}
