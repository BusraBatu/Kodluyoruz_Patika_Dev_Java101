import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
      //  Koşullar :
//
      //  Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
      //  Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
      //  Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
      //  Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
      //  Ödev
      //  Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

        Scanner scan= new Scanner(System.in);
        System.out.println("Etkinlik onerisi icin sicaklik bilgisini giriniz: ");
        int sicaklik=scan.nextInt();


        if (sicaklik<5){
            System.out.println("Kayak");
        }else if(sicaklik<15){
            System.out.println("Sinema");
        }else if(sicaklik<25){
            System.out.println("Piknik");
        }else{
            System.out.println("Yuzme");
        }

scan.close();













    }
}
