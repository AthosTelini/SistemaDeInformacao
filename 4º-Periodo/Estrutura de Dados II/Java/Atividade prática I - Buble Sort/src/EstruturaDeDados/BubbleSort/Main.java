package EstruturaDeDados.BubbleSort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        int[] vetor = new int[5];
        System.out.println("Insira 5 numeros");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (vetor.length);
            vetor[i] = scanner.nextInt();
            //System.out.println(vetor[i]);
        }
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    flag = 1;
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }

            }
        }
        if (flag == 0) {

            System.out.println("A seguencia ja esta ordenada");

        } else {
            System.out.println("Vetor não estava ordenado , aqui esta ele ordenado: ");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }
        }
    }
}
