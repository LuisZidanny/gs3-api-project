package br.com.gs3.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gs3.model.Cliente;
import br.com.gs3.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteResource {
 
    @Autowired
    private ClienteService clienteService;
    
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return this.clienteService.salvar(cliente);
    }
    
    @GetMapping
    public List<Cliente> buscarTodos(){
        return this.clienteService.listarTodos();
    }
    
    @GetMapping("/{id}")
    public Cliente buscarCliente(@PathVariable Long id) {
        return this.clienteService.findOne(id);
    }
    
    @GetMapping("deletar/{id}")
    public void deletarCliente(@PathVariable Long id) {
        this.clienteService.deletar(id);
    }
}
