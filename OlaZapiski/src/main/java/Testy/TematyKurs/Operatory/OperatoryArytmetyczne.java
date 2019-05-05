package Testy.TematyKurs.Operatory;

public class OperatoryArytmetyczne {
  public static void main(String[] args) {

    System.out.println("WywoływanieOperatory()\n");
    operatory();

    System.out.println("WywolywanieInkrementacjaDekrementacja()\n");
    inkrementacjaDekrementacja();

  }

  public static void operatory() {
/*
      OPERATOR - znaki służące do operowania na zmiennych
      +         dodawanie liczb oraz łączenie stringów
      -         odejmowanie
      *         mnozenie
      /         dzielenie

      =         przypisanie wartosci
      +=        dodaj do wartości zmiennej ...
      -=        odejmij od warości zmiennej ...
      /=        podziel wartośc zmiennej przez ...
      *=        pomnóż wartość zmiennej przez ...
*/

    int a = 5;
    a += 2; // zamiast a = a +2;              +=
    System.out.println(a);
    System.out.println("Zmienna = 5. Powiększam o +=" + 2 + ". WYNIK = " + a);

    int b = 4;
    b -= 2; //zamiast b = b -2;            -=
    System.out.println(b);
    System.out.println("Zmienna = 4. Pomniejszam o -=" + 2 + ". WYNIK = " + b);

    int c = 6;
    c /= 2; // zamiast: c = c / 2;        /=
    System.out.println(c);
    System.out.println("Zmienna = 6. Dzielę przez /=" + 2 + ". WYNIK = " + c);

    int d = 8;
    d *= 2; // zamiast: d = d * 2;       *=
    System.out.println(d);
    System.out.println("Zmienna = 8. Mnożę przez *=" + 2 + ". WYNIK = " + d);

    /*
              %         (mot) reszta z dzielenia (dzielenie modulo)
   */

    int e = 1 % 3; // wynikiem jest reszta z dzielenia, ona wybiera mi ile pozostało
    System.out.println(e);

    int f = 2 % 3;
    System.out.println(f);

    int g = 3 % 3; // 3/3 to 1 = kompilator zwraca nam 0, bo nie ma w tym działaniu reszty z dzielenia
    System.out.println(g);

    int h = 4 % 3; // 1 i 1/3, wiec wynik jest 1 (reszta  z dzielenia)
    System.out.println(h);
    /*
    KIEDY TO MI SIE PRZYDA? GDY CHCE, ABY CO 3 RAZ COŚ SIĘ STAŁO. np:
    W powyzszym przykładzie co 3 wynik z dzielenia -  reszta wynosi 0,
    mozna wykorzystac instrukcje warunkową, aby sprawdzic: jezeli wynik z tego jest = 0 , to 3 raz to sie wykonalo.
    Trzeba zrobić specyficzną operację.
     */

  }

  public static void inkrementacjaDekrementacja() {
    // ++  INKREMENTACJA  - powiększ o 1
    int a = 5;
    a++; // a +=1 (tego uzywamy gdy chcemy powiekszyc o wiecej niz 1) , czyli a = a +1
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

    int e = 5;
    System.out.println(++e); // najpierw mi powieksz, a nastepnie wypisz mi 5+1, wynik =6
    System.out.println(e); // wynik=6

    //  y-- POST DEKREMENTACJA
    int f = 4;
    System.out.println("POST DEKREMENTACJA y--");
    System.out.println("Pomniejsz o 1 i wypisz wynik: ");
    System.out.println(--f); //najpierw pomniejsz mi o jeden, a nastepnie wypisz wynik f-1, wynik=3
    System.out.println("Pomniejszony wynik: " + f); // wynik=3

    // --y  PRE DEKREMENTACJA
    int g = 4;
    System.out.println("PRE DEKREMENTACJA -yy");
    System.out.println("Pomniejsz o 1, ale nie pokazuj jeszcze tego:");
    System.out.println(g--); // Pomniejsz o 1, ale nie pokazuj jeszcze tego. WYNIK =4

    System.out.println("Pokaż pomniejszony wynik: " + g); // WYNIK = 3 dopiero tu pomniejsza

  }
}
