import java.util.Scanner;

public class ATMProjesi {
    /*
 Ödev
Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.
     */
    public static void main(String[] args) {
        String username, password;
        Scanner scan = new Scanner(System.in);
        System.out.println("COIN BANK'a Hoşgeldiniz!");

        int requestCount = 3;
        int balance = 25000;
        while (requestCount > 0) {
            System.out.print("Kullanıcı Adınız: ");
            username = scan.next();
            System.out.println();
            System.out.print("Şifreniz: ");
            password = scan.next();
            if (username.equals("qwer") && password.equals("123")) {
                System.out.println("Başarılı giriş yaptınız.");
                int choice;
                do {
                    System.out.print("İŞLEM MENÜSÜ:" +
                            "\n 1-Para Çekme" +
                            "\n 2-Para Yatırma" +
                            "\n 3-Bakiye Sorgulama" +
                            "\n 4-Çıkış" +
                            "\n Tercihiniz: ");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Lütfen çekmek istediğiniz miktarı giriniz: ");
                            int withdrawAmount = scan.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("Yetersiz Bakiye");
                            } else {
                                balance -= withdrawAmount;
                            }
                            break;
                        case 2:
                            System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz: ");
                            int depositAmount = scan.nextInt();
                            if (depositAmount > 0) {
                                balance += depositAmount;
                            } else {
                                System.out.println("Lütfen geçerli miktar giriniz");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }

                } while (choice != 4);
                System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkürler...");
                break;

            } else {

                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz. Kalan kullanım hakkınız: " + --requestCount);

            }
        }
    }
}
