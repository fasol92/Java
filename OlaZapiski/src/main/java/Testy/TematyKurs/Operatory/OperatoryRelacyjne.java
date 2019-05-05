package Testy.TematyKurs.Operatory;

    /*
    Operatory RELACYJNE - PORÓWNANIA. sprawdzają, czy jakieś zmienne są wieksze od siebie, czy równe.

    ==  POROWNANIE, czy są równe?
    !=  czy są różne od siebie?
    >   większe od
    <   mniejsze od
    >=  większe / lub równe
    <=  mniejsze / lub równe
    */
public class OperatoryRelacyjne {
  public static void main (String[] args) {

    System.out.println("WywoływanieOperatoryPorownawcze()\n");
    operatoryPorownawcze();


    System.out.println("WywolaniePorownanie3()\n");
    porownanieWarunek();

    System.out.println("WywolanniePorownanieMniejszeWieksze()\n");
    porownanieMniejszeWieksze();

  }
  public static void operatoryPorownawcze() {

    boolean isTrue = 4 == 4;  // czy 4 jest równe 4
    System.out.println("Czy 4 ==4 ? " + isTrue);

    isTrue = 5 == 8;
    System.out.println("Czy 5 == 8 ? " + isTrue);

  }
  public static void porownanieWarunek(){
    boolean isTrue = 4 == 8;
    if ( 4 == 8);
      System.out.println("Czy 4 == 8 jeśli robimy taki warunek (if) ? " + isTrue); // zwraca FALSE
    // Wykład 13 , czas 3:47  - jemu nic nie wywowalo tutaj.


    isTrue = 5 == 5;
    if (5 == 5);
    System.out.println("Czy 5 == 5, jesli mamy taki warunek (if) ? " + isTrue); // zwraca TRUE

  }

  public static void porownanieMniejszeWieksze(){

    System.out.println("Czy 5 jest rozne != od 5? ");
    System.out.println(5 != 5);// false

    System.out.println("Czy 5 jest różne != od 6? ");
    System.out.println(5 != 6); //true

    System.out.println("Czy 5 jest większe > od 8? ");
    System.out.println(5 > 8); //false

    System.out.println("Czy 5 jest większe > od 2? ");
    System.out.println(5 > 2); //true

    System.out.println("Czy 5 jest mniejsze < od 1? ");
    System.out.println(5 < 1); //false

    System.out.println("Czy 5 jest mniejsze < od 10? ");
    System.out.println(5 < 10); //true

    System.out.println( "Czy 5 jest większe bądz równe >= od 5?  ");
    System.out.println(5 >= 5); //true

    System.out.println("Czy 5 jest większe od 5? ");
    System.out.println(5 > 5); // fasle

    int a = 5,
        b = 7;
    System.out.println( "Czy a = " + a + " jest większe > od b = " + b + "? ");
    System.out.println(a > b);

    /*
    Dane mogą być wprowadzone z plików czy bazy danych, czy aplikacji w formularzu - wówczas nie mam wiedzy jakie konkretnie są wpisane
     i chce sprawdzic co zostało wpisane. Z pomoca operatorow relacyjnych i instrukcji watunkowych moge podejmować decyzje.
     */

  }
}
