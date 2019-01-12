/**
 * 
 */
package net.tecgurus.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.tecgurus.spring.mvc.beans.Cuenta;

/**
 * @author Allan Flores Rojas
 *
 */
@Controller
public class CuentaController {
	
	@GetMapping("/cuenta")
	public String GetFormCuenta(Model model) {
		
		model.addAttribute("cuentaOBJ", new Cuenta());
		return "cuenta";
	}
	
	@PostMapping("/validarcuenta")
	public String postCatalogo(@ModelAttribute Cuenta ctaRequest) {
		
		System.out.println("u: "+ctaRequest.getNoCta());
		System.out.println("u: "+ctaRequest.getIdTipCta());
		System.out.println("u: "+ctaRequest.getIdEst());
		System.out.println("u: "+ctaRequest.getNoTar());
		System.out.println("u: "+ctaRequest.getBlncCta());
		
		return "redirect:/cuenta";
	}

}
