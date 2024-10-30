package podstawy;

public class StringiDemo {
    public static void main(String[] args) {
        String name = "Onufry";

        int dlugosc = name.length();

        char inicjal = name.charAt(3);

        String male, duze;

        male = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println(name);
        System.out.println(male + ", " + duze);

    }
}
