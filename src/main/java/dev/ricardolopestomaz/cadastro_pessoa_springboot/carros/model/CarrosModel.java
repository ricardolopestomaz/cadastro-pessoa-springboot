package dev.ricardolopestomaz.cadastro_pessoa_springboot.carros.model;


import dev.ricardolopestomaz.cadastro_pessoa_springboot.clientes.model.ClientesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_carros")
@NoArgsConstructor
@AllArgsConstructor
@Data
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

    // Muitos carros podem pertencer a um único cliente
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClientesModel cliente;
}
