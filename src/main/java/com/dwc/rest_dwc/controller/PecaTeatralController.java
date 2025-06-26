package com.dwc.rest_dwc.controller;

import com.dwc.rest_dwc.model.PecaTeatral;
import com.dwc.rest_dwc.service.PecaTeatralService;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

import java.util.List;

@RestController
@RequestMapping("/pecateatral")
public class PecaTeatralController {

    PecaTeatralService pecaTeatralService;

    public PecaTeatralController(PecaTeatralService pecaTeatralService) {
        this.pecaTeatralService = pecaTeatralService;
    }

    @Operation(summary = "Buscar PecaTeatral por ID", description = "Retorna os dados de uma PecaTeatral específico com base no ID informado.")
    @GetMapping("{id}")
    public PecaTeatral getPecaTeatral (@PathVariable("id") int id) {
        return pecaTeatralService.getPecaTeatral(id);
    }

    @Operation(summary = "Buscar todos os dados PecaTeatral", description = "Retorna todos os dados de uma PecaTeatral.")
    @GetMapping
    public List<PecaTeatral> getAllPecaTeatral() {
        return pecaTeatralService.getAllPecaTeatral();
    }

    @Operation(summary = "Criar PecaTeatral", description = "Cria PecaTeatral com POST.")
    @PostMapping
    public String createPecaTeatral(@RequestBody PecaTeatral pecaTeatral) {
        pecaTeatralService.createPecaTeatral(pecaTeatral);
        return "Peça teatral criada";
    }

    @Operation(summary = "Atualizar PecaTeatral", description = "Atualizar os dados de uma PecaTeatral.")
    @PutMapping
    public String updatePecaTeatral(@RequestBody PecaTeatral pecaTeatral) {
        pecaTeatralService.updatePecaTeatral(pecaTeatral);
        return "Peça teatral atualizada com sucesso";
    }

    @Operation(summary = "Deletar PecaTeatral", description = "Deletar os dados de uma PecaTeatral.")
    @DeleteMapping("{id}")
    public String deletePecaTeatral(@PathVariable("id") int id) {
        pecaTeatralService.deletePecaTeatral(id);
        return "Peça teatral excluida com sucesso";
    }
}