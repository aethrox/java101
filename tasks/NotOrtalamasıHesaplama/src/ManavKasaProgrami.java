import java.text.DecimalFormat;
import java.util.Scanner;

public class ManavKasaProgrami {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        // Kilogram başına meyve ve sebze fiyatları (TL)
        float pricePerKgPears = 2.14f, pricePerKgApples = 3.67f, pricePerKgTomatoes = 1.11f, pricePerKgBananas = 0.95f, pricePerKgEggplants = 5.00f;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut (ADET): ");
        int quantityPears = input.nextInt();

        System.out.print("Elma (ADET): ");
        int quantityApples = input.nextInt();

        System.out.print("Domates (ADET): ");
        int quantityTomatos = input.nextInt();

        System.out.print("Muz (ADET): ");
        int quantityBananas = input.nextInt();

        System.out.print("Patlıcan (ADET): ");
        int quantityEggPlants = input.nextInt();

        String total = df.format((quantityPears * pricePerKgPears) + (quantityApples * pricePerKgApples) + (quantityTomatos * pricePerKgTomatoes) + (quantityBananas * pricePerKgBananas) + (quantityEggPlants * pricePerKgEggplants));
        System.out.print("Toplam tutar: " + total);
    }
}
