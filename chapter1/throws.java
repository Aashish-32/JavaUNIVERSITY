package chapter1;
import java.io.*;
import java.io.BufferedReader;


 class Example {

    public static void readFile(String filePath) throws IOException {
        FileReader fileReader = null;
       
            fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

     }
    }
        
    
    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            
        }
    }
 
}

