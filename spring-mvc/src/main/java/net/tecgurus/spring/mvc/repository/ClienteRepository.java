/**
 * 
 */
package net.tecgurus.spring.mvc.repository;

import org.springframework.data.repository.CrudRepository;

import net.tecgurus.spring.mvc.entities.ClienteEntity;

/**
 * @author Allan Flores Rojas
 *
 */
public interface ClienteRepository extends CrudRepository<ClienteEntity, Integer>{

}
