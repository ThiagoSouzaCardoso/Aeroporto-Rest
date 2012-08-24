package br.com.usjt.aeroporto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuariosController {

	@RequestMapping("/login")
	public String index() {
		return "usuarios/login";
	}

}
