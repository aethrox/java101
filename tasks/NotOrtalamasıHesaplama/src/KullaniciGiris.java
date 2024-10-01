import java.util.Scanner;

public class KullaniciGiris {
    // Scanner sınıfını kullanarak kullanıcı girişini almak için bir nesne tanımlıyoruz
    private static final Scanner input = new Scanner(System.in);

    // Varsayılan şifre tanımlanıyor
    private static final String defPass = "123456";

    public static void main(String[] args) {
        // Kullanıcıya giriş veya programı kapatma seçeneği sunuyoruz
        System.out.print("1.Giriş yap\n0.Programı kapat\nLütfen bir seçim yapınız: ");
        byte choice = input.nextByte(); // Kullanıcı seçimi alınıyor

        // Kullanıcının seçimine göre işlem yapılıyor
        switch (choice) {
            case 0:
                System.out.println("Sistem kapatılıyor bye!"); // Program kapatılıyor
                break;
            case 1:
                signIn(); // Giriş işlemi başlatılıyor
                break;
            default:
                throw new IllegalStateException("Lütfen geçerli bir seçim yapınız! " + choice); // Geçersiz seçim
        }
    }

    // Şifre değiştirme fonksiyonu
    public static void passwordChange() {
        while (true) {
            System.out.print("Yeni bir şifre giriniz: ");
            String newPassword = input.next(); // Yeni şifre alınıyor

            // Yeni şifre varsayılan şifreye eşit değilse kabul ediliyor
            if (!newPassword.equals(defPass)) {
                System.out.println("Şifre oluşturuldu!");
                break;
            } else {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz."); // Aynı şifre girilirse uyarı veriliyor
            }
        }
    }

    // Giriş işlemini gerçekleştiren fonksiyon
    public static void signIn() {
        System.out.print("Kullanıcı adınızı giriniz: ");
        String username = input.next(); // Kullanıcı adı alınıyor

        System.out.print("Şifrenizi giriniz: ");
        String password = input.next(); // Şifre alınıyor

        // Kullanıcı adı ve şifre doğrulaması yapılıyor
        if (username.equals("admin") && password.equals(defPass)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Giriş başarısız!"); // Yanlış giriş durumunda mesaj veriliyor

            // Yanlış şifre girildiyse şifre sıfırlama işlemi teklif ediliyor
            if (!password.equals(defPass)) {
                System.out.print("Şifreyi sıfırlamak ister misiniz? (evet/hayır): ");
                String isReset = input.next(); // Şifre sıfırlama isteği alınıyor

                // Kullanıcı "evet" derse şifre sıfırlama fonksiyonu çağrılıyor
                if (isReset.equalsIgnoreCase("evet")) {
                    passwordChange();
                }
            }
        }
    }
}