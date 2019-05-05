package Testy.TematyKurs.Pętle;

/* PĘTLA - powtarzanie instrukcji.

    while ()- "podczas gdy"  + (warunek pętli)
    _______________________________________________

    DO WHILE:  - stosujemy wówczas, gdy nie interesuje nas na samym starcie czy warunek musi zostać sprawdzony.


    do                      - rób wszystko co określone w klamrach
    {}                                DOPÓKI
    while();               While jest warunkiem prawdziwym


 */

public class PetlaWhileorazDoWhile {

  public static void main(String[] args) {

    System.out.println("\n Wywołanie pętlaPodstawy()");
    pętlaPodstawy();
    System.out.println("\n Wywołanie pętla2()");
    petla2();

    System.out.println(" \n Wywołanie petla3");
    petla3();

    System.out.println("\n Wywolanie petla4");
    petla4();

    System.out.println("\n Wywolanie petla5");
    petla5();

    System.out.println("\n Wywolanie petla6");
    petla6();

    System.out.println("\n Wywolanie petla7");
    petla7();

    System.out.println("\n Wywolanie petlaDoWhile");
    petlaDoWhile();

    System.out.println("\n Wywolanie cwiczenieTablicaPetla");
    cwiczenieTablicaPetla();

  }

  public static void pętlaPodstawy() {
    int i = 0;
    while (i < 7)  //  Wykonuj się podczas gdy 0 < 7
    {
      System.out.println(i);

      i++;        // PostINKREMENTACJA - powiększ o 1
      /* Bez i++  pętla wykonywała by się w nieskończoność, ponieważ 0 zawsze będzie mniejsze o 7.
         Gdy powiększymy o 1 pętla, będzie wykonywała sie do momentu, w którym (WARUNEK) jest spełniony, czyli:
       Po każdej wykonanej pętli jest powiększenie o 1. Procec zakonczy się, gdy 6 < 7.
       */
    }
  }

  public static void petla2() {

    int a = 3;
    while (a > 2) {
      System.out.println(a);

      a--;  // bez tego operatora bedzie wykonywała się w nieskonczonosc zwaracajac wynik 3
    }

  }

  public static void petla3() {

    String[] kursyProgramowania =
        {
            "1. Java",
            "2. Java Aplikacje",
            "3. Java Strumienie",
            "4. Java Aspekty Zaawansowane",
            "5. Java android",
            "6. C#",
            "7. Tworzenie Aplikacji"
        };

    int i = 0;
    while (i < 7) {
      System.out.println(kursyProgramowania[i]); // Wyrzuca wszystkie Stringi mniejsze o okresloną ilosc "i"

      i++;
    }
  }

  public static void petla4() {
    String[] kursyProgramowania =
        {
            "1. Java",
            "2. Java Aplikacje",
            "3. Java Strumienie",
            "4. Java Aspekty Zaawansowane",
            "5. Java android",
            "6. C#",
            "7. Tworzenie Aplikacji",
            "8. C# LINQ",
            "9. Pacsal"
        };

    int i = 0;
    while (i < kursyProgramowania.length)  //Dzięki 'length' pobieramy wszystkie stringi w tablicy. Dzięki temu mozna dopisywać na biezaco.
    {
      System.out.println(kursyProgramowania[i]);
      i++;
    }
  }

  public static void petla5() {
    String[] kursyProgramowania =
        {
            "1. Java",
            "2. Java Aplikacje",
            "3. Java Strumienie",
            "4. Java Aspekty Zaawansowane",
            "5. Java android",
            "6. C#",
            "7. Tworzenie Aplikacji",
            "8. C# LINQ",
            "9. Pacsal"
        };

    int i = 0;
    while (i < kursyProgramowania.length) {
      if (i != 3)  // Liczymy od 0! Więc zwraca wszystkie, prócz 4"
        System.out.println(kursyProgramowania[i]);

      i++;
    }
  }

  public static void petla6() {
    String[] kursyProgramowania =
        {
            "1. Java",
            "2. Java Aplikacje",
            "3. Java Strumienie",
            "4. Java Aspekty Zaawansowane",
            "5. Java android",
            "6. C#",
            "7. Tworzenie Aplikacji",
            "8. C# LINQ",
            "9. Pacsal"
        };

    int i = 0;
    while (i < kursyProgramowania.length) {
      if (i == 3)  // Liczymy od 0! Zwraca wylacznie 4. Java aspekty Zaawansowane
        System.out.println(kursyProgramowania[i]);

      i++;
    }
  }

  public static void petla7() {
    String[] kursyProgramowania =
        {
            "1. Java",
            "2. Java Aplikacje",
            "3. Java Strumienie",
            "4. Java Aspekty Zaawansowane",
            "5. Java android",
            "6. C#",
            "7. Tworzenie Aplikacji",
            "8. C# LINQ",
            "9. Pacsal"
        };
    int i = 0;
    while (i < kursyProgramowania.length) {
      {
        System.out.println(kursyProgramowania[i++]); // PostINKREMENTACJA, lepiej zapisywać jak wyzej.
      }

      /*System.out.println(kursyProgramowania[++i]); // PreInkrementacja nie zadziała,
       bo najpierw dodaje, czyli zamiast zera juz na samym starcie mam 1.
       Tablica ma 9 elemntów, wiec ostni element jest na indeksie 8, a ja odwołuję się do 9.
       */
    }
  }

  public static void petlaDoWhile() {
    String[] kursyProgramowania =
        {
            "1. Java",
            "2. Java Aplikacje",
            "3. Java Strumienie",
            "4. Java Aspekty Zaawansowane",
            "5. Java android",
            "6. C#",
            "7. Tworzenie Aplikacji",
            "8. C# LINQ",
            "9. Pacsal"
        };

    int i = 0;
    do          // Rób wszystko co jest niżej w klamrach
      {
      System.out.println(kursyProgramowania[i]);     // DOPÓKI

      i++;
    }
    while (i < kursyProgramowania.length);   // While jest warunkiem prawdziwym!
  }

  public static void cwiczenieTablicaPetla(){


    /**  Stwórz tablicę 10 elementową, która jest tablicą liczb całkowitych (int). Zapisz do niej wielokrotność liczy 10.
        W tablicy o indeksie 0 miec 10, w tablicy o indeksie 1 miec 20, etc.
     **/

     int[] tab={10,20,30,40,50,60,70,80,90,100};
    System.out.println((tab.length));
    System.out.println(tab[0]);
    System.out.println(tab[1]);
    System.out.println(tab[2]);
    System.out.println(tab[3]);
    System.out.println(tab[4]);
    System.out.println(tab[5]);
    System.out.println(tab[6]);
    System.out.println(tab[9]);

  }

}

