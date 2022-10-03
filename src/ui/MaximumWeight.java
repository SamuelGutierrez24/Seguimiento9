package ui;
import java.util.Scanner;

public class MaximumWeight {
    public static void main (String [] args){

    
        Scanner sc = new Scanner(System.in);
        int cuantity = sc.nextInt();
        
        int i = 0;
        int [] results = new int [cuantity];
        while ( i != cuantity ) {
            
            
            int total = sc.nextInt();
            int niño = sc.nextInt();
            int verificar = total - niño;
            if(verificar<niño){
                niño = verificar;
            }
            int [] q = new int [total];

        
            for(int k = 0;k<total;k++){
                q[k] = sc.nextInt();
            }
            results[i] = sortIntegerArrayInsertion(q,niño);
            
            
            
            i++;
        }
        for(int j = 0;j<cuantity;j++){
            System.out.println(results[j]);
        }
        sc.close();
    }



    private static int sortIntegerArrayInsertion(int [] array, int niño) {
        
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
        
        int wkid = 0;
        int wfather = 0;
        
        for(int i = 0; i<niño;i++){
            wkid += array[i];   
        }
        for(int i = niño;i<array.length;i++){
            wfather += array[i];
        }
        int difference = wfather-wkid;
        
        return difference;
    }

}
