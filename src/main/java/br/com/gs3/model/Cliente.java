package br.com.gs3.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    @Column(name = "CPF")
    private String cpf;
    
    @Column(name = "CEP")
    private String cep;
    
    @Column(name = "LOGRADOURO")
    private String logradouro;
    
    @Column(name = "BAIRRO")
    private String bairro;
    
    @Column(name = "CIDADE")
    private String cidade;
    
    @Column(name = "UF")
    private String uf;
    
    @Column(name = "COMPLEMENTO")
    private String complemento;
    
    @OneToMany(cascade = { CascadeType.ALL })
    @JoinColumn(name = "cliente_id")
    List<Telefone> telefones;

    @OneToMany(cascade = { CascadeType.ALL })
    @JoinColumn(name = "email_id")
    List<Email> emails;
}
