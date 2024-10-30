package podstawy;

public class DivDemo {
    public static void main(String[] args) {
        int ludzie = 9;
        int kompy = 13;

        double kompNaLudzia = (double)kompy / ludzie;


        System.out.println("Komp na ludzia: " + kompNaLudzia);

        double czlowieki;

        czlowieki = ludzie;

        kompNaLudzia = 1.9999;
        kompy = (int)kompNaLudzia;
        System.out.println(kompy);
    }
}
