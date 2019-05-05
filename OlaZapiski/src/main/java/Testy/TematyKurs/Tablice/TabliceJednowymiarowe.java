package Testy.TematyKurs.Tablice;


/*
Tablica - kontener na wiele ułozonych kolejno obok siebie zmiennych.
          PONUMEROWANY SZEREG ELEMENTÓW.
          Korzystamy z tablicy podczas tworzenia więcej niż jednej zmiennej, wszystkie są tego samego typu.

          ----------------------------------------
          tab[0] tab[1] tab[2] tab[3] tab[4]

          ----------------------------------------

          TABLICA JEDNOWYMIAROWA: ma jeden wymiar, biegnie w jedna stronę...

          INDEKS zawsze o -1 niż wielkość tablicy!
          INDEKSUJEMY Tablice OD 0!

              length - długość tablicy


 */

public class TabliceJednowymiarowe {

  public static void main(String[] args) {
    System.out.println("Wywołanie nazwaFunkcji()/n");
    nazwaFunkcji();

    System.out.println("Wywołanie funkcja()/n");
    funkcja();

    System.out.println("Wywołannie funkcjatablica()/n");
    funkcjatablica();
  }

    public static void funkcja() {

      int[] tab;   // zadeklarowanie tablicy: typ + [] + nazwa
      tab = new int[5];   // przypisanie do taba słowa kluczowego new + typ + ile elementów w tablicy [] - rezerwacja w pamieci
      tab[0] = 20;          // Odwołanie się - korzystam z INDEKSU: tab + indeks do którego chcę się odwołać.
      // Indeksjemy tablice od 0!

      tab[1] = 7;
      tab[2] = 27;
      tab[3] = 15;
      tab[4] = 77;

      System.out.println(tab[0]);
    }



  public static void nazwaFunkcji() {

    int[]tab2 = new int [3];
    // Deklaracja  + inicjalizacja czyli przypisanie i zarezerwowanie miejsca w pamieci dla 5 zmiennych typu int


    tab2[0]= 13;
    tab2[1]= 22;
    tab2[2]= 33;

    System.out.println(tab2[2]);

  }

  public static void funkcjatablica(){

    int[] tab3 = {4, 14, 4, 412, 222, 234};  // odrazu przypisujemy wartosci

    System.out.println(tab3[0]);
    System.out.println(tab3.length);  //POBIERAMY JAKA JEST DŁUGOSC TABLICY
    System.out.println(tab3[tab3.length-1]);




  }
}
