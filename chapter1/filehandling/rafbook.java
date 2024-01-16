package chapter1.filehandling;

import java.io.RandomAccessFile;

public class rafbook {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf= new RandomAccessFile("test.txt", "rw");

            raf.writeUTF("Hello World");
            raf.writeUTF("Hi");
             raf.seek(0);

            System.out.println(raf.readUTF());

            long pos= raf.getFilePointer();
            System.out.println(pos);

            System.out.println(raf.readUTF());

            raf.seek(0);

            System.out.println(raf.readUTF());


            raf.seek(13);
            System.out.println(raf.readUTF());

            pos= raf.getFilePointer();
            System.out.println(pos);
            raf.seek(13);
            System.out.println(raf.readUTF());



          



        } catch (Exception e) {
           
        }
    }
}
