package net.tecgurus.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	// es el que dice si es de tipo get o post
	
	@GetMapping("/index")  // 1 Handler Mapping - Mapeo de URIs
	public String getIndex() {  // 2) Controlador que resuelve URIs
		return "index";  // 3)  siempre va sin la terminacion 
	}

}
