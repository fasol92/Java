package Testy.TematyKurs.ProgramowanieObiektowe;

/**
 *      OBIEKTY - pojemnik do przechowywania zmiennych i funkcji tematycznie ze sobą powiązanych do dalszego łatwiejszego ponowego uzycia
 *
 *      KLASY -  foremki do tworzenia egzemplarzy obiektów
 *
 *      PROPERTIES - właściwości
 *
 *      METODY - funkcje (opisują czynności związane z obiektem)
 *
 *      KONSTRUKTOR - zbiory intrukcji, ktore maja zostac wykonanne podczas gdy konstrujemy obiekty, w sposob w ktory chcemy okreslic
 *      Sposoby roznia sie parametrami cyzli tymczzasowymi zmiennymi, ktore przestaja istniec gdy skonczy sie wywoływanie kosntruktora
 */

public class Konstruktory {

  public static void main(String[] args) {

    Punkt p = new Punkt();

    p.x = 4;
    p.y = 20;
    System.out.println("p.x " + p.x);
    System.out.println("p.y " + p.y);

  }

  static class Punkt // Klasa, która wykorzystam do stworznei isntancji klasy czyli obiektu, kopii punktu wyzej
  {
    Punkt()
    {
      System.out.println("Wywolano kontruktor domyslny: ");
    }
    Punkt(int pierwszy, int drugi)
    {

    }
    int x;
    int y;
  }
}
