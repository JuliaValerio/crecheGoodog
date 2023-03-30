package creche.pacotes;

public class Pacotes {
	
	private String pacote1;
	private String pacote2;
	private String pacote3;
	
	
	public Pacotes(String pacote1, String pacote2, String pacote3) {
		super();
		this.pacote1 = pacote1;
		this.pacote2 = pacote2;
		this.pacote3 = pacote3;
	}


	public String getPacote1() {
		return pacote1;
	}




	public void setPacote1(String pacote1) {
		this.pacote1 = pacote1;
	}




	public String getPacote2() {
		return pacote2;
	}




	public void setPacote2(String pacote2) {
		this.pacote2 = pacote2;
	}




	public String getPacote3() {
		return pacote3;
	}




	public void setPacote3(String pacote3) {
		this.pacote3 = pacote3;
	}




	public void visualizar() {
		
		System.out.println("Pacote 1: Mensal " + this.pacote1);
		System.out.println("Pacote 2: Semestral " + this.pacote2);
		System.out.println("Pacote 3: Anual " + this.pacote3);
	
	
	}
}