import java.util.Scanner;

public class DikUcgenHipotenus {
    public static void main(String[] args) {
        // Değişkenler
        int a, b;
        double c;

        // Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenarı giriniz: ");
        a = input.nextInt();
        System.out.print("2.Kenarı giriniz: ");
        b = input.nextInt();

        c = Math.pow(a, 2) + Math.pow(b, 2);
        c = Math.sqrt(c);

        System.out.println("Hipotenüs: " + c);
    }
}
