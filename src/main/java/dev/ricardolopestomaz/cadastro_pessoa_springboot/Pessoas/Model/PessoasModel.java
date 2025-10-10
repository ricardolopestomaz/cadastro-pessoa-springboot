package dev.ricardolopestomaz.cadastro_pessoa_springboot.Pessoas.Model;

import dev.ricardolopestomaz.cadastro_pessoa_springboot.Carros.Model.CarrosModel;
import jakarta.persistence.*;

import java.time.LocalDate;

// Entity ele transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_clientes")
public class PessoasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private LocalDate dataDeNascimento;

    // @ManyToOne - Uma Pessoa para vários Carros.
    @ManyToOne
    @JoinColumn(name = "carros_id") // chave estrangeira
    private CarrosModel carros;

    public PessoasModel() {

    }

    public PessoasModel(String email, LocalDate dataDeNascimento, String sobrenome, String nome) {
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.sobrenome = sobrenome;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
