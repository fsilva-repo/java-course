package com.web.app.controller;

import com.web.app.model.Item;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AppController {
	
  // ---------- Retorna página de login ----------
	@GetMapping("/")
	public String login() {
		return "login";
	}
	
	
	// ---------- Recebe o post e retorna a página da aplicação ----------
  @PostMapping("/service")
	public String app(Model model) {
	  model.addAttribute("title", "Página da Aplicação Web");
	  model.addAttribute("subtitle", "Web app com Spring Boot e Thymeleaf");
	  model.addAttribute("loremIpsum", List.of(
	        new Item("Olá! apenas").getMsg(),
	        new Item("trazendo uma saldação aos visitantes.").getMsg()
	    )).toString();
	    return "app";
	}

	
}



















