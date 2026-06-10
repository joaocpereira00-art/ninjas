package br.com.etec.ninjas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.etec.ninjas.model.Ninja;
import br.com.etec.ninjas.repository.NinjaRepository;

@Service
public class NinjasService {
    
    @Autowired
    private NinjaRepository ninjaRepository ; 
    // srve para colocar um cadastro por vez
    public Ninja cadastrarNinja (Ninja ninja){
        return ninjaRepository.save(ninja);
    }
    // serve para colocar varios cadastros
    public List<Ninja> listarNinjas(){
        return ninjaRepository.findAll();
    }
    
}
