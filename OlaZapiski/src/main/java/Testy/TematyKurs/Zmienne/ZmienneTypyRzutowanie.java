package Testy.TematyKurs.Zmienne;


/*
  TYPY DANYCH – przechowywanie liczb stało i zmiennoprzecinkowych, znaki, ciągi znaków oraz typ logiczny. Każdy obiekt ma okreslony typ.

  TYPY PROSTE: int (liczby całkowite), byte, short, long
  TYPY zmiennoprzecinkowe: float, double - najczesciej uzywamy double
  TYP boolean: true/false

  BRAK TYPU UNSIGNED(bez znaku) czego konsekwencją jest to, że przekraczając zakres danego typu przejdziemy na zakres ujemny.

  TYPY ZNAKOWE:
  CHAR -  jest znakiem i służy do reprezentacji pojedynczych znaków kodu Unicode.Mogą być przedstawione w znakach pojedynczego cudzysłowu,
  przy pomocy kodu szesnastkowego, lub po prostu podając numer znaku Unicode w systemie dziesiętnym - przekonamy się o tym w kolejnej lekcji.
  W skrócie dozwolony jest zapis 'a', lub \u0000
  String -  ciąg znakow
  _____________________________________________________________________________________________________________________________________

  DEKLARACJA zmiennej:  określamy typ i nazwę zmiennej.

  INICJALIZACJA zmiennej: nadanie wartości zmiennej.

   */
public class ZmienneTypyRzutowanie {
  public static void main(String[] args) {

    System.out.println("Wywołanie metoda1()\n");
    metoda1();

    System.out.println("Wywołanie metoda2()\n");
    metoda2();

    System.out.println("Wywolywanie poleProstokata()\n");
    poleProstokata();

    System.out.println("Wywolywanie poleKwadratu()\n");
    poleKwadratu();

    System.out.println("Wywolywanie rzutowanie()\n");
    rzutowanie();

    System.out.println("Wywoływanie operatory()\n");
    operatory();

    System.out.println("Wywolywanie inkrementacjaDekrementacja()/n");
    inkrementacjaDekrementacja();

    System.out.println("WywolywanieOperatoryRelacyjne()\n");
    operatoryRelacyjne();

    // te /n to jest nowa linia, zapisuje tekst po enterze

  }

  public static void metoda1() {
    int a = 10;
    int b = 6;
    int c;

    c = a + b;
    System.out.println(c);
  }

  public static void metoda2() {

    int a = 1;
    final int b = 4;
    int c;

    c = a + b;
    System.out.println(c);
  }

  public static void poleProstokata() {
    int a  = 4;
    int b = 2;

    int c;
    c = a * b;
    System.out.println(c);
    System.out.println("Pole prostokata: " + " bok a = " + a + "," + " bok b = " + b + "," +  " wynik = " + c);
  }

  public static void poleKwadratu() {
    int a = 2;
    int b = a;
    int c;
    c = a * b;
    System.out.println(b);
    System.out.println(" Pole kwadratu: " + " bok a = " +  a + "," + "bok b = " + b + "," + " wynik = " + c);
    System.out.println("Pole kwadratu to: " + c);

  }

  public static void rzutowanie() {
    int a = 5, b = 2; //
    double c = 12, d =15;

    System.out.println(a / (double) b);
    System.out.println("Wynik bez rzutowania to 2");
    System.out.println("Wynik po rzutowaniu to 2,5");
    /* Dzielimy przez siebie liczby całkowite, więc wynik zawsze będzie liczbą całkowitą. Jeżeli chcemy otrzyymać liczbę z ułamkiem, to:
    do tego służy rzutowanie. Nie ważne, na którą cyfrę rzutujemy, wynik będzie jaki się spodziewamy.
     */

    int wynik1 = a/b;
    double wynik2 = c/d;
    // int wynik3 = a/d;
    int wynik4 = a/ (int)d;
    System.out.println(wynik1); // dzielenie liczby całkowitej przez całkowitą - OK
    System.out.println(wynik2); // dzielenie liczby zmiennoprzecinkowej przez zmiennoprzecinkowa - OK
   // System.out.println(wynik3); // PROGRAM NIE ODPALA, bo: nie dzielimy liczby całkowitej przez zmiennoprzecinkowa, gdzie mamy int
    System.out.println(wynik4); // dopiero gdy rzutowalismy typ, kod sie kompiluje

    double wynik5 = a/d;
    System.out.println(wynik5); // Dzielenie liczb całkowitych przez zmiennoprzecikowe zadziała ale jeśli mam typ double.

    System.out.println(1/5); // Wynik 0 bo nie ma rzutowania
    System.out.println(1/(double)5); // ok, rzutowalam
    System.out.println(1.0 / 5); // 0,2 ok bo jedna z liczb jest zmiennoprzecinkowa

  }
  public static void operatory() {
/* OPERATOR - znaki służące do operowania na zmiennych
+  dodawanie liczb oraz łączenie stringów
- odejmowanie
* mnozenie
/  dzielenie

= przypisanie wartosci
+= , -+ ,   /+,   *=,

*/

int a = 5;
a +=2; // zamiast a = a +2;              +=
    System.out.println(a);

    int b = 4;
   b-=2; //zamiast b = b -2;            -=
    System.out.println(b);

    int c = 6;
    c/=2; // zamiast: c = c / 2;        /=
    System.out.println(c);

    int d = 8;
    d *=2; // zamiast: d = d * 2;       *=
    System.out.println(d);

    // % (mot) reszta z dzielenia (dzielenie modulo)

    int e = 1 % 3; // wynikiem jest reszta z dzielenia, ona wybiera mi ile pozostało
    System.out.println(e);

    int f = 2 % 3;
    System.out.println(f);

    int g = 3 % 3; // 3/3 to 1 = kompilator zwraca nam 0, bo nie ma w tym działaniu reszty z dzielenia
    System.out.println(g);

    int h = 4 % 3; // 1 i 1/3, wiec wynik jest 1 (reszta  z dzielenia)
    System.out.println(h);
    /* KIEDY TO MI SIE PRZYDA? GDY CHCE, ABY CO 3 RAZ COŚ SIĘ STAŁO. np:
    w powyzszym przykładzie co 3 wynik z dzielenia -  reszta wynosi 0
    mozna wykorzystac instrukcje warunkowa, aby sprawdzic: jezeli wynik z tego jest = 0 , to 3 raz to sie wykonalo
     i musze zrobic specyficzna operacje
     */

  }

  public static void inkrementacjaDekrementacja(){
    // ++  INKREMENTACJA  - powiększ o 1
  int a = 5;
 a++; // a +=1 (tego uzywamy gd chcemy powiekszyc o wiecej niz 1) , czyli a = a +1
    System.out.println(a);


    // -- DEKREMENTACJA - pomniejsz o 1
    int b = 6;
    b--; // b-=1, lub  b = b -1
    System.out.println(b);

    // y++  POST INKREMENTACJA (postfixowe) sposób zapisu
    int d = 5;
    System.out.println(d++); // wynik=5, bo: powiększ o 1, ale nie pokazuj jeszcze tego
    System.out.println(d); //wynik=6, bo dopiero tu ma znaczenie to powiekszenie

    // ++y PRE INKREMENTACJA (prefixowe) sposób zapisu

    int e =5;
    System.out.println(++e); // najpierw mi powieksz, a nastepnie wypisz mi 5+1, wynik =6
    System.out.println(e); // wynik=6

    //  y-- POST DEKREMENTACJA
    int f = 4;
    System.out.println(--f); //najpierw pomniejsz mi o jeden, a nastepnie wypisz wynik f-1, wynik=3
    System.out.println(f); // wynik=3


    // --y  PRE DEKREMENTACJA
    int g = 4;
    System.out.println(g--); // pomniejsz o 1, ale nie pokazuj jeszcze tego. WYNIK =4
    System.out.println(g); // WYNIK = 3 dopiero tu pomniejsza

  }

  public static void operatoryRelacyjne(){


  }

  }


