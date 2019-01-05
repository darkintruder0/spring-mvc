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
import net.tecgurus.spring.mvc.entities.CatalogoEntity;

import net.tecgurus.spring.mvc.repository.CatalogoRepository;


//Comentario de prueba
@Controller
public class CatalogoController {
	
	@Autowired //Inyeccion de dependencias
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
		
		
		//Obj Login Entity
		
		CatalogoEntity catalogoEntity = new CatalogoEntity();
		
		catalogoEntity.setIdEstCat(catRequest.getIdEstCat());
		catalogoEntity.setDesCorCat(catRequest.getDesCorCat());
		catalogoEntity.setDesComCat(catRequest.getDesComCat());
		catalogoEntity.setFchCrea(new Timestamp(new Date().getTime()));
		catalogoEntity.setFchModi(new Timestamp(new Date().getTime()));
		
		
		//Uso de métodos
		
		CatalogoEntity catalogoRepo = catalogoRepository.findByIdCat(catalogoEntity.getIdCat());
		
		catalogoRepository.save(catalogoEntity);
		
		if (catalogoRepo == null ) {
			System.out.println("No existe");
			return "redirect:/catalogo";
		} else {
			System.out.println("Id catalogo " + catalogoRepo.getIdCat());
			return "redirect:/catalogo";
		}
		
		
		
		
	}

}
