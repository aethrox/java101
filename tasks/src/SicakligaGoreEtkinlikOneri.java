import java.util.Scanner;

public class SicakligaGoreEtkinlikOneri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        double heat = input.nextDouble();

        System.out.print("Önerilen etkinlik: ");
        if (heat < 5) System.out.println("Kayak");
        else if (heat <= 25){
            System.out.println((heat <= 15 ? "Sinema" : "Piknik"));
        } else {
            System.out.println("Yüzme");
        }
    }
}
