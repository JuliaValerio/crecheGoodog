package creche.pacotes;

public class Pacotes {
	
	float preco;
	String itens;
	String periodo;
	
	public Pacotes(float preco, String itens, String periodo) {
		this.preco = preco;
		this.itens = itens;
		this.periodo = periodo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getItens() {
		return itens;
	}

	public void setItens(String itens) {
		this.itens = itens;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	public void visualizar() {
		
		System.out.println("Itens: " + this.itens);
		System.out.println("Preço: " + this.preco);
		System.out.println("Periodo: " + this.periodo);
		System.out.println("******************************************************");
	
	
	}
}
