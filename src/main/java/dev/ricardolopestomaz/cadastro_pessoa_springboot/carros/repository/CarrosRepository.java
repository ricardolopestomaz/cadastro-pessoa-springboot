package dev.ricardolopestomaz.cadastro_pessoa_springboot.carros.repository;

import dev.ricardolopestomaz.cadastro_pessoa_springboot.carros.model.CarrosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrosRepository extends JpaRepository<CarrosModel, Long> {

}
