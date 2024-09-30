import java.text.DecimalFormat;
import java.util.Scanner;

public class KDVHesaplama {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        kdvOran = (tutar > 0) && (tutar <= 1000) ? 0.18 : 0.8;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + df.format(kdvTutar));
        System.out.println("KDV'li Tutarı: " + df.format(kdvliTutar));
    }
}
