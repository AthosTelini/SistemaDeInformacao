package model;

public class TaxIcms extends Tax{

	public TaxIcms() {
		super("ICMS", "Imposto Circ. Mercadorias", 0);
	}
	
	public void setAliquot(Product product) {
		if(product.hasIpi()) {
			setAliquot(7);
		}else {
			setAliquot(5);
		}
	}
	
	@Override
	public double calculate(Product p) {
		setAliquot(p);
		return p.getCostPrice() * this.getAliquot();
	}
	
}
