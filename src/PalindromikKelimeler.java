import java.util.Scanner;

public class PalindromikKelimeler {
    static boolean isPalindrom() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String word = scan.next();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (word.equals(reverse)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Girmiş olduğunuz kelime " + (isPalindrom() ? "palindromdur. " : "palindrom değildir."));

    }
}
