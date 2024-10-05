import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayı: ");
        int n1 = input.nextInt();

        System.out.print("İkinci sayı: ");
        int n2 = input.nextInt();

        System.out.print("1.Toplama\n2.Çıkarma\n3.Bölme\n4.Çarpma\nLütfen bir işlem seçiniz (Numara olarak): ");
        byte processNumber = input.nextByte();

        switch (processNumber) {
            case 1:
                System.out.println("Toplama sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma sonucu: " + (n1 - n2));
                break;
            case 3:
                if (n2 != 0) System.out.println("Bölme sonucu: " + (n1 / n2));
                else System.out.println("Bir sayı 0'a bölünemez!");
                break;
            case 4:
                System.out.println("Çarpma sonucu: " + (n1 * n2));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + processNumber);
        }

    }
}
