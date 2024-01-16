package chapter1;

 interface interfaces2 extends abc, pqr {
    final int s=10;
    float k=20.3f;
    final static double d=20232;
    static final char c='C';
     void classs();
}
 interface abc {}
 interface ssbc {}
 interface pqr {}

public abstract class interfaces implements interfaces2, ssbc{
    public void classs(){
       // s=20; The final field interfaces2.s cannot be assigned
        System.out.println(interfaces2.s);
    }
}
class Implement777 implements interfaces2{
    public void classs(){
        System.out.println( s + (int)d + (int)k );
    }
public static void main(String[] args) {
    Implement777 obj = new Implement777();
    obj.classs();
}

}
