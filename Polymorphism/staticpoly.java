package Polymorphism;

public class staticpoly {
static int add(int a,int b){
    return a+b;
}
    
    static int add(int a,int b,int c){ 
        return a+b+c;
    
}
}
final class Caller{
    public static void main(String[] args) {
        System.out.println(staticpoly.add(10,20));
        System.out.println(staticpoly.add(10,20,30));
    }
}