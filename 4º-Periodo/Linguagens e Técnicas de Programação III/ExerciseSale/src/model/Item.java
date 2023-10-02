package model;

public class Item {
	private Product product;
	private int amount;
	
	public Item(Product product, int amount) {
		this.product=product;
		this.amount= amount;
	}
	
	public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
    public double calc() {
    	return product.getUnitPrice()*amount;
    }
}
