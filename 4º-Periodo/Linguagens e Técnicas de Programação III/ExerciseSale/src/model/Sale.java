package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<Item> itens = new ArrayList<>();
	private List<Product>products;
	
	public Sale(List <Product>product) {
		this.products=product;
	}
	public void addProduct(String nameProduct,int amount) {
		Product product=searchProduct(nameProduct);
		if(product != null) {
			itens.add(new Item(product,amount));
		}
	}
	private Product searchProduct(String nameProcuct) {
		for(Product product: products) {
			if(product.getName().equalsIgnoreCase(nameProcuct)) {
				return product;
			}
		}
		return null;
	}
	public void show() {
	    double total = 0.0;
	    for (Item item : itens) {
	        Product product = item.getProduct(); 
	        int amount = item.getAmount(); 
	        
	        System.out.println(product.getName());
	        System.out.println("Amount: " + amount);
	        System.out.println("price R$" + product.getUnitPrice());
	        System.out.println("R$" + (amount * product.getUnitPrice()));
	        System.out.println();
	        total += amount * product.getUnitPrice();
	    }
	    System.out.println("Total: R$" + total);
	}
	public double calcularTotal() {
	    double total = 0.0;
	    for (Item item : itens) {
	        total += item.calc();
	    }
	    return total;
	}
    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
	
}
