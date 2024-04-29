package com.sherlock.dojosninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sherlock.dojosninjas.models.Dojo;
import com.sherlock.dojosninjas.models.Ninja;
import com.sherlock.dojosninjas.repositories.DojoRepository;
import com.sherlock.dojosninjas.repositories.NinjaRepository;

@Service
public class AppService {
    private final DojoRepository dojoRepository;
    private final NinjaRepository ninjaRepository;

    public AppService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
        this.dojoRepository = dojoRepository;
        this.ninjaRepository = ninjaRepository;
    }

    public Dojo findDojoById(Long id) {
        return dojoRepository.findById(id).get();
    }

    public List<Ninja> getNinjasByDojoId(Long id) {
        return dojoRepository.findById(id).get().getNinjas();
    }

    public List<Dojo> getAllDojos() {
        return (List<Dojo>) dojoRepository.findAll();
    }

    public Ninja findNinjaById(Long id) {
        return ninjaRepository.findById(id).get();
    }

    public void createDojo(Dojo dojo) {
        dojoRepository.save(dojo);
    }

    public void createNinja(Ninja ninja) {
        ninjaRepository.save(ninja);
    }
}
