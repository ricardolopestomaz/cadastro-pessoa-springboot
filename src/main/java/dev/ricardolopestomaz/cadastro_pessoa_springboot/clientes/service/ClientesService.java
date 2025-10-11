package dev.ricardolopestomaz.cadastro_pessoa_springboot.clientes.service;

import dev.ricardolopestomaz.cadastro_pessoa_springboot.clientes.model.ClientesModel;
import dev.ricardolopestomaz.cadastro_pessoa_springboot.clientes.repository.ClientesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesService {
    private final ClientesRepository clientesRepository;

    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    // Lista todos os clientes
    public List<ClientesModel> listarTodos(){
        return clientesRepository.findAll();
    }

    // Busca o cliente pelo ID
    public Optional<ClientesModel> buscarPorId(Long id) {
        return clientesRepository.findById(id);
    }

    public ClientesModel salvar(ClientesModel cliente){
        return clientesRepository.save(cliente);
    }

    public void deletar(Long id){
        clientesRepository.deleteById(id);
    }
}
