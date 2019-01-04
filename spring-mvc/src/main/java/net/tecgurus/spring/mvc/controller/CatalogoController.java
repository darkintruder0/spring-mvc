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
	public String GetFormCatalogo(Model model) {
		
		model.addAttribute("catalogoOBJ", new Catalogo());
		return "catalogo";
	}
	
	@PostMapping("/validarcatalogo")
	public String postCatalogo(@ModelAttribute Catalogo catRequest) {
		
		System.out.println("u: "+catRequest.getDesCorCat());
		System.out.println("u: "+catRequest.getDesComCat());
		System.out.println("u: "+catRequest.getIdEstCat());
		
		return "redirect:/catalogo";
	}

}
