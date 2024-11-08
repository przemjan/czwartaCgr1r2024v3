package ZapisDoPliku;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo  {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("danie.txt");

        pw.println("Piotr lubi pizzę (dużą!) :)");

        //zapisanie kolejnej linii
        pw.println("Szymon lubi jeść kaszankę");

        pw.close();
    }
}
