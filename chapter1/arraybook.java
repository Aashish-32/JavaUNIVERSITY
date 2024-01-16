package chapter1;
// import java.util.Scanner;
import java.util.*;

public interface arraybook {
  void PRINT();

}
 class array{
    public static void main(String[] args) {
        int a[][]= new int[3][3];

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter elements");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]= sc.nextInt();
            }
            
        }
                System.out.println("Printing");

                // for ( int i = 0; i < 3; i++) {
                //     for ( int j = 0; j < 3; j++) {
                //         System.out.print(a[i][j] + " ");
                //     }
                //     System.out.println();

                // }
                    // for (int[] index : a) {
                    //     for(int value : index) {
                    //         System.out.print(value);
                    //     }
                    //     System.out.println();
                    // }
            

                    int one[]=new int[]{1,2,3,4,5,7};
                   System.out.println( Arrays.binarySearch(one, 66));
                Arrays.fill(one, 69);
                for (int i : one) {
                     System.out.println(i);

                }
        }
    }

    class Newss extends array implements arraybook {
      Newss(){
        System.out.println("gg");
      }
       public void PRINT(){
        System.out.println("S");
      }
    }
 

    