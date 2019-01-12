package net.tecgurus.spring.mvc.controller;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.tecgurus.spring.mvc.beans.Catalogo;
import net.tecgurus.spring.mvc.entities.CatalogoGeneralEntity;
import net.tecgurus.spring.mvc.repository.CatalogoRepository;

@Controller
public class CatalogoController {
	
	@Autowired
	private CatalogoRepository catalogoRepository;
	
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
		
		CatalogoGeneralEntity catalogoGeneralEntity = new CatalogoGeneralEntity();
		catalogoGeneralEntity.setDsc_cor_cat(catRequest.getDesCorCat());
		catalogoGeneralEntity.setDsc_com_cat(catRequest.getDesComCat());
		catalogoGeneralEntity.setId_est_cat(catRequest.getIdEstCat());
		catalogoGeneralEntity.setFch_cre(new Timestamp(new Date().getTime()));
		catalogoGeneralEntity.setFch_mod(new Timestamp(new Date().getTime()));
		
		catalogoRepository.save(catalogoGeneralEntity);
		
		return "redirect:/catalogo";
	}

}
