/**
 * 
 */
package net.tecgurus.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.tecgurus.spring.mvc.beans.Login;

/**
 * @author Allan Flores Rojas
 *
 */
@Controller
public class LoginController {
	
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
		
		return "redirect:/form-catalogo";
	}

}
