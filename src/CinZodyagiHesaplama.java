import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        //Ödev - Çin Zodyağı Hesaplama
        //Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
        //
        //Çin Zodyağı nedir?
        //
        //4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
        // Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır
        // ve yıldızlarla pek bir ilgisi yoktur.
        //
        //Çin Zodyağı nasıl hesaplanır?
        //
        //Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
        //
        //Doğum Tarihi %12 = 0 ➜ Maymun
        //
        //Doğum Tarihi %12 = 1 ➜ Horoz
        //
        //Doğum Tarihi %12 = 2 ➜ Köpek
        //
        //Doğum Tarihi %12 = 3 ➜ Domuz
        //
        //Doğum Tarihi %12 = 4 ➜ Fare
        //
        //Doğum Tarihi %12 = 5 ➜ Öküz
        //
        //Doğum Tarihi %12 = 6 ➜ Kaplan
        //
        //Doğum Tarihi %12 = 7 ➜ Tavşan
        //
        //Doğum Tarihi %12 = 8 ➜ Ejderha
        //
        //Doğum Tarihi %12 = 9 ➜ Yılan
        //
        //Doğum Tarihi %12 = 10 ➜ At
        //
        //Doğum Tarihi %12 = 11 ➜ Koyun
        //
        //Senaryo
        //
        //Doğum Yılınızı Giriniz : 1990
        //Çin Zodyağı Burcunuz : At

        Scanner scan= new Scanner(System.in);
        System.out.println("Dogum yiliniz giriniz: ");
        int year=scan.nextInt();
        int howMany=year%12;
        String burc="";
        switch (howMany){
            case 0:
                burc="Maymun";
                break;
            case 1:
                burc="Horoz";
                break;
            case 2:
                burc="Köpek";
                break;
            case 3:
                burc="Domuz";
                break;
            case 4:
                burc="Fare";
                break;
            case 5:
                burc="Öküz";
                break;
            case 6:
                burc="Kaplan";
                break;
            case 7:
                burc="Tavşan";
                break;
            case 8:
                burc="Ejderha";
                break;
            case 9:
                burc="Yılan";
                break;
            case 10:
                burc="At";
                break;
            case 11:
                burc="Koyun";
                break;

        }

        System.out.println("Çin Zodyağı Burcunuz : "+burc);

    }
}
