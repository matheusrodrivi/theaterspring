package com.dwc.rest_dwc.controller;

import com.dwc.rest_dwc.model.PecaTeatral;
import com.dwc.rest_dwc.service.PecaTeatralService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pecateatral")
public class PecaTeatralController {

    PecaTeatralService pecaTeatralService;

    public PecaTeatralController(PecaTeatralService pecaTeatralService) {
        this.pecaTeatralService = pecaTeatralService;
    }

    @GetMapping("{id}")
    public PecaTeatral getPecaTeatral (@PathVariable("id") int id) {
        return pecaTeatralService.getPecaTeatral(id);
    }

    @GetMapping
    public List<PecaTeatral> getAllPecaTeatral() {
        return pecaTeatralService.getAllPecaTeatral();
    }

    @PostMapping
    public String createPecaTeatral(@RequestBody PecaTeatral pecaTeatral) {
        pecaTeatralService.createPecaTeatral(pecaTeatral);
        return "Peça teatral criada";
    }

    @PutMapping
    public String updatePecaTeatral(@RequestBody PecaTeatral pecaTeatral) {
        pecaTeatralService.updatePecaTeatral(pecaTeatral);
        return "Peça teatral atualizada com sucesso";
    }

    @DeleteMapping("{id}")
    public String deletePecaTeatral(@PathVariable("id") int id) {
        pecaTeatralService.deletePecaTeatral(id);
        return "Peça teatral excluida com sucesso";
    }
}
