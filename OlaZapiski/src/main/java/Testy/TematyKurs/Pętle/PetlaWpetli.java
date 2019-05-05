package Testy.TematyKurs.Pętle;

/*
Tabliczka mnozenia:

      1  2  3  4   5   6   7   8   9  10
*2
=     2  4  6  8  10  12  14  16  18  20

 */

/**
 * Próba napisania tabliczki mnozenia.
 */

public class PetlaWpetli {

  public static void main(String[] args) {
    System.out.println("\n Wywolanie ciagLiczb");
    ciagLiczb();

    System.out.println("\n Wywolanie mnozenieWpetli");
    mnozenieWpetli();

  }

  public static void ciagLiczb() {

    for (int i = 0; i <= 10; i++)   // Wypisanie wartości: { 1,2,3,4,5,6,7,8,9,10}
    {
      System.out.print(i + " ");  // System.out.print  -  a nie  System.out.println!!! BO wtedy nie wypisze w jednej linii!
    }

    System.out.println();

  }

  public static void mnozenieWpetli() {

    for (int j = 1; j <= 10; j++)
    // do j przypisujemy warotsc startowa 1; sprawdzamy WARUNEK: czy 1 <= 10? TAK. ;
    {
      for (int i = 1; i <= 10; i++) //

        // tworzymy zmienna 'i' przypisujac jej wartosc 1; sprawdzamy WARUNEK: czy 1 <= 10? TAK. ;
      {
        System.out.print(i * j + " ");
        // wypisuje 1 * 1  i dodaje spacje
      }

      System.out.println();
    }

  }
}
