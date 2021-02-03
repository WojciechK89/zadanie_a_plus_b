import java.util.Scanner;

public class rozneliczby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz na razaie 3 liczby");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        //double d = scanner.nextDouble();
        System.out.println("liczby zostały posortowane");
        if ((a > b) && (a > c))
        {System.out.println(a);
            if(b>c){System.out.println(b);
                System.out.println(c);}
            else{System.out.println(c);
                System.out.println(b);}
        }
        else if ((b>a)&&(b>c))
        {System.out.println(b);
            if(a>c){System.out.println(a);
                System.out.println(c);}
            else{System.out.println(c);
                System.out.println(a);}}
        else if((c>a)&&(c>b))
        {System.out.println(c);

            if(a>b){System.out.println(a);
                System.out.println(b);}
            else{System.out.println(b);
                System.out.println(a);}
    }
}
}