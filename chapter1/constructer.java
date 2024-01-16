package chapter1;

public class constructer {
    int length;
    int breadth;

    //parameterized
    constructer(int a , int b){
        length=a;
        breadth=b;

    }
    //default
    constructer(){
        length=0;
        breadth=0;
    }
}
class New{

    public static void main(String[] args) {
        constructer obj= new constructer();
        System.out.println(obj.length);

        constructer obj2= new constructer(10,20);
        System.out.println(obj2.length);


    }

}