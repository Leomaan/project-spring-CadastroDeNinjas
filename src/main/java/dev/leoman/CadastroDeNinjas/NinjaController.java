package dev.leoman.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NinjaController {


    @GetMapping("/ola")
    public String ola(){
        return "Essa é a primeira mensagem na minha rota";
    }


}
