package EbobEkok;
import java.util.Scanner;
public class EbobEkok  {

    public static void main(String[] args) {
        int sayi1, sayi2, ebob = 1, ekok = 1;

        // Kullanıcıdan iki sayı alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        sayi2 = scanner.nextInt();

        // EBOB Hesaplama
        while (sayi1 != sayi2) {
            if (sayi1 > sayi2) {
                sayi1 -= sayi2;
            } else {
                sayi2 -= sayi1;
            }
        }
        ebob = sayi1;

        // EKOK Hesaplama
        ekok = (sayi1 * sayi2) / ebob;

        // Sonuçları Yazdırma
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
}
