package creche.controller;

import java.util.Scanner;

import creche.cliente.cliente;
import creche.pacotes.Pacotes;
import creche.util.Cores;

public class Menu {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);
		
		int opcao;
		cliente cl = new cliente("", "", "", "");
		
		Pacotes p1 = new Pacotes (150f,"alimentação", "Mensal");
		Pacotes p2 = new Pacotes (500f,"alimentação", "Semestral");
		Pacotes p3 = new Pacotes (800f,"alimentação", "Anual");
		
    	
		while (true) {

			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN_BRIGHT
					+ "******************************************************");
			System.out.println("*                                                    *");
			System.out.println("*                Creche GooDog                       *");
			System.out.println("*                                                    *");
			System.out.println("******************************************************");
			System.out.println("*                                                    *");
			System.out.println("*            1 - Criar Cadastro cliente              *");
			System.out.println("*            2 - Atualizar Dados do cliente          *");
			System.out.println("*            3 - Adquirir Tabela pacotes com preços  *");
			System.out.println("*            4 - Listar pacotes ativos               *");
			System.out.println("*            5 - Cancelamento de pacote ativos       *");
			System.out.println("*            6 - Sair                                *");
			System.out.println("*                                                    *");
			System.out.println("******************************************************");
			System.out.println("  Entre com a opção desejada:                         ");
			System.out.println("                                                      ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_GREEN_BRIGHT
						+ "******************************************************");
				System.out.println("*                                                    *");
				System.out.println("* Obrigada por acessar o Console da Creche GooDog :) *");
				System.out.println("*                                                    *");
				System.out.println("******************************************************");
				
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			
			case 1:  
				System.out.println("**Cadastro cliente\n\n**");
				cl.cadastrar();
				
				break;
				
			case 2:
				System.out.println("Atualizar Dados do cliente\n\n");
				cl.visualizar();
				
				
				break;
				
			case 3:
				System.out.println("Adquirir Tabela pacotes com preços\n\n");
				p1.visualizar();
				p2.visualizar();
				p3.visualizar();

				break;
			case 4:
				System.out.println("Listar pacotes ativos \n\n");

				break;
			case 5:
				System.out.println("Cancelamento de pacote ativos \n\n");

				break;

			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}
}

