package chapter1;
class exceptionA{
public static void main(String[] args) {
    
        news.Meth();
        String a="2";
        Integer.parseInt(a);
    }

}


 class news{
static void Meth(){
    try{
        int a=100/0;
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
            
    
        }
}
}