
package chapter1;
public class array {
    int[] arr; 

    public static void main(String[] args) {
      int[] arrDeclaration;
        arrDeclaration = new int[5];
        arrDeclaration[0] = 10;
        arrDeclaration[1] = 20;
       

         int[] testarr= new int[]{1,2};
         int testa[]= {1,2,3,4};

        //     IF RETURNS FUNCTION WAS NOT STATIC
        // //  array OuterInstance = new array();
        //  array.TwoD_Array inerrclassinstance = OuterInstance.new  TwoD_Array();
         //  inerrclassinstance.returns();

         var Value=TwoD_Array.returns();
         for (int[] index: Value){
            for (int element : index) {
                System.out.println(element);
            }
            
         }

         System.out.println("PrinTING FROM THE CLASS ITSELF: ");
         array objin= new array();
       TwoD_Array obj= objin.new TwoD_Array();
         obj.PrintHere();

    }

     public class TwoD_Array{
        int[][] arr=new int[2][];
       static int arr2[][]= new int[][]{{10,12},{20,30}};


       public static int[][] returns(){

        return arr2;

            
        }
     void PrintHere(){
        for (int i=0; i<arr2.length; i++){
            for(int j=0; j< arr2[i].length;j++) {

            System.out.print(arr2[i][j]+ " ");
        
            }
            System.out.println();
        }

     }
       

}

    }

    class Outside{

    }

