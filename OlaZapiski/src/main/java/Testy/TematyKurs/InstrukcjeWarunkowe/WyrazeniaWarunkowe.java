package Testy.TematyKurs.InstrukcjeWarunkowe;

/*

    ZAPAMIETAC: jeżeli"
                         x % 2 == 0  - liczba jest parzysta!!!!

     KROTSZY SPOSOB:

     wyrazenie ? tu piszemy co ma sie stac, jesli wyrazenie to true: co ma sie stac, jesli wyrazenie jest false


 */

public class WyrazeniaWarunkowe {
  public static void main(String[]args) {

    System.out.println("Wywolanie sprawdzenieCZYparzysta()\n");
    sprawdzenieCZYparzysta();

    System.out.println("Wywolanie krotszySposobCzyParzysta()\n");
    krotszySposobCzyParzysta();

  }

  public static void sprawdzenieCZYparzysta(){

    int x = 5;      // Sprawdzenie, czy ona jest parzysta - korzystamy z MODULO %

    if (x % 2 == 0)
      System.out.println("parzysta");

    else
      System.out.println("nieparzysta");

  }

  public static void krotszySposobCzyParzysta(){

    int x = 5;

    String czyParzysta = x % 2 == 0 ? "parzysta" : "nieparzysta";
    System.out.println(czyParzysta);

    int y = 6;

    String czyNieparzysta = y % 2 == 0? "parzysta" : "nieparzysta";
    System.out.println(czyNieparzysta);


  }
}
