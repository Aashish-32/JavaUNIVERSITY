package chapter1.filehandling;

import java.io.*;

public class Program2 {


    public static void main(String[] args) throws IOException{
       
        FileOutputStream out= new FileOutputStream("input.txt");
        FileInputStream in = new FileInputStream("null.txt");
        int ans;
        while ((ans=in.read()) !=-1) {
            out.write(ans);
            
        }

    }
    
}
