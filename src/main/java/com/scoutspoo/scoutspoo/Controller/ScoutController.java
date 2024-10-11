package com.scoutspoo.scoutspoo.Controller;

import com.scoutspoo.scoutspoo.entity.Scout;
import com.scoutspoo.scoutspoo.service.ScoutService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scouts")//Mappeo de URL
public class ScoutController {

    @Autowired  //Inyecta la clase Service
    private ScoutService scoutService; //Atributo
    
    @GetMapping//Select* from: Scout
    public List<Scout> obtenerTodosLosScouts() {
        return scoutService.listarScouts();
    }
    
}

