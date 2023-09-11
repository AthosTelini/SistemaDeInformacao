package view;

import model.TaxIss;
import model.Product;
import model.TaxIpi;
import model.TaxIcms;


public class Main {

	public static void mostra(Product prod) {
		System.out.println("Nome: " + prod.getName() + " | Preço: "+prod.calculateSalePrice());
	}
	
	public static void main(String[] args) throws Exception {
		TaxIpi ipi = new TaxIpi();
		TaxIcms icms = new TaxIcms();
		TaxIss iss = new TaxIss();
		
		Product arroz = new Product("Arroz", 7.00, 20, true);
		arroz.addTax(icms);
		arroz.addTax(iss);
		mostra(arroz);
		
		Product feijao = new Product("Feijão", 7.00, 25, true);
		feijao.addTax(icms);
		feijao.addTax(iss);
		mostra(feijao);

		Product carne = new Product("Carne", 7.00, 35, true);
		carne.addTax(icms);
		carne.addTax(ipi);
		mostra(carne);
		
		Product cerveja = new Product("Cerveja", 7.00, 30, true);
		cerveja.addTax(icms);
		cerveja.addTax(iss);
		cerveja.addTax(ipi);
		mostra(cerveja);
		
		Product gas = new Product("Gás", 7.00, 15, true);
		gas.addTax(icms);
		gas.addTax(ipi);
		mostra(gas);
		
		Product gasolina = new Product("Gasolina", 7.00, 15, true);
		gasolina.addTax(icms);
		mostra(gasolina);
	}

}
