
package javasorts;

import java.util.Scanner;

public class SelectionSort {
    private static int indexMinArray(int array [],int posAtual){
        int k=posAtual;//K é o indice do menor
        for(int i=posAtual+1  ; i<array.length ; i++)
            if(array[i]<array[k])
            k=i;
        return k;
        
    }
    public static void sSort(int array[]){
        for(int i=0; i<array.length-1 ; i++){
            int k = indexMinArray(array,i);
            //trocar valor i com k
            int temp = array [i];
            array[i]=array [k];
            array[k]=temp;
        }
            
    }
    public static void sSortComentado(int array[]){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<array.length-1 ; i++){
            System.out.println("Fase: "+i+1);
            int k = indexMinArray(array,i);
            System.out.println("Atual: "+array[i]+" Trocando com valor: "+array[k]);
            scanner.nextLine();
            //trocar valor i com k
            int temp = array [i];
            array[i]=array [k];
            array[k]=temp;
            //-------------------Mostrando vetor
            JavaSorts.printArray(array);
            scanner.nextLine();//pausa
        }
            
    }
}
