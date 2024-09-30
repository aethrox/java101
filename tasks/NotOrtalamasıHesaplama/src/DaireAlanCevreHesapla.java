import java.util.Scanner;

public class DaireAlanCevreHesapla {
    public static void main(String[] args) {
        float pi = 3.14f;
        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarı çapını giriniz: ");
        int r = input.nextInt();

        double alan = pi * Math.pow(r, 2);
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
    }
}
