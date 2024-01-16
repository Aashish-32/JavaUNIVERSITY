package Polymorphism;

class Animal{
    public Animal(){
        System.out.println("The animal makes a sound");
    }
    int call(){
        return 2;
    }
}

class Pig extends Animal{
    public Pig(){
        System.out.println("The pig says: wee wee");
    }
   
    int call(){
        return 3;
    }
}

class Dog extends Animal{
    public Dog(){
        System.out.println("The dog says: bow bow");
    }
}
public class dynamicply {
    public static void main(String[] args) {
        var objA=new Pig();
        System.out.println(objA.call());
    }
}
