package javasorts;

import java.util.Scanner;

public class InsertionSort {

    public static void insert(int array[], int i) {
        int eleito = array[i];
        int comp = i - 1;
        while (comp >= 0 && eleito < array[comp]) {
            //deslocar
            array[comp + 1] = array[comp];
            comp--;
        }
        //inserindo eleito na posição correta
        array[comp + 1] = eleito;
        //----------------
    }

    public static void iSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            insert(array, i);

        }
    }

    public static void insertComentado(int array[], int i) {
        Scanner scanner = new Scanner(System.in);
        int eleito = array[i];
        int comp = i - 1;
        System.out.println("Eleito: " + eleito);
        scanner.nextLine();//pausa
        while (comp >= 0 && eleito < array[comp]) {
            //deslocar
            System.out.println(" comparando ");
            System.out.println("v[" + comp + "]=" + array[comp]);
            array[comp + 1] = array[comp];
            comp--;
            JavaSorts.printArray(array);
            scanner.nextLine();//pausa
        }
        //inserindo eleito na posição correta
         System.out.println("Inserindo eleito indice:  "+(comp+1));
        array[comp + 1] = eleito;
        JavaSorts.printArray(array);
        //----------------
    }

    public static void iSortComentado(int array[]) {
        for (int i = 1; i < array.length; i++) {
             System.out.println("Fase "+i);
            insertComentado(array, i);

        }
    }
}
