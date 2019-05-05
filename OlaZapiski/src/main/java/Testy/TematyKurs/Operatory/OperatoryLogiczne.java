package Testy.TematyKurs.Operatory;


/* Operatory LOGICZNE -  true / false
      !           negacja
      !(true)     false
      !(false)    true

      &&          KONIUNKCJA - "i" -  W TYM SAMYM MOMENCIE
                  Koniunkcja - JEST PRAWDZIWA, GDY OBA WYRAZENIA SĄ PRAWDZIWE
                  TRUE i TRUE = TRUE
                  TRUE i FALSE = FALSE
                  FALSE i TRUE = FALSE
                  FALSE i FALSE = FALSE

      ||          ALTERNATYWA - "lub" - to lub też to
                  Aletrnatywa -  JEST FAŁSZYWA, GDY OBA WYRAŻENIA SĄ FAŁSZYWE
                  TRUE i TRUE  = TRUE
                  TRUE i FALSE = TRUE
                  FALSE i TRUE = TRUE
                  FALSE i FALSE = FALSE
 */



public class OperatoryLogiczne {
  public static void main (String[] args) {

    System.out.println("Wywolanie porownanie1()\n");
    porownanie1();
    System.out.println("Wywolanie koniunkcja()\n");
    koniunkcja();
    System.out.println("Wywolanie alternatywa()\n");
    alternatywa();

  }

  public static void porownanie1(){

    int a = 5,
        b = 7,
        c = 7;

    if (a == b)
      System.out.println("tak");


    if (!(a == b)) // czy a jest różne od b
      System.out.println("tak");
  }
  /* PRZYKŁAD: a = haslo, b = haslo powtorzone, c = akceptacja warunkow
      Sprawdzenie 2 warunków jednoczesnie: Czy hasła są sobie równe? + Czy warunki sa zaakceptowane, zaznaczone?

       */
  public static void koniunkcja(){
    int a = 5,
        b = 5,
        c = 7;

    if (a == b &&  c > 7) // TRUE i TRUE = TRUE czy a jest rowne b + oraz sprawdz w tym samym czasie czy c jest wieksze od 7
    System.out.println("tak");
    System.out.println("Wykonało się, bo wyrażenie: (a == b && c > 7) jest prawdziwe.");
  }

  public static void alternatywa(){
    int a = 5,
        b = 5,
        c = 7;

    if (a == b ||  c > 7) // True  i false  = true. Przejdzie, skoro jedno wyrazenie jest prawdziwe
      System.out.println("tak");

    System.out.println("Czy wyrażenie:(a != b ||  c > 7) jest fałszywe? ");
    System.out.println(a != b ||  c > 7);

    if (a != b ||  c > 7) // False  i false =  false. Nie przejdzie w tej wersji, kompilator nie zwraca nic.
      System.out.println("Tak");

    if (a == b ||  c > 7) // True i false =  true. Kompilator zwraca nam true, bo jedno jest prawdziwe.
      System.out.println("tak");

  }
}
/*
Zastosowanie powyzszego tematu w abonamentach.

PRZYKŁAD: ZEBY KUPIC ABONAMENT mam warunki:
1. Zalogowany user
2. Podpieta karta do abonamentu
3. Nie posiadanie innego abonamentu
                    KONIUNKCJA: if (isLoggedIn() && isCardAssigned() && !hasOtherSubscription()) {}

PRZYKŁAD: ANULOWANIE ABONAMENTU warunki:
1. OPLACONY ABONAMENT
2. AKTYWNY ABONAMENT
                    KONIUNKCJA: if (isActive() && !isPaid()) {}



 */