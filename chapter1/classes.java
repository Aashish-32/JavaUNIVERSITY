package chapter1;
public class classes {
    private int l;
    private int b;
    private int h;

     void setdata(int x, int y , int z){
        l=x;
        b=y;
        h=z;

        
    }

    int findarea(){
        return l*b;
    }
}
class Run{
    public static void main(String[] a) {
        classes obj = new classes();

        classes vars;
        vars= new classes();
        obj.setdata(10, 12, 3);
       System.out.println( obj.findarea());
       System.out.println(obj.toString());
    }
    
}
