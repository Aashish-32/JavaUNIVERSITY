package chapter1.filehandling;

import java.io.*;
import java.io.IOException;

class justoutput
{   public static void main(String[] args) {
    

    try (FileOutputStream fos = new FileOutputStream("output.txt")) {
    byte[] data = {65, 66, 67, 68, 69}; 
    fos.write(data);
} catch (IOException e) {
    e.printStackTrace();
}
}
}
