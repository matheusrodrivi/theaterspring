package com.dwc.rest_dwc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "API de Peças Teatrais e Diretores rodando com sucesso!";
    }
}
