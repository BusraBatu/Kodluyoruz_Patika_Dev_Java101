import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //
        //Geçme Notu : 55
        //
        //Ödev
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.


        Scanner scan= new Scanner(System.in);
        System.out.println("Ortalamanizin hesaplanmasi icin notlarinizi giriniz: \nMatematik: ");
        int mat=scan.nextInt();
        System.out.println("Fizik: ");
        int fizik=scan.nextInt();
        System.out.println("Turkce: ");
        int turkce=scan.nextInt();
        System.out.println("Kimya: ");
        int kimya=scan.nextInt();
        System.out.println("Muzik: ");
        int muzik=scan.nextInt();
        int toplam=0;
        int count=0;
        if ((mat>0&&mat<100)){
            toplam+=mat;
            count++;
        }
        if ((fizik>0&&fizik<100)){
            toplam+=fizik;
            count++;
        }
        if (turkce>0&&turkce<100){
            toplam+=turkce;
            count++;
        }
        if(kimya>0&&kimya<100) {
            toplam += kimya;
            count++;
        }
        if(muzik>0&&muzik<100) {
            toplam+=muzik;
            count++;
        }

        double ortalama=toplam/count;
        System.out.println("Ortalamaniz: "+ortalama);
        if (ortalama>=55){
            System.out.println("Tebrikler! Sinifi gectiniz!");
        }else{
            System.out.println("Sinifta kaldiniz. Seneye tekrar calisiniz...");
        }





















    }
}
