package Algorithm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionsHandling {

    //how to handle checked exception without using throw in method signature
    public static void readFile(File file){
        try (InputStream in = new FileInputStream(file)){
            //some implementaion
        }catch(IOException e){
            //some implementation
        }
    }

    public static void validateInput(int positiveNumver){
        //use unchecked exception
        if(positiveNumver <= 0){
            throw new IllegalArgumentException("Malformed input!");
        }
    }

    public static void main(String[] args){

    }
}
