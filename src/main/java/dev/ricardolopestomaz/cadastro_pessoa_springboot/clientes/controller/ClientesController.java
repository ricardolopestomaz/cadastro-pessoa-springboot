package dev.ricardolopestomaz.cadastro_pessoa_springboot.clientes.controller;

import dev.ricardolopestomaz.cadastro_pessoa_springboot.clientes.model.ClientesModel;
import dev.ricardolopestomaz.cadastro_pessoa_springboot.clientes.service.ClientesService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    private final ClientesService clientesService;

    public ClientesController(ClientesService clientesService) {
        this.clientesService = clientesService;
    }

    // GET - Listar todos os clientes
    @GetMapping
    public ResponseEntity<List<ClientesModel>> listarTodos(){
        List<ClientesModel> clientes = clientesService.listarTodos();
        return ResponseEntity.ok(clientes);
    }

    // GET - Buscar cliente por ID
    @GetMapping("/{id}")
    public ResponseEntity<ClientesModel> buscarPorId(@PathVariable Long id){
        Optional<ClientesModel> cliente = clientesService.buscarPorId(id);
        if (cliente.isPresent()){
            return ResponseEntity.ok(cliente.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // POST - Criar novo cliente
    @PostMapping
    public  ResponseEntity<ClientesModel> criarCliente(@RequestBody ClientesModel cliente){
        ClientesModel clienteSalvo = clientesService.salvar(cliente);
        return new ResponseEntity<>(clienteSalvo, HttpStatus.CREATED);
    }

    // PUT - Atualizar cliente existente
    @PutMapping("/{id}")
    public ResponseEntity<ClientesModel> atualizarCliente(@PathVariable Long id, @RequestBody ClientesModel cliente){
        Optional<ClientesModel> clienteExistente = clientesService.buscarPorId(id);

        if(clienteExistente.isPresent()){
            cliente.setId(id);
            ClientesModel clienteAtualizado = clientesService.salvar(cliente);
            return ResponseEntity.ok(clienteAtualizado);
        }   else {
            return  ResponseEntity.notFound().build();
        }
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id){
        Optional<ClientesModel> clienteExistente = clientesService.buscarPorId(id);
        if(clienteExistente.isPresent()){
            clientesService.deletar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
