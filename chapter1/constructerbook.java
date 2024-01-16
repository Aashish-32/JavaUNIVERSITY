package chapter1;

public class constructerbook {

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        System.out.println(obj.Perimeter());
    }
}

class Rectangle{
    int l;
    int b;

    public Rectangle(){
        l=0;
        b=0;
    }
    Rectangle(int a , int s){
        l=a;
        b=s;
    }

    int Perimeter(){
        return 2 *(l+b);
    }
}