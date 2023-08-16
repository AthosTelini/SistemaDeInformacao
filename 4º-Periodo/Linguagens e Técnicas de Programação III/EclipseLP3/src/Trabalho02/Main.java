package Trabalho02;
import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Produtos p1 = new Produtos() ;
		
		
		
		int op;
		do {
			System.out.println("Digite o numero referente ao produto para vizualizar");
			System.out.println("1 Ver valor do Arroz");
            System.out.println("2 Ver valor do Feijão");
            System.out.println("3 Ver valor do Carne");
            System.out.println("4 Ver valor do Cerveja");
            System.out.println("5 Ver valor do Gas");
            System.out.println("6 Ver valor do Gasolina");
            System.out.println("0 Voltar");
            System.out.println("9 Sair");
            op = scanner.nextInt();
            
            switch (op) {
            case 1:
            	p1.valorTotalArroz();
            	retornoMenu();
                break;
            case 2:
            	p1.valorTotalFeijao();
            	retornoMenu();
                break;
            case 3:
            	p1.valorTotalCarne();
            	retornoMenu();
                break;
            case 4:
            	p1.valorTotalCerveja();
            	retornoMenu();
                break;
            case 5:
            	p1.valorTotalGas();
            	retornoMenu();
                break;
            case 6:
            	p1.valorTotalGasolina();
            	retornoMenu();
                break;
            case 7:
            	
                break;
                
            case 0:
                System.out.println("Voltando...");
                break;
            case 9:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
            
		}while(op!=9);
		scanner.close();

	}
	 private static void retornoMenu() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Pressione 0 para voltar ao menu.");
	        while (scanner.nextInt() != 0) {
	            System.out.println("Pressione 0 para voltar ao menu.");
	        }
	    }
}
