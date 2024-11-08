package odczytZPliku;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Odczyt1 {
    public static void main(String[] args) throws IOException {

        File mojPlik = new File ("danie.txt");
        Scanner patelnia = new Scanner (mojPlik);
        String linia;

        linia = patelnia.nextLine();

        System.out.println("Pierwsza linia pliku to: " + linia);

        //scanner odczytuje kolejne linie pliku (przechowuje pozycję odczytu)
        //String linia2 = patelnia.nextLine();
        //System.out.println("Druga lina pliku to: " + linia2);
        linia = patelnia.nextLine();
        System.out.println("Druga linia pliku to: " + linia);
        linia = patelnia.nextLine();
        System.out.println("Trzecia linia pliku to: " + linia);
        //linia = patelnia.nextLine();
        //System.out.println("Czwarta linia pliku to: " + linia);

        patelnia.close();
    }
}
