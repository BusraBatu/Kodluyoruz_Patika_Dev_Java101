import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {
        //Koç Burcu : 21 Mart - 20 Nisan
        //
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //
        //Yay Burcu : 22 Kasım - 21 Aralık
        //
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //
        //Kova Burcu : 22 Ocak - 19 Şubat
        //
        //Balık Burcu : 20 Şubat - 20 Mart
        //
        //Ödev
        //Aynı örneği switch-case kullanmadan yapınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Kacinci ayda dogdugunuzu giriniz: ");
        int month = scan.nextInt();
        System.out.println("Hangi gun dogdugunuzu giriniz: ");
        int day = scan.nextInt();
        boolean isError = false;
        String burc="";

        if (month == 1) {
            if (day >= 1 && day <= 21) {
                burc = "Oglak";
            } else if (day >= 22 && day <= 31) {
                burc = "Kova";
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 19) {
                burc = "Kova";
            } else if (day >= 20 && day <= 29) {
                burc = "Balik";
            } else {
                isError = true;
            }
        }else if (month == 3)  {
            if (day >= 1 && day <= 20) {
                burc = "Balik";
            } else if (day >= 21 && day <= 31) {
                burc = "Koc";
            } else {
                isError = true;
            }
        }else if (month == 4) {
            if (day >= 1 && day <= 21) {
                burc = "Koc";
            } else if (day >= 22 && day <= 30) {
                burc = "Boga";
            } else {
                isError = true;
            }
        }else if (month == 5) {
            if (day >= 1 && day <= 22) {
                burc = "Boga";
            } else if (day >= 23 && day <= 31) {
                burc = "Ikizler";
            } else {
                isError = true;
            }
        }else if (month == 6) {
            if (day >= 1 && day <= 22) {
                burc = "Ikizler";
            } else if (day >= 23 && day <= 30) {
                burc = "Yengec";
            } else {
                isError = true;
            }
        }else if (month == 7) {
            if (day >= 1 && day <= 22) {
                burc = "Yengec";
            } else if (day >= 23 && day <= 31) {
                burc = "Aslan";
            } else {
                isError = true;
            }
        }else if (month == 8) {
            if (day >= 1 && day <= 22) {
                burc = "Aslan";
            } else if (day >= 23 && day <= 31) {
                burc = "Basak";
            } else {
                isError = true;
            }
        }else if (month == 9) {
            if (day >= 1 && day <= 22) {
                burc = "Basak";
            } else if (day >= 23 && day <= 30) {
                burc = "Terazi";
            } else {
                isError = true;
            }
        }else if (month == 10) {
            if (day >= 1 && day <= 22) {
                burc = "Terazi";
            } else if (day >= 23 && day <= 31) {
                burc = "Akrep";
            } else {
                isError = true;
            }
        }else if (month == 11) {
            if (day >= 1 && day <= 21) {
                burc = "Akrep";
            } else if (day >= 22 && day <= 30) {
                burc = "Yay";
            } else {
                isError = true;
            }
        }else if (month == 12) {
            if (day >= 1 && day <= 21) {
                burc = "Yay";
            } else if (day >= 22 && day <= 31) {
                burc = "Oglak";
            } else {
                isError = true;
            }
        }else{
            isError=true;
        }

        if (isError){
            System.out.println("Hatali giris yaptiniz tekrar deneyiniz");
        }else{
            System.out.println("Burcunuz: "+ burc);
        }



    }
}
