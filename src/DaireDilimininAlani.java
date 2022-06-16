import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String[] args) {
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //
        //𝜋 sayısını = 3.14 alınız.
        //
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        Scanner scan= new Scanner(System.in);
        System.out.println("Alanini hesaplamak istediginiz dairenin yaricapini giriniz: \nAlanini hesaplamak istediginiz dairenin " +
                "merkez aci olcusunu giriniz: ");
        double yaricap=scan.nextDouble();
        double merkezaci=scan.nextDouble();
        double pi=3.14;
        double alan=pi*(yaricap*yaricap)*merkezaci/360;
        System.out.println("Girdiginiz bilgilere gore daire diliminin alani: "+alan);
        scan.close();
















    }

}
