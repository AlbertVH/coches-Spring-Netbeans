
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Coche;

/**
 *
 * @author Albertazo
 */

public interface cochesRepository extends JpaRepository<Coche, Long>{
    
}
