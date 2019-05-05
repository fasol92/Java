package Testy.CwiczeniaDom;

public class Samochod {

  private int moc;
  private String marka;
  private int pojemnoscSilnika;
  private int iloscOsob;

  private int predkosc;

  public Samochod(int moc, String marka, int pojemnoscSilnika, int iloscOsob){
    this.moc = moc;
    this.marka = marka;
    this.pojemnoscSilnika = pojemnoscSilnika;
    this.iloscOsob = iloscOsob;
  }


  public void start(){
    System.out.println("Wlacz sie");
  }

  public void jedz(){
    System.out.println("Jadę samochodem");
  }

  public void hamuj(){
    System.out.println("Stop, hamowanie");
  }

  public void wlaczSwiatla(){
    System.out.println("Swiatła włączone");
  }

  public void klakson(){
    System.out.println("Wydaje dzwiek");
  }

  public void alarm(){
    System.out.println("Włacz alarm");
  }

  public void przyspiesz(int predkosc){
    this.predkosc = predkosc;

    System.out.println("Przyspieszono do predkosci: " + this.predkosc + " km/h");

  }

  public void info(){
    System.out.println("moc: " + moc);
    System.out.println("marka: " + marka);
    System.out.println("pojemnosc silnika: " + pojemnoscSilnika + " cm^3");
    System.out.println("Ilość osób: " + iloscOsob);
  }
}
