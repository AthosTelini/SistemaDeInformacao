package model;

public class TaxIss extends Tax{

	public TaxIss() {
		super("ISS", "Imposto Sobre Servico", 5);
	}
	
	@Override
	public double calculate(Product p) {
		double profitPrice = p.getCostPrice() * p.getProfit();
		return (p.getCostPrice() + profitPrice) * this.getAliquot();
	}
}
