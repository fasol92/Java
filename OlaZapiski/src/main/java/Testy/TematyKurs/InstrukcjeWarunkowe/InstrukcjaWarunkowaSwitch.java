package Testy.TematyKurs.InstrukcjeWarunkowe;

/*
      SWITCH - (przełącznik) Pozwala przełączać pomiędzy stanami, wartość która została do niego przesłana.
        CASE -  PRZYPADEK
        DEFAULT -
        BREAK- wyjscie z przełącznika (wyjscie z zakresu, który tworzą klamry {} )

        MOZNA PORÓWNYWAĆ:
        - ZNAKI: char

        NIE MOŻNA PORÓWNYWAĆ:
        - DOUBLE, liczby zmiennoprzecinkowe, maja slaba precyzje - ciezko porównac
        - STRINGA, inny typ, nie jest zwykły tylko jest tak naprawde obiektem

        INFO OD KALINY: SWITCHA najczęściej uzywamy do enumów, np.:
                Enum OperationType ma 5 wartości - w zaleznosci od tego co przyjdzie w requescie, chce wykonac jakas operacje.
                Wiec switch(operationType) i w CASE podaje wartosc enuma.
                 ZE SWITCHEM JEST BARDZIEJ CZYTELNE.
 */

public class InstrukcjaWarunkowaSwitch{
public static void main(String[]args){

    System.out.println("Wywolanie instrukacjaSwitch()\n");
    instrukcjaSwitch();

    System.out.println("Wywołanie instrukcjaSwitch2()\n");
    instrukcjaSwitch2();

    System.out.println("Wywolanie intrukcjaSwitch3()\n");
    intrukcjaSwitch3();

    System.out.println("Wywolanie instrukcjaSwitch4()\n");
    instrukcjaSwitch4();

    System.out.println("Wywolanie instrukcjaSwitchBreak()\n");
    instrukcjaSwitchBreak();

    System.out.println("Wywolanie switchChar()\n");
    switchChar();
    }

  public static void instrukcjaSwitch() {
    int a = 50;
    switch (a) {
    case 50:                                                          // W przypadku gdy:
      System.out.println("a jest rowne 50");
    case 100:
      System.out.println("a jest rowne 100");
    default:                                                          // W całkowicie innym wypadku:
      System.out.println("a nie jest rowne ani 50, ani 100, jest równe: " + a);

      //  WYWOŁAŁO NAM WSZYSTKO...
    }
  }

  public static void instrukcjaSwitch2() {
    int a = 100;
    switch (a) {
    case 50:
      System.out.println("a jest rowne 50");
    case 100:
      System.out.println("a jest rowne 100");
    default:
      System.out.println("a nie jest rowne ani 50, ani 100, jest równe: " + a);

      // WYWOŁAŁO MI OD CASE:100
    }
  }

  public static void intrukcjaSwitch3() {

    int a = 5125;
    switch (a) {
    case 50:
      System.out.println("a jest rowne 50");
    case 100:
      System.out.println("a jest rowne 100");
    default:
      System.out.println("a nie jest rowne ani 50, ani 100, jest równe: " + a);

      // WYWOŁAŁO MI TYLKO DEFAULT, zignorowało przypadki.
    }
  }

  public static void instrukcjaSwitch4() {

    int a = 5125;                            // DEFAULT NA POCZATKU
    switch (a) {
    default:
      System.out.println("a nie jest rowne ani 50, ani 100, jest równe: " + a);
    case 50:
      System.out.println("a jest rowne 50");
    case 100:
      System.out.println("a jest rowne 100");

      // GDY DEFAULT DAJEMY NA POCZATKU I POD NIM PRZYPADKI - WYWOLUJE NAM WSZYSTKO

      /*
      Dzieje się tak dlatego, ze instrukcje SWITCH nie sa przerywane.
       */
    }
  }
  public static void instrukcjaSwitchBreak() {
    // BREAK - WYJSCIE Z PRZEŁĄCZNIKA
    int a = 5125;
    switch (a) {
    case 50:
      System.out.println("a jest rowne 50");
      break;
    case 100:
      System.out.println("a jest rowne 100");
      break;
    default:
      System.out.println("a nie jest rowne ani 50, ani 100, jest równe: " + a);
    }
  }

  public static void switchChar(){

    char a = 50;
    switch(a)
    {
    case 'B':
      System.out.println("porownanie znaku");

    }
}
}