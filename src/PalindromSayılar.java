public class PalindromSayılar {
    /*
    Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     */

    static boolean isPalindrom(int num){
        int temp=num, reverse=0, last;
        while(temp!=0){
            last=temp%10;
            reverse=(reverse*10)+last;
            temp/=10;
        }
        if(reverse==num) return true;
        else return false;


    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(3565));
    }
}
