package chapter1;

public class This {
    public static void main(String[] args) {
       System.out.println( Person.age);
       
    }
}

class Person{
static int age;
String name;

Person(int age , String name){
this.age=age;
this.name=name;
}
Person(){}


boolean comparAge(Person p){
if (this.age> p.age)
    return true;
    else
return false;

}
}

