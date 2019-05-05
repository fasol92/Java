package Testy.TematyKurs;
import java.util.Scanner;
import java.util.Locale;

/*
  SCANNER - pozwala skanować tekst w poszukiwaniu kolejnych napisów, czy liczb rozdzielonych separatorem. Można dzięki niej przeglądać
  zawartość plików, stron internetowych.
  Wyswietlanie danych w konsoli:  System.out
  Odczyt ze strumienia:  System.in


  java.util -> najpierw musimy zaimportować klasę, żeby z niej skorzystać.

         nextLine() -   wstrzymuje działanie programu, do momentu, aż user wpisze coś w konsoli i zatwierdzi enterem.
         nextInt() - odczytuje kolejną liczbę całkowitą
         nextDouble() - odczytuje kolejną liczbę zmiennoprzecinkową
         nextBoolean() - odczytuje kolejną wartość typu boolean

         + analogiczne metody dla typów: byte, short, long, float.

         NIE ISTNEIJE dla char!
 */

class KlasaScanner {
  public static void main(String[] args){  // SKRÓT: psvm

    Scanner scan = new Scanner(System.in);
    scan.useLocale(Locale.GERMAN);
// IMIE
    System.out.println("Jak masz na imię? ");
    String firstName = scan.nextLine();
// NAZWISKO
    System.out.println("Witaj " + firstName + " Podaj nazwisko");
    String surname = scan.nextLine();
    System.out.println("Dziękuję " + firstName + " " + surname + " Zapisane");
// MIASTO
    System.out.println("Podaj miejsce zamieszkania ");
    String city = scan.nextLine();
    System.out.println(city + " Zanotowałem");

/* WIEK - nie wiem co tu sie nie zgadza, miałam zaimportowane:   Scanner age = new Scanner(System.in);
    System.out.println("Ile masz lat? " + age);
    double age =  scan.nextDouble();
    System.out.println("Mam siostre w Twoim wieku");
  } */
    System.out.println("Ile masz lat?");
    int age = scan.nextInt();
    System.out.println(" Mam siostrę, która ma " + age + " lat");

    System.out.println("Jakie są Twoje zarobki?");
    double payment = scan.nextDouble();
    System.out.println(payment  + " To kwota jaką zarabia 30% ludzi w Polsce");

}}
