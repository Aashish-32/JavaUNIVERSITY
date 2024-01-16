package chapter1.Multithreading;


class Multithreading extends Thread{
    @Override
    public void run(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
Multithreading t1=new Multithreading();
Thread2 obj= new Thread2();
t1.start();
Thread t2= new Thread(obj, "name");
t2.start();

}
}
class Thread2 implements Runnable{
    public void run(){
        System.out.println("thread : 2");
    }
}
