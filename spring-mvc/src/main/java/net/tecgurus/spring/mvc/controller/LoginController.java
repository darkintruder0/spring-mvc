/**
 * 
 */
package net.tecgurus.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.tecgurus.spring.mvc.beans.Login;
import net.tecgurus.spring.mvc.entities.LoginEntity;
import net.tecgurus.spring.mvc.repository.LoginRepository;

/**
 * @author Allan Flores Rojas
 *
 */
@Controller
public class LoginController {
	
	@Autowired //Inyeccion de dependencias
	private LoginRepository loginRepository;
	
	
	@GetMapping("/login")
	public String getLogin(Model model) {
		//attributeName = el nombre con el que es llamado en el html
		//attributeValue = tipo de objeto que se desea inyectar
		model.addAttribute("loginOBJ", new Login());
		return "login";
	}
	
	@PostMapping("/validarlogin")
	public String postLogin(@ModelAttribute Login loginRequest) {
		
		System.out.println("u: "+loginRequest.getEmail());
		System.out.println("u: "+loginRequest.getPassword());
		
		//Obj Login Entity
		
		LoginEntity loginEntity = new  LoginEntity();
		loginEntity.setEmail(loginRequest.getEmail());
		loginEntity.setPassword(loginRequest.getPassword());
		
			
		
		LoginEntity loginRepo = loginRepository.findByEmailAndPassword(loginEntity.getEmail(), loginEntity.getPassword());
		
		loginRepository.save(loginEntity);
		
		if (loginRepo == null ) {
			System.out.println("No existe");
			return "redirect:/login";
		} else {
			System.out.println("Id user " + loginRepo.getId());
			return "redirect:/catalogo";
		}
		
		
		
	}

}
