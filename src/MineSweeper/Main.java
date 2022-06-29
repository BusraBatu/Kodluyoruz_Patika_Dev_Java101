package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row;
        int column;
        System.out.println("Mayin Tarlasina Hosgeldiniz");
        System.out.println("Lutfen oynamak istedginiz boyutlari giriniz");
        System.out.print("Satir sayisi : ");
        row = scan.nextInt();
        System.out.print("Sutun sayisi : ");
        column = scan.nextInt();

        MayınTarlası m = new MayınTarlası(row, column);
        m.run();


    }
}
