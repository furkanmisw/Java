import java.util.*;

public class SayiTahmin {
    public static void main(String[] args) {
        Random random = new Random();
        int deneme = 1;
        Scanner scanner = new Scanner(System.in);
        int limit = 100;
        System.out.println("Max deger giriniz");
        limit = scanner.nextInt();
        int randomNumber = random.nextInt(limit);
        System.out.println("Random Sayi Uretildi");
        while (true) {
            System.out.println("DENEME :" + deneme);
            int tahmin = scanner.nextInt();
            if (tahmin == randomNumber) {
                System.out.println("TEBRIKLER BILDINIZ CEVAP :" + randomNumber);
                break;
            } else {
                deneme++;
                if (tahmin > randomNumber) {
                    System.out.println("Sayiyi Kucult");
                } else {
                    System.out.println("Sayiyi Yukselt");
                }
            }
        }
    }
}
