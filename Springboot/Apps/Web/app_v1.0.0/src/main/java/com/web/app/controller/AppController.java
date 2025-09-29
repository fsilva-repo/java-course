package com.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.app.model.Item;

import java.util.List;
import java.util.Map;

@Controller
public class AppController {

  // ---------- Retorna JSON ----------
  @GetMapping("/api")
  @ResponseBody // indica que o retorno será o corpo da resposta
  public Map<String, String> api() {
    return Map.of(
        "message", "Olá! Este é um JSON retornado pelo endpoint /api",
        "status", "success");
  }

  // ---------- Retorna página HTML ----------
@GetMapping("/web")
public String exibirPagina(Model model) {
    model.addAttribute("title", "Minha Página Web");
    model.addAttribute("subtitle", "Web app com Spring Boot e Thymeleaf");
    model.addAttribute("loremIpsum", List.of(
            new Item("Olá! Este é um retornado pelo endpoint /web").getMsg(),
            new Item("trazendo uma saldação aos visitantes.").getMsg()
    ));
    return "index.html"; // resolve src/main/resources/templates/index.html
}
}

