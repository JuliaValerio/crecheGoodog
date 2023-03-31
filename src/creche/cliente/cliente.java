package creche.cliente;

import java.util.Scanner;

import creche.pacotes.Pacotes;

public class cliente extends Pacotes {
	
		private String nomeDono;
		private String nomePet;
		private String raca;
		private String endereco;
		private String telefone;
		private int pacote;
		
		public cliente(String pacote1, String pacote2, String pacote3, String nomeDono, String nomePet, String raca,
				String endereco, String telefone, String pacote) {
			super(pacote1, pacote2, pacote3);
			this.nomeDono = nomeDono;
			this.nomePet = nomePet;
			this.raca = raca;
			this.endereco = endereco;
			this.pacote = 0;
			this.telefone = telefone;
		}
		
		

		public String getTelefone() {
			return telefone;
		}



		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}



		public String getNomeDono() {
			return nomeDono;
		}



		public void setNomeDono(String nomeDono) {
			this.nomeDono = nomeDono;
		}



		public String getNomePet() {
			return nomePet;
		}



		public void setNomePet(String nomePet) {
			this.nomePet = nomePet;
		}



		public String getRaca() {
			return raca;
		}



		public void setRaca(String raca) {
			this.raca = raca;
		}



		public String getEndereco() {
			return endereco;
		}



		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
			

		public String getPacote() {
			switch (pacote) {
			case 1 -> {return "Mensal";}
			case 2 -> {return "Semestral";}
			case 3 -> {return "Anual";}
			default -> {return null;}
			}
		}

		public void cadastrar() {
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o nome completo do Dono: ");
			nomeDono = leia.next();
			
			System.out.println("Digite o nome do Pet: " + nomePet );
			nomePet = leia.next();
			System.out.println("Digite a raça do Pet: " + raca);
			raca = leia.next();
			System.out.println("Digite o endereço: " + endereco);
			endereco = leia.next();
			System.out.println("Digite o telefone: ");
			telefone =leia.next();
			System.out.println("Pacote 1: Mensal");
			System.out.println("Pacote 2: Semestral ");
			System.out.println("Pacote 3: Anual");
			System.out.println("Escolha o pacote: ");
			pacote = leia.nextInt();
			
			System.out.println("Cadastro finalizado com sucesso!!");
		}
		
		public void visualizar() {
			System.out.println("Nome do Dono: " + nomeDono);
			System.out.println("Nome do Pet: " + nomePet );
			System.out.println("Raça do Pet: " + raca);
			System.out.println("Endereço: " + endereco);
			System.out.println("Telefone: " + telefone);
			System.out.println("Pacote: " + getPacote());
		}
}