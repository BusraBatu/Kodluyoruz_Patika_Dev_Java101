public class ÇokBoyutluDizilerleB {
    /*
    Ödev
Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.

 *  *  *  *
 *        *
 *        *
 *  *  *  *
 *        *
 *        *
 *  *  *  *
     */
    public static void main(String[] args) {
        String arr[][]= new String[7][4];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(i==0|| i==3 || i== 6){
                   arr[i][j]=" * ";
                }else if(j==0 || j==3){
                    arr[i][j]=" * ";
                }else{
                    arr[i][j]="   ";
                }
            }

        }
        for (String[] each:arr) {
            for (String each2: each) {
                System.out.print(each2);
            }
            System.out.println();
        }

    }
}
