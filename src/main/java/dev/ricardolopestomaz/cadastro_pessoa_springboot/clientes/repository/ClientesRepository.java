package dev.ricardolopestomaz.cadastro_pessoa_springboot.clientes.repository;

import dev.ricardolopestomaz.cadastro_pessoa_springboot.clientes.model.ClientesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<ClientesModel, Long> {
}
