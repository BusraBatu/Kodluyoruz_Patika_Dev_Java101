import java.util.Arrays;

public class MatrisTranspozu {
    /*
    Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
     */
    public static void main(String[] args) {
        //Verilen matris

        int arr[][]={{1,2,3},{7,8,9}};
        for (int each[]:arr) {
            for (int each2:each) {
                System.out.print(each2+" ");
            }
            System.out.println();
        }
        System.out.println("==========================");
        //matrisin transpozu
        int arr2[][]= new int[3][2];
        for(int i=0; i<arr2.length; i++){
            for (int j = 0; j < arr2[i].length ; j++) {
                arr2[i][j]=arr[j][i];

            }
        }
        for (int each[]:arr2) {
            for (int each2:each) {
                System.out.print(each2+" ");
            }
            System.out.println();
        }
    }
}
