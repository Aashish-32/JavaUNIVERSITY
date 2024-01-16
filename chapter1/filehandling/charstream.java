package chapter1.filehandling;
import java.io.*;

public class charstream {
    public static void main(String[] args) throws Exception {
        FileReader in= new FileReader("input.txt");
        FileWriter out= new FileWriter("output.txt");

        int a;
        while ((a=in.read())!=-1) {
            System.out.println((char)(a));
            out.write(a);

        }

        in.close();
        out.close();
    }
    
}
