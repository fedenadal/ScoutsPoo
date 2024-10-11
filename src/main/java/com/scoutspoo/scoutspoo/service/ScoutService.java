package com.scoutspoo.scoutspoo.service;

import com.scoutspoo.scoutspoo.entity.Scout;
import com.scoutspoo.scoutspoo.repository.ScoutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Capa de servicio para no acceder directamente al Repository
public class ScoutService {

    @Autowired //Inyecto la clase repository 
    private ScoutRepository scoutRepo;

    public List<Scout> listarScouts() {
        return scoutRepo.findAll();
    }

    public Scout guardarScout(Scout scout) {
        return scoutRepo.save(scout);
    }

    public void eliminarScout(Long codigo) {
        scoutRepo.deleteById(codigo);
    }

    public Scout obtenerScoutPorId(Long codigo) {
        return scoutRepo.findById(codigo).orElse(null);
    }
}
