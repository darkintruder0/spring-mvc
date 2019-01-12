/**
 * 
 */
package net.tecgurus.spring.mvc.repository;

import org.springframework.data.repository.CrudRepository;

import net.tecgurus.spring.mvc.entities.LoginEntity;

/**
 * @author Allan Flores Rojas
 *
 */
public interface LoginRepository extends CrudRepository<LoginEntity, Integer>{
	
	LoginEntity findByEmailAndPassword(String email,String password);

}
