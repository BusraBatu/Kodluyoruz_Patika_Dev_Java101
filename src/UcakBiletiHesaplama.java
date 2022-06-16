import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        //Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        // Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        // Mesafe başına ücret 0,10 TL / km olarak alın.
        // İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        //
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        // Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        //İpucu
        //Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
        //Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
        //İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
        //Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
        //Toplam Tutar = (135-27)* 2 = 216 TL

        //Senaryolar
        //Senaryo 1
        //Mesafeyi km türünden giriniz : 1500
        //Yaşınızı giriniz : 20
        //Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
        //
        //Toplam Tutar = 216 TL

        //Senaryo 2
        //Mesafeyi km türünden giriniz : -500
        //Yaşınızı giriniz : 1
        //Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77
        //
        //Hatalı Veri Girdiniz !

        //Senaryo 3
        //Mesafeyi km türünden giriniz : 200
        //Yaşınızı giriniz : 35
        //Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1
        //
        //Toplam Tutar = 20.0 TL

        System.out.println("=========GEZKAZAN HAVAYOLLARINA HOSGELDINIZ!!!========");

        Scanner scan= new Scanner(System.in);
        double perKmPayment=0.10;
        System.out.println("Seyahat edeceginiz mesafeyi km turunden giriniz: ");
        double km=scan.nextDouble();
        System.out.println("Yasinizi giriniz: ");
        int yas=scan.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tip=scan.nextInt();

        double toplamTutar=(km*0.10);
        double nihaiTutar=0;


        if (km>0 && yas>0 && (tip==1 || tip==2)){
            if (yas<=12){
              nihaiTutar= toplamTutar*0.5;
            }else if(yas>12 && yas<24){
                nihaiTutar=toplamTutar*0.9;
            }else if(yas>65){
                nihaiTutar=toplamTutar*0.7;
            }else{
                nihaiTutar=toplamTutar;
            }
            if(tip==2){
                nihaiTutar=(nihaiTutar*2)*0.8;
            }
            System.out.println("Odemeniz gereken tutar: "+ nihaiTutar);

        }else{
            System.out.println("Hatali veri girdiniz!");
        }























    }
}
