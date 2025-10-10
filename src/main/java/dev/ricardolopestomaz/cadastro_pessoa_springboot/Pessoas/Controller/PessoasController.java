package dev.ricardolopestomaz.cadastro_pessoa_springboot.Pessoas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PessoasController {
    @GetMapping("/")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }
}
