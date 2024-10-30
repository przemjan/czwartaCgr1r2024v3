package podstawy;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numer_buta;
        System.out.println("Podaj numer buta: ");
        numer_buta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj swoją średnią z anielskiego: ");
        double average = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Jak masz na imię: ");
        String name = scanner.nextLine();

        System.out.println("Twój numer buta " + numer_buta +
                ", twoja średnia: " + average + ", imię: " + name);

    }
}
