package com.kaique.crud.api.services;

import java.util.List;
import java.util.Optional;

import com.kaique.crud.api.documents.Cliente;

public interface ClienteService {
	
	List<Cliente> listarTodos();
	
	Optional<Cliente> listarPorId(String id);
	
	Cliente cadastrar(Cliente cliente);
	
	Cliente atualizar(Cliente cliente);
	
	void remover(String id);

}
