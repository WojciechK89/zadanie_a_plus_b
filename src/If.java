public class If {
    public static void main(String[] args){
    int liczba = 8;
    if (liczba > 3){
        System.out.println("Większe od zera");
        if(liczba%2 == 0)
        {System.out.println("Liczba parzysta");}
        if(liczba%2 > 0)
        {System.out.println("Liczba nieparzysta");}
    }
    else{System.out.println("Mniejsze od zera");}
    }
}
///////////
/* if(liczba%2 == 0){
 {System.out.println("Liczba parzysta");}
 */