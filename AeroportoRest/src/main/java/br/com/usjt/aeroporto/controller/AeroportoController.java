package br.com.usjt.aeroporto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/paginas")
public class AeroportoController {

	@RequestMapping(value = "/welcome")
	public ModelAndView helloWord() {
		String message = "Hello World, Spring 3.0!";
		return new ModelAndView("/paginas/welcome", "message", message);
	}

}