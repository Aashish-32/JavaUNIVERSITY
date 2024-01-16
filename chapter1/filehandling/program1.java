package chapter1.filehandling;

import java.io.*;

public class program1 {
   
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
    
        try {
        in = new FileInputStream("C:\\Users\\Puja\\Desktop\\JAVA UNI\\chapter1\\filehandling\\input.txt");
         out = new FileOutputStream("C:\\Users\\Puja\\Desktop\\JAVA UNI\\chapter1\\filehandling\\output.txt");
         int c;
         byte[] length=  new byte[10] ;
         while ((in.read(length)) != -1) {
            out.write(length,0,2 );
    }
    
    System.out.println("File copied successfully!");
}

    finally{
  in.close();
     out.close();
    
}

}
}
