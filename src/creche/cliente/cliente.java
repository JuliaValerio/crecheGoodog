package creche.cliente;

import java.util.Scanner;

public class cliente {
	
		private String nomeDono;
		private String nomePet;
		private String raca;
		private String endereco;
		
		/**
		 * @param nomeDono
		 * @param nomePet
		 * @param raça
		 * @param endereço
		 */
		public cliente(String nomeDono, String nomePet, String raça, String endereço) {
			this.nomeDono = nomeDono;
			this.nomePet = nomePet;
			this.raca = raça;
			this.endereco = endereço;
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

		public String getRaça() {
			return raca;
		}

		public void setRaça(String raca) {
			this.raca = raca;
		}

		public String getEndereço() {
			return endereco;
		}

		public void setEndereço(String endereco) {
			this.endereco = endereco;
		}
		
		public void cadastrar() {
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o nome completo do Dono: ");
			nomeDono = leia.next();
			
			System.out.println("Digite o nome do Pet: " + nomePet );
			nomePet = leia.next();
			System.out.println("Digite a raça do Pet: " + raca);
			raca = leia.next();
			System.out.println("Digite o seu endereço" + endereco);
			endereco = leia.next();
			System.out.println("Cadastro finalizado com sucesso!!");
		}
		
		public void visualizar() {
			System.out.println("Nome do Dono: " + nomeDono);
			System.out.println("Nome do Pet: " + nomePet );
			System.out.println("Raça do Pet: " + raca);
			System.out.println("Endereço: " + endereco);
		}
}