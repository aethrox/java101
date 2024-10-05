import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        int math = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        int physics = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        int turkish = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        int chemistry = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        int music = input.nextInt();

        int average = (math + physics + turkish + chemistry + music) / 5;
        if (!(average > 0 && average <= 100)){
            System.out.println("Ortalama hesaplanamıyor!");
        } else {
            if(average >= 55){
                System.out.println("Sınıfı geçtin!");
            } else {
                System.out.println("Sınıfta kaldın!");
            }
            System.out.println("Ortalaman: " + average);
        }
    }
}
