package br.com.etec.ninjas.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etec.ninjas.model.Ninja;
import br.com.etec.ninjas.service.NinjasService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    @Autowired
       private NinjasService ninjasService;
 // cadastro de envio
       @PostMapping
       public Ninja cadastrarNinja(@Valid@RequestBody Ninja ninja){
        return ninjasService.cadastrarNinja(ninja);
        
       }

}
