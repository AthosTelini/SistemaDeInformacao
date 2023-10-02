package model;

import java.util.ArrayList;
import java.util.List;

import model.Item;
import model.Product;
import model.Sale;

public class Main {

	public static void main(String[] args) {
		Product arroz = new Product ("Arroz",5.00);
		Product feijao = new Product ("Feijão",10.00);
		Product oleo = new Product ("Oleo",6.00);
		Product macarrao = new Product ("Macarrao",4.00);
		
		List<Product>products=new ArrayList<>();
		products.add(arroz);
		products.add(feijao);
		products.add(oleo);
		products.add(macarrao);
		
		Sale sales= new Sale(products);
		sales.addProduct("Arroz",3);
		sales.addProduct("Feijão",2);
		sales.addProduct("Macarrao",1);
		sales.addProduct("Oleo",1);
		
		sales.show();
	}

}
