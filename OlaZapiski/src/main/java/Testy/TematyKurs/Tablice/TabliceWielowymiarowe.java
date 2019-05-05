package Testy.TematyKurs.Tablice;

/*
TABLICA WIELOWYMIAROWA:
np.:  do szach (dwuwymiarowa)

Mamy 3 kolumny + 4 wiersze

----------------------------------------
   [0][0]   |   [0][1]   |   [0][2]
----------------------------------------

----------------------------------------
   [1][0]   |   [1][1]   |   [1][2]
----------------------------------------

----------------------------------------
   [2][0]   |   [2][1]   |   [2][2]
----------------------------------------
----------------------------------------
   [3][0]   |   [3][1]   |   [3][2]
----------------------------------------

[] []
ilosc wierszy + ilość kolumn

*/

public class TabliceWielowymiarowe {

  public static void main(String[] args) {

    // Tablica dwuwymiarowa:
    int[][] tab = new int[4][3]; // pierwszy argument to ilość wierszy, drugi argument to ilość kolumn

    tab[0][0] = 25;  // Przypisanie wartośći do poszczególnego miejsca na mojej planszy
    tab[3][0] = 70;

    System.out.println(tab[0][0]);
    System.out.println(tab[3][0]);

    // INICJALIZACJA ZA JEDNYM RAZEM
    int[][] tab2 = {
        {4, 16, 17},
        {2, 8, 9},
        {3, 5, 12},
        {12, 4, 6}
    };

    System.out.println(tab2[1][1]);
  }

  }

