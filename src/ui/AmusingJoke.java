package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.Arrays;

import javax.management.StringValueExp;

public class AmusingJoke {
    
    public static void main(String [] args) throws IOException { 
           
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String names = "";
        for(int i = 0;i<2;i++){
            names += reader.readLine();
        }
        String word = reader.readLine();
        char [] array1 = new char [names.length()];
        for(int i = 0; i<names.length();i++){
            array1[i] = names.charAt(i);
        }
        char []array2 = new char [word.length()];
        for(int i = 0; i<word.length();i++){
            array2[i] = word.charAt(i);
        }
        names = sortIntegerArrayInsertion(array1);
        word = sortIntegerArrayInsertion(array2);

        if(names.equals(word)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
       
    }

    private static String sortIntegerArrayInsertion(char [] array) {
        
        for (int rojo = 1; rojo < array.length; rojo++) {
            char valorRojo = array[rojo];
            int verde = rojo-1;
            char valorVerde;
            while ( verde > -1 && (valorVerde = array[verde])>(valorRojo) ) {
                valorVerde = array[verde];
                array[verde+1] = valorVerde;
                verde--;
            }
            array[verde+1] = valorRojo;
        }
            
        String word = "";
            for(int i = 0;i<array.length;i++){
                word += String.valueOf(array[i]);
            }

            return word;
    }

    

}
