package br.com.etec.ninjas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.etec.ninjas.model.Ninja;
import br.com.etec.ninjas.repository.NinjaRepository;

@Service
public class NinjasService {
    
    @Autowired
    private NinjaRepository ninjaRepository ; 

    public Ninja cadastrNinja (Ninja ninja){
        return ninjaRepository.save(ninja);
    }
}
