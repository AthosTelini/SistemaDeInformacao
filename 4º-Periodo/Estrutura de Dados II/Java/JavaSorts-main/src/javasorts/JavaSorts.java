package javasorts;

import java.util.Random;
import java.util.Scanner;

public class JavaSorts {

    static int menuEntrada() {
        int op;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1-Gerar Dados");
        System.out.println("2-Entrar com Dados");
        op = scanner.nextInt();
        return op;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tamanho, op;
        System.out.println("Tamanho do vetor:");
        tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        op = menuEntrada();
        switch (op) {
            case 1:
                for(int i = 0; i < vetor.length; i++) {
                    vetor[i] = rand.nextInt(100);
                }
                
                int opcao;
                System.out.println("Escolha");
                System.out.println("1-BubbleSort");
                System.out.println("2-SelectionSort");
                System.out.println("3-InsertionSort");
                opcao = scanner.nextInt();
                
                if(opcao==1){
                    System.out.println("Vetor original:");
                    printArray(vetor);
                    BubbleSort.bSort(vetor);
                    System.out.println("Vetor ordenado");
                    printArray(vetor);
                }
                if(opcao==2){
                    System.out.println("Vetor original:");
                    printArray(vetor);
                    SelectionSort.sSort(vetor);
                    System.out.println("Vetor ordenado");
                    printArray(vetor);
                }
                if(opcao==3){
                    System.out.println("Vetor original:");
                    printArray(vetor);
                    InsertionSort.iSort(vetor);
                    System.out.println("Vetor ordenado");
                    printArray(vetor);
                }
                break;
            case 2:
                System.out.println("Dados vetor:");
                for (int i = 0; i < vetor.length; i++) {
                    vetor[i] = scanner.nextInt();
                }
                int opc;
                System.out.println("Escolha");
                System.out.println("1-BubbleSort");
                System.out.println("2-SelectionSort");
                System.out.println("3-InsertionSort");
                opc = scanner.nextInt();
                
                if(opc==1){
                    System.out.println("Vetor original:");
                    printArray(vetor);
                    BubbleSort.bSort(vetor);
                    System.out.println("Vetor ordenado");
                    printArray(vetor);
                }
                if(opc==2){
                    System.out.println("Vetor original:");
                    printArray(vetor);
                    SelectionSort.sSort(vetor);
                    System.out.println("Vetor ordenado");
                    printArray(vetor);
                }
                if(opc==3){
                    System.out.println("Vetor original:");
                    printArray(vetor);
                    InsertionSort.iSort(vetor);
                    System.out.println("Vetor ordenado");
                    printArray(vetor);
                }
                break;
        } // fim do switch
        
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "| ");
        }

        System.out.println("\n");
    }// fim printArray
}
