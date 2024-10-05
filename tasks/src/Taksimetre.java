import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double perKm = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz: ");
        int km = input.nextInt();

        double total = (km * perKm) + 10;

        total = (total < 20) ? 20 : total;

        System.out.println("Toplam tutar: " + total);
    }
}
