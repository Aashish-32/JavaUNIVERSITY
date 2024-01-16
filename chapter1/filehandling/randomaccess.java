package chapter1.filehandling;
import java.io.*;

public class randomaccess {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        RandomAccessFile file= new RandomAccessFile("input.txt","rw");
        int a;
        file.seek(5);
        while((a=file.read())!=-1){
            
            System.out.println((char)a);
        }

    }
}
