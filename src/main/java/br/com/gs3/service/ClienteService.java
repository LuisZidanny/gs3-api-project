package br.com.gs3.service;


import java.util.List;

import br.com.gs3.model.Cliente;


public interface ClienteService {

    Cliente salvar(Cliente cliente);
    
    List<Cliente> listarTodos();
    
    Cliente findOne(Long id);
    
    void deletar(Long id);
}
