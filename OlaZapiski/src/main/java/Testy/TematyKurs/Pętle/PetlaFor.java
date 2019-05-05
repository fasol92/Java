package Testy.TematyKurs.Pętle;

/*
PĘTLA FOR - ulepszona pętla, używamy dla tablic (oraz innych podobnych obiektów)
            OPEROWANIE NA KAŻDYM ELEMENCIE TABLICY

            for ( String myValue: tablica)

            for + typ + nazwaZmiennej + tablica.

            Zmienna - przechowuje poszczególną wartość kżdego elementu z tablicy, przy każdym przejsciu w pętli.


 */

public class PetlaFor {
  public static void main(String[]args) {
    System.out.println( " \n Wywolanie petlaFor1");
    petlaFor1();

    System.out.println(" \n Wywolanie enhancedFor");
    enhancedFor();

  }

  public static void petlaFor1(){

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

    for (int i = 0; i < kursyProgramowania.length; i++)
    {
      System.out.println(kursyProgramowania[i]);
    }

  }

  public static void enhancedFor(){
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

    for (String myValue: kursyProgramowania)
    {
      System.out.println(myValue);
    }

  }
}
