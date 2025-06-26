package com.dwc.rest_dwc.service.impl;

import com.dwc.rest_dwc.model.DiretorTeatral;
import com.dwc.rest_dwc.repository.DiretorTeatralRepository;
import com.dwc.rest_dwc.service.DiretorTeatralService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretorTeatralServiceImpl implements DiretorTeatralService {

    DiretorTeatralRepository diretorTeatralRepository;

    public DiretorTeatralServiceImpl(DiretorTeatralRepository diretorTeatralRepository) {
        this.diretorTeatralRepository = diretorTeatralRepository;
    }

    @Override
    public String createDiretorTeatral(DiretorTeatral diretorTeatral) {
        diretorTeatralRepository.save(diretorTeatral);
        return "Diretor teatral criado com sucesso.";
    }

    @Override
    public String updateDiretorTeatral(DiretorTeatral diretorTeatral) {
        diretorTeatralRepository.save(diretorTeatral);
        return "Diretor teatral atualizado com sucesso";
    }

    @Override
    public String deleteDiretorTeatral(int id) {
        diretorTeatralRepository.deleteById(id);
        return "Diretor teatral excluido com sucesso";
    }

    @Override
    public DiretorTeatral getDiretorTeatral(int id) {
        return diretorTeatralRepository.findById(id).get();
    }

    @Override
    public List<DiretorTeatral> getAllDiretorTeatral() {
        return diretorTeatralRepository.findAll();
    }
}
