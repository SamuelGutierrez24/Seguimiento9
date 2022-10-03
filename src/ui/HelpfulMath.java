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

public class HelpfulMath { 

        public static void main(String [] args) throws IOException { 
           
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           String s = reader.readLine();
           String [] sum = new String [100];
            sum = s.split("\\+");
            sortIntegerArrayInsertion(sum);
        }
    
        private static void sortIntegerArrayInsertion(String [] array) {
            
            for (int rojo = 1; rojo < array.length; rojo++) {
                String valorRojo = array[rojo];
                int verde = rojo-1;
                String valorVerde;
                while ( verde > -1 && (valorVerde = array[verde]).compareTo(valorRojo)>0 ) {
                    valorVerde = array[verde];
                    array[verde+1] = valorVerde;
                    verde--;
                }
                array[verde+1] = valorRojo;
            }
           

            String out = "";
            for(String x : array){
               if(x == array[array.length-1])out+=x;
               else out+= x +"+";
            }
            System.out.println(out);
        }

}