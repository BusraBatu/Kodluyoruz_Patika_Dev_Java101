import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        //Not Ortalaması Hesaplayan Program
        //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        //
        //Ödev
        //Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        //
        //Not : If ve Else kullanılmayacak...
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen matematik notunuzu giriniz: ");
        int mat=scan.nextInt();
        System.out.println("Lutfen fizik notunuzu giriniz: ");
        int fizik=scan.nextInt();
        System.out.println("Lutfen kimya notunuzu giriniz: ");
        int kimya=scan.nextInt();
        System.out.println("Lutfen turkce notunuzu giriniz: ");
        int turkce=scan.nextInt();
        System.out.println("Lutfen tarih notunuzu giriniz: ");
        int tarih=scan.nextInt();
        System.out.println("Lutfen muzik notunuzu giriniz: ");
        int muzik=scan.nextInt();
        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double ort=toplam/6;
        System.out.println(ort);

        System.out.println( ort>60 ? "Sinifi Gecti" : "Sinifta Kaldi");
        scan.close();
    }
}
