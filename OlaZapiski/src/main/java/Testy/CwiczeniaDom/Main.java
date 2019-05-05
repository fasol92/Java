package Testy.CwiczeniaDom;

public class Main {

  public static void main(String[] args){

    Samochod samochod = new Samochod(250, "audi", 3000, 2);
    samochod.info();

    System.out.println();

    Samochod samochod1 = new Samochod(30, "maluch", 1000, 5);
    samochod1.info();


    samochod.wlaczSwiatla();
    samochod.start();
    samochod.jedz();
    samochod.przyspiesz(100);
    samochod.klakson();
    samochod.hamuj();
    samochod.alarm();
  }

}
