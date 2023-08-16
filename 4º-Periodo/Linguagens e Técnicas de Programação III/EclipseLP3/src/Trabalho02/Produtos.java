package Trabalho02;

public class Produtos {
	private float Arroz = 7.0f;
	private float Feijão = 7.0f;
	private float Carne = 7.0f;
	private float Cerveja = 7.0f;
	private float Gas = 7.0f;
	private float Gasolina = 7.0f;
	
	//impostos
	private float ICMS = 0.07f;
	private float Confins = 0.12f;
	private float IPI = 0.08f;
	private float ISS = 0.05f;
	private float Cide = 0.10f;
	private float CSLL = 0.04f;
	
	
	
	public void valorTotalArroz() {
		System.out.println("---------------------------------");
		System.out.println("Preço de custo do Arroz é: "+ this.getArroz());
		System.out.println("---Preço  em percentual dos impostos do Arroz---");
		System.out.println("ICMS:  "+this.ICMS);
		System.out.println("Confins: "+this.Confins);
		System.out.println("ISS: "+this.ISS);
		float margemLucroArroz = 0.20f;
		System.out.println("Margem de lucro: " + margemLucroArroz);
		
		
		//calculando imposto
		float impICMS= this.getArroz()*this.ICMS;
		float impConfins=this.getArroz()*this.Confins;
		float impISS=this.Arroz*this.getISS();
		float totalImposto= impICMS+impConfins+impISS;
		System.out.println("Valor total dos impostos: "+totalImposto);
		
		//calculando o lucro
		float valorLucro=this.Arroz*margemLucroArroz;
		float valorTotal=this.Arroz+totalImposto+valorLucro;
		
		System.out.println("->>Valor total do produto= "+valorTotal);
		System.out.println("---------------------------------");
		
		
		
		
	}
	public void valorTotalFeijao() {
		
		//estrutura visual
		System.out.println("---------------------------------");
		System.out.println("Preço de custo do Feijão é: "+ this.getFeijão());
		System.out.println("---Preço  em percentual  dos impostos do Feijão---");
		System.out.println("ICMS:  "+this.ICMS);
		System.out.println("Confins: "+this.Confins);
		System.out.println("ISS: "+this.ISS);
		float margemLucroFeijao = 0.25f;
		System.out.println("Margem de lucro: " + margemLucroFeijao);
		
		//somar impostos
		float impICMS= this.getFeijão()*this.ICMS;
		float impConfins=this.getFeijão()*this.Confins;
		float impISS=this.getISS()*this.Feijão;
		float totalImposto= impICMS+impConfins+impISS;
		System.out.println("Valor total dos impostos: "+totalImposto);
		
		//somar lucro
		float valorLucro=this.Feijão*margemLucroFeijao;
		float valorTotal=this.Feijão+totalImposto+valorLucro;
		System.out.println("->>Valor total do produto= "+valorTotal);
		System.out.println("---------------------------------");
		
		
	}
	public void valorTotalCarne() {
		System.out.println("---------------------------------");
		System.out.println("Preço de custo da Carne é: "+ this.getCarne());
		System.out.println("---Preço  em percentual dos impostos da carne---");
		System.out.println("ICMS:  "+this.ICMS);
		System.out.println("Confins: "+this.Confins);
		System.out.println("IPI: "+this.IPI);
		float margemLucroCarne = 0.35f;
		System.out.println("Margem de lucro: " + margemLucroCarne);
		
		//soma dos impostos
		float impICMS = this.Carne*this.ICMS;
		float impConfins=this.Carne*this.Confins;
		float impIPI=this.Carne*this.IPI;
		float somaImposto=impConfins+impIPI+impICMS;
		System.out.println("Valor total dos impostos: "+somaImposto);
		
		//Lucro
		float valorLucro=this.Carne*margemLucroCarne;
		float valorTotal=this.Carne+somaImposto+valorLucro;
		System.out.println("->>Valor total do produto= "+valorTotal);
		System.out.println("---------------------------------");
	}
	public void valorTotalCerveja() {
		System.out.println("---------------------------------");
		System.out.println("Preço de custo da Cerveja é: "+ this.getCerveja());
		System.out.println("---Preço  em percentual  dos impostos da cerveja---");
		System.out.println("ICMS:  "+this.ICMS);
		System.out.println("Confins: "+this.Confins);
		System.out.println("ISS: "+this.ISS);
		System.out.println("IPI: "+this.IPI);
		float margemLucroCerveja = 0.30f;
		System.out.println("Margem de lucro: " + margemLucroCerveja);
		
		//Calculos do imposto
		float impICMS=this.ICMS*this.Cerveja;
		float impConfins = this.Confins*this.Cerveja;
		float impISS=this.ISS*this.Cerveja;
		float impIPI= this.IPI * this.Cerveja;
		float somaImposto=impICMS+impConfins+impISS+impIPI;
		System.out.println("Total de imposto: "+somaImposto);
		
		//lucro
		float valorLucro=this.Cerveja*margemLucroCerveja;
		float ValorTotal= this.Cerveja+valorLucro+somaImposto;
		System.out.println("->>Valor total do produto= "+ValorTotal);
		System.out.println("---------------------------------");
		
	}
	public void valorTotalGas() {
		System.out.println("---------------------------------");
		System.out.println("Preço de custo do gas é: "+ this.getGas());
		System.out.println("---Preço  em percentual  dos impostos do gas---");
		System.out.println("ICMS:  "+this.ICMS);
		System.out.println("Confins: "+this.Confins);
		System.out.println("IPI: "+this.IPI);
		float margemLucroGas = 0.15f;
		System.out.println("Margem de lucro: " + margemLucroGas);
		
		//calculando imposto
		float impICMS=this.ICMS*this.Gas;
		float impConfins = this.Confins*this.Gas;
		float impIPI= this.IPI * this.Gas;
		float somaImposto=impICMS+impConfins+impIPI;
		System.out.println("Total de imposto: "+somaImposto);
		
		//lucro
		float valorLucro=this.Gas*margemLucroGas;
		float ValorTotal= this.Gas+valorLucro+somaImposto;
		System.out.println("->>Valor total do produto= "+ValorTotal);
		System.out.println("---------------------------------");
		
	}
	public void valorTotalGasolina() {
		System.out.println("---------------------------------");
		System.out.println("Preço de custo da gasolina é: "+ this.getGasolina());
		System.out.println("---Preço em percentual dos impostos da gasolina ---");
		System.out.println("ICMS:  "+this.ICMS);
		System.out.println("Confins: "+this.Confins);
		System.out.println("Cide: "+this.Cide);
		float margemLucroGasolina = 0.15f;
		System.out.println("Margem de lucro: " + margemLucroGasolina);
		
		//calculando imposto
		float impICMS=this.ICMS*this.Gasolina;
		float impConfins = this.Confins*this.Gasolina;
		float impCide= this.Cide * this.Gasolina;
		float somaImposto=impICMS+impConfins+impCide;
		System.out.println("Total de imposto: "+somaImposto);
		
		//lucro
		float valorLucro=this.Gasolina*margemLucroGasolina;
		float ValorTotal= this.Gasolina+valorLucro+somaImposto;
		System.out.println("->>Valor total do produto= "+ValorTotal);
		System.out.println("---------------------------------");
		
	}

	
	//GET E SET
	public float getArroz() {
		return Arroz;
	}

	public void setArroz(float arroz) {
		Arroz = arroz;
	}

	public float getFeijão() {
		return Feijão;
	}

	public void setFeijão(float feijão) {
		Feijão = feijão;
	}

	public float getCarne() {
		return Carne;
	}

	public void setCarne(float carne) {
		Carne = carne;
	}

	public float getCerveja() {
		return Cerveja;
	}

	public void setCerveja(float cerveja) {
		Cerveja = cerveja;
	}

	public float getGas() {
		return Gas;
	}

	public void setGas(float gas) {
		Gas = gas;
	}

	public float getGasolina() {
		return Gasolina;
	}

	public void setGasolina(float gasolina) {
		Gasolina = gasolina;
	}
	
	public float getICMS() {
		return ICMS;
	}

	public void setICMS(float iCMS) {
		ICMS = iCMS;
	}

	public float getConfins() {
		return Confins;
	}

	public void setConfins(float confins) {
		Confins = confins;
	}

	public float getIPI() {
		return IPI;
	}

	public void setIPI(float iPI) {
		IPI = iPI;
	}

	public float getISS() {
		return ISS;
	}

	public void setISS(float iSS) {
		ISS = iSS;
	}

	public float getCide() {
		return Cide;
	}

	public void setCide(float cide) {
		Cide = cide;
	}

	public float getCSLL() {
		return CSLL;
	}

	public void setCSLL(float cSLL) {
		CSLL = cSLL;
	}

	
}

