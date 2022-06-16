import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        //Ödev
        //Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        // eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        // şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

        String username="patikaaa";
        String password="java101";
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kullanici isminizi kucuk karakterlerle giriniz: ");
        String kullanici=scan.next();
        System.out.println("Lutfen sifrenizi giriniz: ");
        String sifre=scan.next();
        if (username.equals(kullanici)){
            if (password.equals(sifre)){
                System.out.println("Basarili giris yaptiniz!");
            }else if(!password.equals(sifre)){
                System.out.println("Basarisiz deneme! \nSifrenizi sifirlamak istiyorsaniz 1'i giriniz");
                int secim=scan.nextInt();
                if (secim==1){
                    System.out.println("Lutfen olusturmak istediginiz yeni sifrenizi giriniz: ");
                    String yeni=scan.next();
                    if (yeni.equals(password)){
                        System.out.println( "Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else{
                        password=yeni;
                        System.out.println("Şifre oluşturuldu" );
                    }

                }else{
                    System.out.println("Hatali giris yaptiniz... Gule gule...");
                }

            }
        }
        scan.close();


















    }
}
