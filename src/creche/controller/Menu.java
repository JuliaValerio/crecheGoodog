package creche.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import creche.cliente.cliente;
import creche.pacotes.Pacotes;
import creche.util.Cores;

public class Menu {
    private static List<cliente> clientes = new ArrayList<>();


	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);
		
		
		int opcao;
		cliente clienteSelecionado = null;

		
		Pacotes p1 = new Pacotes (150f,"alimentação", "Mensal");
		Pacotes p2 = new Pacotes (500f,"alimentação", "Semestral");
		Pacotes p3 = new Pacotes (800f,"alimentação", "Anual");
		
    	
		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("  #####                ######                 \r\n"
					+ " #     #  ####   ####  #     #  ####   ####   \r\n"
					+ " #       #    # #    # #     # #    # #    #  \r\n"
					+ " #  #### #    # #    # #     # #    # #       \r\n"
					+ " #     # #    # #    # #     # #    # #  ###  \r\n"
					+ " #     # #    # #    # #     # #    # #    #  \r\n"
					+ "  #####   ####   ####  ######   ####   ####   " );
			System.out.println(Cores.TEXT_RESET);
			System.out.println("*****************************************************");
			System.out.println("*            1 - Criar cadastro de novo Cliente     *");
			System.out.println("*            2 - Atualizar Dados dos clientes       *");
			System.out.println("*            3 - Listar clientes ativos             *");
			System.out.println("*            4 - Remover clientes                   *");
			System.out.println("*            5 - Sair                               *");
			System.out.println("*****************************************************");
			System.out.println("  Entre com a opção desejada:                        ");
			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND    );
				System.out.println("*******************************************************");
				System.out.println("*                                                     *");
				System.out.println("* A Creche GooDog agradece o seu acesso! :)           *");
				System.out.println("*                                                     *");
				System.out.println("*******************************************************");
				System.out.println(Cores.TEXT_RESET);
				leia.close();
				sobre();
				System.exit(0);
			}

			switch (opcao) {
			
			case 1:  
				System.out.println("**Cadastro de novo cliente\n\n**");
				cliente novoCliente = new cliente("", "", "", "");
                novoCliente.cadastrar();
                clientes.add(novoCliente);
				
                keyPress();
				break;
				
			case 2:
				System.out.println("Atualizar Dados dos clientes\n\n");
				System.out.println("Selecione o cliente que deseja atualizar");
				
				keyPress();
				break;
			
			case 3:
<<<<<<< HEAD
				System.out.println("Adquirir Tabela pacotes com preços\n\n");
				p1.visualizar();
				p2.visualizar();
				p3.visualizar();
				System.out.println("Escolha o pacote que deseja adquirir! \n\n");


=======
				System.out.println("Listar clientes ativos \n\n");
				 for (cliente cliente : clientes) {
                     cliente.visualizar();
                     System.out.println();
                 }
				keyPress();
>>>>>>> 41be67b07fab84214d9d77d8568874dfb9390f14
				break;
				
			case 4:
				System.out.println("Remover clientes \n\n");
				
				keyPress();
				break;
				
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}
	
	public static void sobre() {
		System.out.println("Projeto feito por: ");
		System.out.println("Andresa/ Carolina/ Daisy/ Joyce/ Julia/ Katarina");
		System.out.println("GitHub: github.com/amarcal07 ; github.com/JuliaValerio ; github.com/302kt");
	}
	
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET +"Pressione ENTER para continuar");
			System.in.read();
		}catch(IOException e) {
			System.out.println("Erro de digitação!");
		}
	}
}
