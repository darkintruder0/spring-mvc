/**
 * 
 */
package net.tecgurus.spring.mvc.repository;

import org.springframework.data.repository.CrudRepository;

import net.tecgurus.spring.mvc.entities.CatalogoGeneralEntity;

/**
 * @author Allan Flores Rojas
 *
 */
public interface CatalogoRepository extends CrudRepository<CatalogoGeneralEntity, Integer>{

}
