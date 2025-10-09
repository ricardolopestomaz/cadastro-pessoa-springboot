package dev.ricardolopestomaz.cadastro_pessoa_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PessoaController {
    @GetMapping("/")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }
}
