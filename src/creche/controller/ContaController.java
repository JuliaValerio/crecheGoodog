package creche.controller;

import java.util.ArrayList;
import java.util.List;

import Conta.Repository.ContaRepository;
import creche.cliente.cliente;

public class ContaController implements ContaRepository{
	
	private static List<cliente> clientes = new ArrayList<>();
	
	@Override
	public void atualizar (cliente Cliente) {
	
		Cliente.setNomeDono("novo Nome");
		
		
		for (cliente cliente: clientes) {
			var buscaCliente = cliente;

		}
		
		//var buscaCliente = buscarnaCollection(cliente.getNomeDono());//
	
		if(buscaCliente != null) {
			listaCliente.set(listaCliente.indexOf(buscaCliente), Cliente);
			System.out.println("Os dados da Conta foram atualizados com sucesso!");
		}else
			System.out.println("A conta não foi encontrada!");
	
}

}
