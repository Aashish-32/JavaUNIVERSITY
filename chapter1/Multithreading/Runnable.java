package chapter1.Multithreading;

class Runnables  implements Runnable{
    String tname;

    Runnables(String tname) {
        this.tname = tname;
    
        System.out.println("creating : " + tname);
    }

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(tname + " : " + i);
        }
        System.out.println("exiting : " + tname);
    

    }
    
}

class testss{
    public static void main(String[] args) {
        Runnables obj= new Runnables("threwad11");
        Thread t = new Thread(obj);
        t.start();

        Runnables obj2= new Runnables("threwad22");
        Thread t2 = new Thread(obj2);
        t2.start();

    }
}
