package com.algaworks.curso.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.algaworks.curso.dao.ClienteDAO;
import com.algaworks.curso.dao.DAOException;
import com.algaworks.curso.modelo.Cliente;

public class JdbcClienteDAO implements ClienteDAO {

	private Connection connection;
	
	public JdbcClienteDAO(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void salvar(Cliente cliente) {
		try {
			String sql = String.format("insert into cliente (nome) value ('%s')", cliente.getNome());
		
			PreparedStatement ps = this.connection.prepareStatement(sql);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DAOException("Erro salvando cliente", e);
		} finally {
			try {
				this.connection.close();
			} catch(Exception e) {}
		}
	}

}
