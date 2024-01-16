package chapter1;
class overloding{
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2.5f, 3));
        System.out.println(sum(1, 2,3));

    }



    static int sum(int a , int b){
        System.out.println("this is 2 int sum");
    return a+b;
    }

    static int sum(int a , int b , int c){
         System.out.println("this is 3 int sum");
        return a+b+c;
    }
    static float sum(float a , int b){
  System.out.println("this is One  int and one float sum");  
        return a+b;
    }
}