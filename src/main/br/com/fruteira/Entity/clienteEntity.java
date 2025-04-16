package br.com.fruteira.Entity;


import javax.persistence.*;

//nome da tabela
@Entity(name = "clienteEntity")
public class clienteEntity {

    //criacao das colunas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome",nullable = false)
    private String nome;

    @Column(name = "cpf",nullable = false)
    private String cpf;

    // Construtor com parâmetros
    public clienteEntity(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    //gets and sets
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
