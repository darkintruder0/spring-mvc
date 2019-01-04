/**
 * 
 */
package net.tecgurus.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Allan Flores Rojas
 *
 */
@Controller
public class IndexController {
	//HandlerMapping
	@GetMapping("/index") //Mapeo de URIs
	public String getIndex(){  //Controlador que resuelve URI
		return "index"; //View Resolver
	}

}
