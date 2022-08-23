
package com.example.services;

import com.example.entity.Coche;
import com.example.repository.cochesRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Albertazo
 */

@Service
public class cochesServices {
    @Autowired  //importacion de dependencias
    cochesRepository cRepository;
    
    public ArrayList<Coche> listarCoches(){ 
        return (ArrayList<Coche>) cRepository.findAll();
        //casteo a qué formato se retorna
        // se lista todo indiscriminadamente
    }
    
    public Coche guardarCoches(Coche coche){
        return cRepository.save(coche);
    }
    
    public Optional<Coche> mostrarPorId(Long id){
        return cRepository.findById(id);
    }
    
    public boolean borrarPorId(Long id){
        try{
            cRepository.deleteById(id);
            System.out.println("Sí se ha borrado");
        return true;
        } catch (Exception e) {
            System.out.println("NO se ha borrado");
            return false;
        }
        
    }
    
}
