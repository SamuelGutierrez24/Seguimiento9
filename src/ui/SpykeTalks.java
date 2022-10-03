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
import java.util.Scanner;

public class SpykeTalks {
    
    public static void main(String [] args) throws IOException { 
           
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
       int  s = Integer.parseInt(sc.nextLine()); 
       int [] pairs = new int [s];
        for(int i = 0;i<pairs.length;i++){
            pairs[i] = sc.nextInt();
        }
        sortIntegerArrayInsertion(pairs);
       //if(s == pairs.split(" ").length) sortIntegerArrayInsertion(pairs.split(" "));
       
    }

    private static void sortIntegerArrayInsertion(int [] array) {
        
        for (int rojo = 1; rojo < array.length; rojo++) {
            int valorRojo = array[rojo];
            int verde = rojo-1;
            int valorVerde;
            while ( verde > -1 && (valorVerde = array[verde])>(valorRojo) ) {
                valorVerde = array[verde];
                array[verde+1] = valorVerde;
                verde--;
            }
            array[verde+1] = valorRojo;
        }

       
            int countG = 0;
            int count = 1;
            boolean flag = true;
        
            if( array.length != 1){

                for(int i = 1;i<array.length && flag ;i++){

                    if(array[i] ==(array[i-1])){
                        if(array[i]!=0){
                            count++;
                            
                            if(i == array.length-1){
                                if(count == 2){
                                    countG += 2;
                                    count = 1;
                                }
                            }
                                if(count==3){
                                    System.out.println(-1);
                                    flag = false;
                                }
                           
                        }
                    }else{
                        if(count == 2){
                            countG += 2;
                            count = 1;
                        }else{
                            
                            if(count>=3){
                                System.out.println("-1");
                                flag = false;
                                count = 1;
                            }else{
                                count = 1;
                            }
                        }
                    }  
                    
                }
                    if(flag){
                        System.out.println(countG/2);
                    }    
            
            }else{
                System.out.println("0");
                
            }
                
        
    
    }
}


    