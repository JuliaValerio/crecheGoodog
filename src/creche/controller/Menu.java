package creche.controller;

import java.util.Scanner;
import creche.util.Cores;

public class Menu {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);
		
		int opcao;

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
				System.out.println("Novo Cadastro cliente\n\n");

				break;
			case 2:
				System.out.println("Atualizar Dados do cliente\n\n");

				break;
			case 3:
				System.out.println("Adquirir Tabela pacotes com pre\u00E7os\n\n");

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

