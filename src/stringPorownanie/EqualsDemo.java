package stringPorownanie;

public class EqualsDemo {
    public static void main(String[] args) {
        String imie1 = "Arnold";
        String imie2 = "Arnold";

        if( imie1.equals(imie2) )    {
            System.out.println("Te imiona są takie same");
        }
        else {
            System.out.println("Te imiona różnią się");
        }
    }
}
