package net.tecgurus.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.tecgurus.spring.mvc.beans.Catalogo;

@Controller
public class CatalogoController {
	
	@GetMapping("/catalogo")
	public String getFormCatalogo(Model model) {
		
		// attributename == el nombre con el que es llamado en el html
		// attributeValue == el tipo de objeto que se desea inyectar 
		model.addAttribute("catalogo", new Catalogo() );
		
		return "catalogo";
	}
	
	
	@PostMapping("/validarCatalogo")
	public String postCatalogo(@ModelAttribute Catalogo catalogoRequest) {
		
		System.out.println("desc cor: " +catalogoRequest.getDsc_cor_cat());
		System.out.println("desc com: " +catalogoRequest.getDsc_com_cat());
		System.out.println("desc com: " +catalogoRequest.getId_est_cat());
		
		return "catalogo";
	}

}
