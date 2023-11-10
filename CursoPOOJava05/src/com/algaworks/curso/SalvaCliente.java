package com.algaworks.curso;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOFactory;
import com.algaworks.curso.modelo.Cliente;

public class SalvaCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Joao da Silva");
		
		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		clienteDAO.salvar(cliente);
		System.out.println("Cliente salvo com sucesso.");
	}
}
