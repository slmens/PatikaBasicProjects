package Week1;
import java.util.Objects;
import java.util.Scanner;
public class UserLogIn {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        String userName,password,pseudoUserName,pseudoPassword;
        int isLogIn,isReset;
        boolean whileStopper=true;
        int counter=0;

        System.out.println("Lütfen önce kaydolun.");
        System.out.print("Kullanıcı isminiz ne olsun?: ");
        userName = input.nextLine();
        System.out.print("Şifreniz ne olsun?: ");
        password = input.nextLine();

        System.out.print("Teşekkürler sistemimize kaydedildi. Giriş yapma ekranını görmek için 1'e, sistemden çıkmak için 0'a basınız: ");
        isLogIn = input.nextInt();

       if (isLogIn == 1){
           while (whileStopper){
               System.out.print("Kullanıcı Adınızı Giriniz: ");
               pseudoUserName = input.next();

               System.out.print("Şifrenizi Giriniz: ");
               pseudoPassword = input.next();

               if ((!Objects.equals(pseudoUserName, userName)) || (!Objects.equals(pseudoPassword, password))){
                   counter++;
                   if (counter == 3){
                       System.out.print("Bilgilerinizi yenilemek ister misiniz? Evet için 1, hayır için 0 yazın: ");
                       isReset = input.nextInt();

                       if (isReset == 1){
                           System.out.print("Kullanıcı Adınızı Giriniz: ");
                           pseudoUserName = input.next();

                           System.out.print("Şifrenizi Giriniz: ");
                           pseudoPassword = input.next();

                           while ((Objects.equals(userName, pseudoUserName)) || (Objects.equals(password, pseudoPassword))){
                               System.out.println("Öncekilerle aynı bilgileri girdiniz. Tekrar deneyin...");

                               System.out.print("Yeni kullanıcı Adınızı Giriniz: ");
                               pseudoUserName = input.next();

                               System.out.print("Yeni şifrenizi Giriniz: ");
                               pseudoPassword = input.next();

                           }
                               userName = pseudoUserName;
                               password = pseudoPassword;

                               System.out.println("Bilgileriniz güncellendi, giriş sayfasına yönlendiriliyorsunuz...");

                               Thread.sleep(2000);

                               continue;

                       } else {
                           System.out.println("Sistem kapatılıyor...");
                           System.exit(0);
                       }
                   }else if (counter == 5){
                       System.out.println("Çok fazla deneme yaptınız güvenlik sebebiyle sistem kapatılıyor.");
                       System.exit(0);
                   }
                   System.out.println("Girmiş olduğunuz bilgiler yanlış. Lütfen tekrar deneyin");
                   continue;
               }else {
                   System.out.println("Sisteme giriş yapıldı.");
                   System.exit(0);
               }

           }
       }else {
           System.out.println("Sistem kapatılıyor...");
           System.exit(0);
       }
    }
}
