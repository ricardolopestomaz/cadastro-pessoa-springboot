package dev.ricardolopestomaz.cadastro_pessoa_springboot.Carros.Model;


import dev.ricardolopestomaz.cadastro_pessoa_springboot.Pessoas.Model.PessoasModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_carros")
public class CarrosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String marca;
    private String placa;
    private String cor;
    private String tipoCombustivel;
    private float quilometragem;

    //@OneToMany - Um Carro pode ter várias Pessoas
    @OneToMany(mappedBy = "carros")
    private List<PessoasModel> pessoas;
}
