package Testy.TematyKurs.InstrukcjeWarunkowe;
/*
INSTRUKCJE WARUNKOWE - rozkaz do warunkowania, sprawdzenia czy coś jest prawdziwe, czy fałszywe.
  boolean : true / false

  if (WYRAZENIE) - jezeli jest prawdziwe, wykona sie:
                    instrukjaca

            else - w innym wypadku wykonaj instrukjcę:
                    instrukcja
            else if (wyrazenie) -  mogę mieć takich ile chce

            ALE JESLI JEST DUZO IF / ELSE - oznacza, ze kod jest słaby! - 3 warunki, to juz jest długi kod - INFO OD KALINY

 */
public class InstrukcjeWarunkowe {
  public static void main (String[] args) {

    System.out.println("Wywolanie instrukcjeWarunkowe()\n");
    instukcjeWarunkowe();

    System.out.println("Wywolanie warunekElse()\n");
    warunekElse();

    System.out.println("Wywolanie warunekElse2()\n");
    warunekElse2();

    System.out.println("Wywoływanie grupowanieInstrukcji()\n");
    grupowanieInstrukcji();

  }
  public static void instukcjeWarunkowe(){
    int a =5,
        b = 7,
        c = 9;

    System.out.println(" Wyrazenie: (a == b) ");
    System.out.println(a == b);

    if (a == b) // nie wykona sie bo FALSE
      System.out.println("NotatnikTestowy");


    System.out.println(" Wyrazenie: (a != b) ");
    System.out.println(a != b); // TRUE


    if (a != b)
      System.out.println("NotatnikTestowy");

    System.out.println(" Wyrazenie: (a != b && c > 5) ");
    System.out.println(a != b && c > 5); // TRUE  TRUE =  TRUE
    if ( a!= b && c > 5)
      System.out.println("NotatnikTestowy");

  }

  public static void warunekElse() {
    int a = 5,
        b = 7,
        c = 9;

    if ( a > b )
      System.out.println("a > b"); // FALSE, kompilator nie zwrocił nic.
    else
      System.out.println("a <= b"); // TRUE, więc instrukcja została wywołana.
  }

  public static void warunekElse2() {
    int a = 5,
        b = 7,
        c = 9;

    if (a > b)                                 // Sprawdza warunek, jesli jest prawdziwy wykonuje ponizsza instrukcje:
      System.out.println("a > b");            // FALSE, wiec instrukcja sie nie wykonała
    else if (a < b)                          // Jezeli pierwsza instrukcja nie była spełniona, sprawdza ten warunek.
      System.out.println("a < b");          // TRUE, więc intrukcja się wykonała
    else                                   // Jesli powyższe nie były prawdziwe, wykonuje dopiero to.
      System.out.println("a == b");       // FALSE, ale wykonuje sie ta instrukcja, jezeli powyzsze nie zostana spelnione
  }

  public static void grupowanieInstrukcji(){
    int a = 5,
        b = 7,
        c = 9;

    if (a > b)
      System.out.println("a > b");
    else if (a < b)
    {                                     //  { } GRUPOWANIE WIELU INSTRUKCJI
      System.out.println("a < b");
      System.out.println("GRUPOWANIE WIELU INSTRUKCJI");
      System.out.println("Po if i wyrazeniu stawiamy: { ");
      System.out.println("po wszystkich instrukcjach konczymy zamykajac nawias: }");
    }
      else
      System.out.println("a == b"); // TA PIERWSZA INSTRUKCJA PO TYCZY SIĘ TEGO ELSE
      System.out.println("lalala"); // TA KOLEJNA JUZ SIE WYKONUJE i kolejna tez... - bład

    // JEZELI MAM WIECEJ NIZ JEDNA INSTRUKCJE I TYCZA SIE ONA INSTRUKCJI WARUNKOWYCH I MAJA SIE WSZYSTKIE WYKONAC DAJE KLAMRY {}

  }
}
