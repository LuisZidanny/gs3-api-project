package br.com.gs3.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClienteDTO {

    private Long id;
    private String nome;
    private String cpf;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    private String complemento;

}
