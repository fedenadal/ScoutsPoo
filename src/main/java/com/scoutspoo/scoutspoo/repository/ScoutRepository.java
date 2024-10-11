
package com.scoutspoo.scoutspoo.repository;

import com.scoutspoo.scoutspoo.entity.Scout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoutRepository extends JpaRepository<Scout,Long>{  //(Tipo de dato de la clase, Tipo de dato del ID)
    
}
