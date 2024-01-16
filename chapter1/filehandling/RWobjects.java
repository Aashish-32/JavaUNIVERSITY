package chapter1.filehandling;
import java.io.*;

 class Person implements Serializable {
    String name;
    int age;
    String gender;

    Person(String name , int age , String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }
    public String toString(){
        return "Name="+name+"\nAge="+age+"\nGender="+gender;
    }
}

    class RWobjects{

        public static void main(String[] args) throws Exception {
            Person p1= new Person("Aashish", 22, "male");
            Person p2= new Person("Roshani", 21, "female");

        FileOutputStream fos= new FileOutputStream(new File("myobjects.txt"));

        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(p1);
        oos.writeObject(p2);
            oos.close();
            fos.close();


            FileInputStream fis = new FileInputStream("myobjects.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person r2= (Person)ois.readObject();
           Person r1= (Person)ois.readObject();
          
           System.out.println(r1);
           System.out.println(r2.toString());
           fis.close();
           ois.close();


        
        }
    }


