package Week1;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);


        String userName, password;
        int kalanHak = 3;
        int miktar = 1500;
        int secim;
        while (kalanHak > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("ahmet") && password.equals("12345")) {
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    secim = input.nextInt();

                    switch (secim){
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            miktar += price;
                            System.out.println(price + " TL hesabınıza yatırıldı");
                            // Thread.sleep ile kodların hemen çalışmasını önlüyorum. 1 saniyelik bir gecikmeden sonra çalışıyorlar
                            // Bu sayede program daha gerçekçi çalışıyor bence
                            Thread.sleep(1000);
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            int amount = input.nextInt();
                            if (amount > miktar) {
                                System.out.println("Bakiye yetersiz.");
                                Thread.sleep(1000);
                            } else {
                                miktar -= amount;
                                System.out.println(amount + " TL hesabınızdan çekildi");
                                Thread.sleep(1000);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + miktar);
                            Thread.sleep(1000);
                            break;
                    }
                } while (secim != 4);
                // 4 yaparsa while döngüsü bitiyor ve program kapanıyor
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                kalanHak--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

                switch (kalanHak){
                    case 0:
                        System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");

                    default:
                        System.out.println("Kalan Hakkınız : " + kalanHak);
                }
            }
        }

    }
}
