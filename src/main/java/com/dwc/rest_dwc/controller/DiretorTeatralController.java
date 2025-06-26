package com.dwc.rest_dwc.controller;

import com.dwc.rest_dwc.model.DiretorTeatral;
import com.dwc.rest_dwc.service.DiretorTeatralService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;

@RestController
@RequestMapping("/diretorteatral")
public class DiretorTeatralController {

    DiretorTeatralService diretorTeatralService;

    public DiretorTeatralController(DiretorTeatralService diretorTeatralService) {
        this.diretorTeatralService = diretorTeatralService;
    }

    // Leitura de um DiretorTeatral especifico
    @Operation(summary = "Buscar DiretorTeatral por ID", description = "Retorna os dados de um Diretor Teatral específico com base no ID informado.")
    @GetMapping("{id}")
    public DiretorTeatral getDiretorTeatral(@PathVariable("id") int id) {
        return diretorTeatralService.getDiretorTeatral(id);
    }

    // Leitura de todos DiretorTeatral
    @Operation(summary = "Buscar todos os dados de DiretorTeatral", description = "Retorna todos os dados de Diretor Teatral.")
    @GetMapping()
    public List<DiretorTeatral> getAllDiretorTeatral() {
        return diretorTeatralService.getAllDiretorTeatral();
    }

    @Operation(summary = "Criar um DiretorTeatral", description = "Cria um DiretorTeatral com POST")
    @PostMapping
    public String createDiretorTeatral(@RequestBody DiretorTeatral diretorTeatral) {
        diretorTeatralService.createDiretorTeatral(diretorTeatral);
        return "Diretor teatral criado";
    }

    @Operation(summary = "Atualiza um DiretorTeatral", description = "Atualiza um DiretorTeatral com PUT")
    @PutMapping
    public String updateDiretorTeatral(@RequestBody DiretorTeatral diretorTeatral) {
        diretorTeatralService.updateDiretorTeatral(diretorTeatral);
        return "Diretor teatral atualizado com sucesso";
    }

    @Operation(summary = "Deleta um DiretorTeatral", description = "Deleta um DiretorTeatral com DELETE")
    @DeleteMapping("{id}")
    public String deleteDiretorTeatral(@PathVariable("id") int id) {
        diretorTeatralService.deleteDiretorTeatral(id);
        return "Diretor teatral excluido com sucesso";
    }
}
