package MineSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MayınTarlası {
    /*
    Java dilinde Mayın Tarlası oyunu yapmanızı bekliyoruz.

Oyun Kuralları :
Oyun metin tabanlıdır.
Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli.
Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı.
 Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır.
  (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz,
 sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı.
 Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
     */


        int rowNumber;
        int colNumber;
        int size;
        int map[][];
        int board[][];
        boolean game = true;

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

    public MayınTarlası(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

        public void run() {
        int row;
        int col;
        int success=0;
        prepareGame();
        print(map);
        System.out.println("Oyun basladi !");
        while (game) {
            print(board);
            System.out.print("Satir : ");
            row = scan.nextInt();
            System.out.print("Sutun : ");
            col = scan.nextInt();

            if (row<0 || row>=rowNumber) {
                System.out.println("Gecersiz koordinat");
                continue;
            }
            if (col<0 || col>=colNumber) {
                System.out.println("Gecersiz koordinat");
                continue;
            }
            if (map[row][col] != -1) {
                check(row, col);
                success++;
                if (success == (size-(size/4))) {
                    System.out.println("Tebrikler Basardiniz. Hicbir mayina basmadiniz");
                    break;
                }
            } else {
                game = false;
                System.out.println("Game Over");
            }

        }
    }

        public void check(int r, int c) {
        if (map[r][c] == 0) {

            if ((c < colNumber - 1) && (map[r][c + 1] == -1)) {
                board[r][c]++;
            }
            if ((r < rowNumber - 3) && (map[r + 1][c] == -1)) {
                board[r][c]++;
            }
            if ((r > 0) && (map[r - 1][c] == -1)) {
                board[r][c]++;
            }
            if ((c > 0) && (map[r][c - 1] == -1)) {
                board[r][c]++;
            }
            if (board[r][c] == 0) {
                board[r][c] = -2;
            }
        }
    }

        public void prepareGame() {
        int randRow;
        int randCol;
        int count = 0;

        while (count != (size / 4)) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);

            if (map[randRow][randCol] != (-1)) {
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }

        public void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }




}
