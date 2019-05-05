package Testy.TematyKurs.Zmienne;

public class Konkatenacja { //klasa
  public static void main(String[] args) {
    String a = "Ola";
    long b = 659598989898L;
    long c = 214548899L;
    long d = 4256378264783L;

    // TYPY PROSTE: int, byte, short, long
    // TYPY zmiennoprzecinkowe: float, double - najczesciej uzywamy double
    // TYP boolean: true false

    double liczba2 = 5.67;
    float liczba3 = 4.57f; // jesli chcesz przejść do float, to trzeba dodać f - to takie upewnienie się, czy chcę stracić precyzje

    char znak = 'A';
    System.out.println(c);

    String nazwisko = "Testowa";
    String imie = "Ola";
    System.out.println( "Imie: " + imie + ", nazwisko: " + nazwisko);


    String aa = "Ola ";
    String bb = "+";
    String cc = "Fasola ";

    System.out.println("Imię " + aa + bb + " pseudonim " + cc);

    System.out.println(2 + 2);
    System.out.println(2 * 2);
    System.out.println(2 / 2);
    System.out.println(2 - 2);

    System.out.println(1 / 2); // 0, bo w wyrazeniu biora udział liczby całkowite, wiec wynik będzie również liczbą całkowita
    System.out.println(1.0 / 2); //ułamkowe, korzystam ze zmiennoprzecinkowych
    System.out.println(1 / 2.0);
    System.out.println(2.0 / 2);
// Można składać łańcuchy z nie łańcuchami, np z liczbami, wówczas wszystko co nie jest łancuchem - automatycznie przekształci sie w łancuch, zaraz potem jest sklejanie
    // aby określić kolejność wykonwania operacji - wykorzystuję nawiasy
    System.out.println("2" + "2"); // dodawanie łańcucha do łańcucha, wynik 22 - bo łańcuchy sklejają się KONKATENACJA
    System.out.println("2" + 2); // liczba automatycznie przekształci sie w łancuch
    System.out.println(2 + 2 * 2);
    System.out.println((2 + 2) * 2);
    System.out.println(" 2 + 2 = " + 2 + 2); // przekształcenie w łancuch i konkatenacje , wynik 22
    System.out.println("2 + 2 = " + (2 + 2));


    System.out.println();

    // integer - l. całkowita
  }
}

