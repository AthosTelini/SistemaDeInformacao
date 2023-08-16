
package javasorts;


public class SelectionSort1 {
    private static int indexMinArray(int array [],int posAtual){
        int k=posAtual;//K é o indice do menor
        for(int i=posAtual+1  ; i<array.length ; i++)
            if(array[i]<array[k])
            k=i;
        return k;
        
    }
}
