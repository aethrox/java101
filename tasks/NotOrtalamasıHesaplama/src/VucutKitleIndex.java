import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuz (M): ");
        double height = input.nextDouble();

        System.out.print("Kilonuz (KG): ");
        short weight = input.nextShort();

        double index = weight / Math.pow(height, 2);
        System.out.println("Vücut kitle indexiniz: " + index);

    }
}
