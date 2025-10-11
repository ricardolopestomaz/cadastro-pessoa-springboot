package dev.ricardolopestomaz.cadastro_pessoa_springboot.carros.controller;

import dev.ricardolopestomaz.cadastro_pessoa_springboot.carros.model.CarrosModel;
import dev.ricardolopestomaz.cadastro_pessoa_springboot.carros.service.CarrosService;
import dev.ricardolopestomaz.cadastro_pessoa_springboot.clientes.model.ClientesModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carros")
public class CarrosController {

    private CarrosService carrosService;

    public CarrosController(CarrosService carrosService) {
        this.carrosService = carrosService;
    }

    // GET - Listar todos os carros
    @GetMapping
    public ResponseEntity<List<CarrosModel>> listarTodos(){
        List<CarrosModel> carros = carrosService.listarTodos();
        return ResponseEntity.ok(carros);
    }

    // GET - Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<CarrosModel> buscarPorId(@PathVariable Long id){
        Optional<CarrosModel> carro = carrosService.buscarPorId(id);

        if(carro.isPresent()){
            return ResponseEntity.ok(carro.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // POST - Criar novo carro
    @PostMapping
    public ResponseEntity<CarrosModel> salvar(@RequestBody CarrosModel carro){
        CarrosModel carroSalvo = carrosService.salvar(carro);
        return new ResponseEntity<>(carroSalvo, HttpStatus.CREATED);
    }

    // PUT - Atualizar carro
    @PutMapping("/{id}")
    public ResponseEntity<CarrosModel> atualizarCarro(@PathVariable Long id,@RequestBody CarrosModel carro){
        Optional<CarrosModel> carroExiste = carrosService.buscarPorId(id);

        if(carroExiste.isPresent()){
            carro.setId(id);
            CarrosModel carroAtualizado = carrosService.salvar(carro);
            return ResponseEntity.ok(carroAtualizado);
        }   else {
            return  ResponseEntity.notFound().build();
        }
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        Optional<CarrosModel> carroExiste = carrosService.buscarPorId(id);
        if(carroExiste.isPresent()){
            carrosService.deletar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
