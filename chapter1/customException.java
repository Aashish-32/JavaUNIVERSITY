
package chapter1;

class Custom extends RuntimeException{
    Custom(String m){
        super(m);
    }
}

class TEST{
static void func(int age) {
    if (age<18){
        throw new Custom("this is the message");
    }
}
}

public class customException{
    public static void main(String[] args) {
        TEST.func(11);
    }
}