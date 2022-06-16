import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        //Manav Kasa Programı
        //Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını
        // ekrana yazdıran programı yazın.
        //
        //Meyveler ve KG Fiyatları
        //
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL
        //Örnek Çıktı;
        //
        //Armut Kaç Kilo ? :0
        //Elma Kaç Kilo ? :1
        //Domates Kaç Kilo ? :1
        //Muz Kaç Kilo ? :2
        //Patlıcan Kaç Kilo ? :3
        //Toplam Tutar : 21.68 TL


        System.out.println("=======MANAVIMIZA HOSGELDINIZ=======");
        System.out.println("Meyveler ve kilogram fiyatlari \nArmut: 2,14 TL \nElma: 3,67 TL \nDomates: 1,11 TL \nMuz: 0,95 TL" +
                "\nPatlican: 5,00 TL");
        Scanner scan=new Scanner(System.in);
        System.out.println("Armut kac kilo? :");
        double armut=scan.nextDouble();
        System.out.println("Elma kac kilo? :");
        double elma=scan.nextDouble();
        System.out.println("Domates kac kilo? :");
        double domates=scan.nextDouble();
        System.out.println("Muz kac kilo? :");
        double muz=scan.nextDouble();
        System.out.println("Patllican kac kilo? :");
        double patlican=scan.nextDouble();

        double toplam=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.00);

        System.out.println("Toplam odemeniz gereken tutar: "+toplam);

        scan.close();






    }
}
