package Testy.TematyKurs.ProgramowanieObiektowe;

/*
      OBIEKTY - pojemniki do przechowywania zmiennych i funkcji tematycznie ze soną powiązanych do dalszego łatwiejszego użucia

      KLASY - foremki do tworzenia egzemplarzy obiektów
      Properties -  wlasciwosci
      Metody - funkcje (wyłącz monito, włacz monitor, zmniejsz jasnosc)
 */

public class ProgramowanieObiektowe { // Klasa głowna powinna nazywać się jak nazwa pliku

  int a;

  static void test() {
    System.out.println("aaa");
  }

  public static void main(String[] args) { //Funkcja głowna, wykonuje się jako pierwsza po odpaleniu przycisku
    // STATIC - stała, dostępna zawsze,   PUBLIC - dpstęp wszędzie, ktos moze importować mój pakunek

    test();

    Monitor abc = new Monitor();      //Tworzenie obiektu
    abc.szerokosc = 124;

    Monitor abc2 = new Monitor();
    abc2.szerokosc = 55;

    System.out.println(abc.szerokosc);
    System.out.println(abc2.szerokosc);

    String imie = "Arek";

  }
}

class Monitor {

  int szerokosc;  //Properties - własciwosci
  int wysokosc;  // Properties - własciwosci

  void włącz()   // Metoda - funkcja, okreslaja zachowanie, czynnosci jakie mogą byc wykonane przez daną klasę
  {

  }

  void wyłącz()  // Metoda - funckja
  {

  }
}


