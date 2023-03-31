package creche.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import creche.cliente.cliente;
import creche.util.Cores;

public class Menu {
	private static List<cliente> clientes = new ArrayList<>();

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nomeDelete;
		int opcao;
		cliente clienteSelecionado = null;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("  #####                ######                 \r\n"
					+ " #     #  ####   ####  #     #  ####   ####   \r\n"
					+ " #       #    # #    # #     # #    # #    #  \r\n"
					+ " #  #### #    # #    # #     # #    # #       \r\n"
					+ " #     # #    # #    # #     # #    # #  ###  \r\n"
					+ " #     # #    # #    # #     # #    # #    #  \r\n"
					+ "  #####   ####   ####  ######   ####   ####   ");
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
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND);
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
				System.out.println("Cadastro de novo cliente\n\n");
				cliente novoCliente = new cliente("", "", "", "", "", "", "", "", "");
				novoCliente.cadastrar();
				clientes.add(novoCliente);

				keyPress();
				break;

			case 2:
				System.out.println("Atualizar Dados dos clientes\n\n");
				System.out.println("Selecione o cliente que deseja atualizar");
				
				for (int i = 0; i < clientes.size(); i++) {
			        System.out.println((i+1) + " - " + clientes.get(i).getNomeDono());
			    }
				
			    int escolha = leia.nextInt();
			    clienteSelecionado = clientes.get(escolha - 1);
			    
			    System.out.println("Qual dado deseja atualizar para " + clienteSelecionado.getNomeDono() + "?");
			    System.out.println("1 - Nome do Dono");
			    System.out.println("2 - Endereço");
			    System.out.println("3 - Telefone");
			    
			    int opcaoDado = leia.nextInt();

			    switch (opcaoDado) {
			    case 1:
		            System.out.println("Digite o novo nome: ");
		            String novoNome = leia.next();
		            
		            clienteSelecionado.setNomeDono(novoNome);
		            System.out.println("Nome atualizado para: " + clienteSelecionado.getNomeDono());
		            
		            keyPress();
		            break;
			    
			    case 2:
		            System.out.println("Digite o novo endereço: ");
		            String novoEndereco = leia.next();
		            clienteSelecionado.setEndereco(novoEndereco);
		            System.out.println("Endereço atualizado para: " + clienteSelecionado.getEndereco());
		            
		            keyPress();
		            break;
		            
			    case 3:
		            System.out.println("Digite o novo telefone: ");
		            String novoTelefone = leia.next();
		            clienteSelecionado.setTelefone(novoTelefone);
		            System.out.println("Telefone atualizado para: " + clienteSelecionado.getTelefone());
		            
		            keyPress();
		            break;
			 }
			    
			case 3:
				System.out.println("Listar clientes ativos \n\n");
				for (cliente cliente : clientes) {
					cliente.visualizar();
					System.out.println();

				}
				keyPress();
				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE + "Apagar Cliente\n\n");

				System.out.println("Digite o nome do cliente: ");
				nomeDelete = leia.next();
				
				int index = -1;
				for (int i = 0; i < clientes.size(); i++) {
				    if (clientes.get(i).getNomeDono().equals(nomeDelete)) {
				        index = i;
				        break;
				    }
				}
			

				if (index != -1) {
				    clientes.remove(index);
				    System.out.println("\nA Conta do cliente: " + nomeDelete + " foi deletada com sucesso!");
				} else {
				    System.out.println("\nA Conta do cliente: " + nomeDelete + " não foi encontrada!");
				}
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
		System.out.println();
		System.out.println();
		System.out.println("Andresa Marçal   -> github.com/amarcal07");
		System.out.println();
		System.out.println("Carolina Araujo  -> github.com/CarolFAraujo");
		System.out.println();
		System.out.println("Daisy Santos     -> github.com/daisysantos");
		System.out.println();
		System.out.println("Joyce Rodrigues  -> github.com/carol20joyce");
		System.out.println();
		System.out.println("Julia Valerio    -> github.com/JuliaValerio");
		System.out.println();
		System.out.println("Katarina Pereira -> github.com/302kt");
	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "Pressione ENTER para continuar");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Erro de digitação!");
		}
	}
}
