/**
 * 
 */
package net.tecgurus.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.tecgurus.spring.mvc.beans.Cliente;

/**
 * @author Allan Flores Rojas
 *
 */
@Controller
public class ClienteController {
	
	@GetMapping("/cliente")
	public String GetFormCatalogo(Model model) {
		
		model.addAttribute("clienteOBJ", new Cliente());
		return "cliente";
	}
	
	@PostMapping("/validarcliente")
	public String postCatalogo(@ModelAttribute Cliente cteRequest) {
		
		System.out.println("u: "+cteRequest.getNombre());
		System.out.println("u: "+cteRequest.getApePat());
		System.out.println("u: "+cteRequest.getApeMat());
		System.out.println("u: "+cteRequest.getTelCte());
		System.out.println("u: "+cteRequest.getDirCte());
		System.out.println("u: "+cteRequest.getIdEdoCte());
		
		return "redirect:/cliente";
	}

}
