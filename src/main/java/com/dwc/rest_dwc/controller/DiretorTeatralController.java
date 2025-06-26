package com.dwc.rest_dwc.controller;

import com.dwc.rest_dwc.model.DiretorTeatral;
import com.dwc.rest_dwc.service.DiretorTeatralService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diretorteatral")
public class DiretorTeatralController {

    DiretorTeatralService diretorTeatralService;

    public DiretorTeatralController(DiretorTeatralService diretorTeatralService) {
        this.diretorTeatralService = diretorTeatralService;
    }

    // Leitura de um DiretorTeatral especifico
    @GetMapping("{id}")
    public DiretorTeatral getDiretorTeatral(@PathVariable("id") int id) {
        return diretorTeatralService.getDiretorTeatral(id);
    }

    // Leitura de todos DiretorTeatral
    @GetMapping()
    public List<DiretorTeatral> getAllDiretorTeatral() {
        return diretorTeatralService.getAllDiretorTeatral();
    }


    @PostMapping
    public String createDiretorTeatral(@RequestBody DiretorTeatral diretorTeatral) {
        diretorTeatralService.createDiretorTeatral(diretorTeatral);
        return "Diretor teatral criado";
    }

    @PutMapping
    public String updateDiretorTeatral(@RequestBody DiretorTeatral diretorTeatral) {
        diretorTeatralService.updateDiretorTeatral(diretorTeatral);
        return "Diretor teatral atualizado com sucesso";
    }

    @DeleteMapping("{id}")
    public String deleteDiretorTeatral(@PathVariable("id") int id) {
        diretorTeatralService.deleteDiretorTeatral(id);
        return "Diretor teatral excluido com sucesso";
    }






}
