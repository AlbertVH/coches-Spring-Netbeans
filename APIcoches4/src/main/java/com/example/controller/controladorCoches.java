
package com.example.controller;

import com.example.entity.Coche;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController; //does not exist, y también dice que falta añadirlo al POM
import org.springframework.web.bind.annotation.RequestMapping; //does not exist

/**
 *
 * @author Albertazo
 */

@RestController //cannot find class RestController
@RequestMapping("/api") //cannot find class @RequestMapping
public class controladorCoches {
    @Autowired
    cochesServices cServices; //cServices es el nombre del objeto
    
    @GetMapping("/coches")
    public ArrayList<Coche> listarCoches (){
        return cServices.listarCoches(); //por qué no se castea aquí??? 
    }
    
    @PostMapping("/coches") //pasar info desde front a end
    public void guardarCoches(@RequestBody Coche coche){ 
        cServices.guardarCoches(coche)
    }
    
    @PutMapping("/coches/{id}")
    public void actualizar(@RequestBody Coche coche){ //void
        cServices.guardarCoches(coche);
    }
    
    @DeleteMapping("/coches/{id}")
    public void borrarPorId(@PathVariable Long id){
        cServices.borrarporId(id);
    }
    
    @GetMapping("/coches/{id}")
    public Optional<Coche> mostrarUnCoche(@PathVariable Long id){
        //warning: search dependency at Maven Repositories fir PathVariable
        return cServices.mostrarPorId(id);
    }
}
