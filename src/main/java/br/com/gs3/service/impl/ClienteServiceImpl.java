package br.com.gs3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.gs3.model.Cliente;
import br.com.gs3.repository.ClienteRepository;
import br.com.gs3.service.ClienteService;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

	@Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public Cliente salvar(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> listarTodos() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente findOne(Long id) {
        return this.clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void deletar(Long id) {
        Cliente c = this.findOne(id);
        this.clienteRepository.delete(c);
    }

}
