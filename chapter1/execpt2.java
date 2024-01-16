package chapter1;
import java.io.*;
class execpt2 {
    
}


class ABC{
    static void methd(String filePath) throws Exception{
        FileReader fileReader = null;
        
            fileReader = new FileReader(filePath);
           var out= fileReader.read();
           System.out.println(out);
            fileReader.close();
    }
}

class xya{
    public static void two() throws Exception{
        ABC.methd("C:\\Users\\DELL\\Desktop\\java.txt");
    } 

    public static void main(String[] args) {
       try{
         xya.two();

       }
       catch(Exception e){
        System.out.println(e.getMessage());;
    }

       
    }
}
