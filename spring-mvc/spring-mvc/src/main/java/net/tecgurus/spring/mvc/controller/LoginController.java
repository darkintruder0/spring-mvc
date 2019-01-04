package net.tecgurus.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.tecgurus.spring.mvc.beans.Login;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String getLogin(Model model) {
		
		// attributename == el nombre con el que es llamado en el html
		// attributeValue == el tipo de objeto que se desea inyectar 
		model.addAttribute("loginObj", new Login() );
		
		return "login";
	}

	@PostMapping("/validarLogin")
	public String postlogin(@ModelAttribute Login loginRequest) {
		
		System.out.println("U: " +loginRequest.getEmail());
		System.out.println("P: " +loginRequest.getPassword());
		
		return "redirect:/catalogo";
	}
}
