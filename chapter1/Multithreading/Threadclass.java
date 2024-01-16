package chapter1.Multithreading;

class Threadclass extends Thread {
    String tname;

    Threadclass(String s){
        tname=s;
    }
    @Override
        public void run(){ 
             System.out.println("creating : " + tname);
            for(int i=0;i<10;i++)
            {
                System.out.println(tname +" : " + i);

}

}
}

class test{
   
    public static void main(String[] args) {
        Threadclass t1= new Threadclass("thread1");
        Threadclass t2= new Threadclass("thread2");
        t1.start();
        t2.start();   
    


    }
   
}