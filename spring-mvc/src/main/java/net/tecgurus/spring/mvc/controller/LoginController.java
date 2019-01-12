/**
 * 
 */
package net.tecgurus.spring.mvc.controller;

import java.util.List;

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
	
	//Inyección del repositorio
	@Autowired
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
		
		//OBjeto LoginEntity
		LoginEntity loginEntity = new LoginEntity();
		loginEntity.setEmail(loginRequest.getEmail());
		loginEntity.setPassword(loginRequest.getPassword());
		
		LoginEntity loginRepo = loginRepository.findByEmailAndPassword(loginEntity.getEmail(), loginEntity.getPassword());
		
		loginRepository.save(loginEntity);
		
		if(loginRepo==null) {
			System.out.println("No Existe");
			return "redirect:/login";
		}
		else {
			System.out.println("ID Usuario: " + loginRepo.getId());
			return "redirect:/catalogo";
		}
		
	}
    
	@GetMapping("/listausuarios")
	public String getUsuarios(Model model) {
		
		List<LoginEntity> usuarios=(List<LoginEntity>)loginRepository.findAll(); //Select * from login
		
		for(LoginEntity user : usuarios) {
			System.out.println("u: "+user.getId());
			System.out.println("u: "+user.getEmail());
			System.out.println("u: "+user.getPassword());
		}
		
		//Se guarda en memoria
		model.addAttribute("listausuarios", usuarios);
		
		return "listausuarios";
		
	}
}
