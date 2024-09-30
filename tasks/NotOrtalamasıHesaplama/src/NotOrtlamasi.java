import java.util.Scanner;

public class NotOrtlamasi {
    public static void main(String[] args) {
        short mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextShort();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextShort();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextShort();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextShort();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextShort();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextShort();

        int ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalamanız: " + ortalama);
        System.out.print(ortalama >= 60 ? "Geçtiniz!" : "Kaldınız.");

    }
}
