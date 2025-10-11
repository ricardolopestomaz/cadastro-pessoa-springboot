package dev.ricardolopestomaz.cadastro_pessoa_springboot.carros.service;

import dev.ricardolopestomaz.cadastro_pessoa_springboot.carros.model.CarrosModel;
import dev.ricardolopestomaz.cadastro_pessoa_springboot.carros.repository.CarrosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarrosService {

    private final CarrosRepository carrosRepository;

    public CarrosService(CarrosRepository carrosRepository) {
        this.carrosRepository = carrosRepository;
    }

    public List<CarrosModel> listarTodos(){
        return carrosRepository.findAll();
    }

    public Optional<CarrosModel> buscarPorId(Long id){
        return carrosRepository.findById(id);
    }

    public CarrosModel salvar(CarrosModel carro){
        return carrosRepository.save(carro);
    }

    public void deletar(Long id){
        carrosRepository.deleteById(id);
    }
}
