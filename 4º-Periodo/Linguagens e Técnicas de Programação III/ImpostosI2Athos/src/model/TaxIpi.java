package model;

public class TaxIpi extends Tax{
	public TaxIpi() {
		super("IPI", "Imposto sobre Produtos Industrializados", 8);
	}

	@Override
	public double calculate(Product p) {
		if (p.getNational()==false) {
	        setAliquot(10);
	        return this.getAliquot() * p.getCostPrice();
	    }
		return this.getAliquot() * p.getCostPrice();
	}
	
}
