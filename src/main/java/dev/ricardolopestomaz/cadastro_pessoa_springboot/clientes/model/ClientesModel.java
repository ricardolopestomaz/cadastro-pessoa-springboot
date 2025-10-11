package dev.ricardolopestomaz.cadastro_pessoa_springboot.clientes.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import dev.ricardolopestomaz.cadastro_pessoa_springboot.carros.model.CarrosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

// Entity ele transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_clientes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private LocalDate dataDeNascimento;


    // Um Cliente pode alugar vários Carros
    @OneToMany(mappedBy = "cliente")
    @JsonManagedReference
    private List<CarrosModel> carros;
}
