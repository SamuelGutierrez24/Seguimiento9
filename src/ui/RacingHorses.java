package ui;

import java.util.Scanner;

public class RacingHorses {
    public static void main (String [] args){

    
        Scanner sc = new Scanner(System.in);
        int cuantity = sc.nextInt();
        
        int i = 0;
        int [] results = new int [cuantity];
        while ( i != cuantity ) {
            
            
            int horses = sc.nextInt();
            int [] q = new int [horses];
        
            for(int k = 0;k<horses;k++){
                q[k] = sc.nextInt();
            }
            results[i] = sortIntegerArrayInsertion(q);
            
            
            
            i++;
        }
        for(int j = 0;j<cuantity;j++){
            System.out.println(results[j]);
        }
        sc.close();
    }



    private static int sortIntegerArrayInsertion(int [] array) {
        
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
        
        int difference = array[1] - array[0];
        int v2 = 0;
        
        for(int i = 1; i<array.length;i++){
            
            v2 = array[i] - array[i-1];
            if(difference>v2){
                difference = v2;
            }
        }
        return difference;
    }
}