package com.dwc.rest_dwc.service.impl;

import com.dwc.rest_dwc.model.PecaTeatral;
import com.dwc.rest_dwc.repository.PecaTeatralRepository;
import com.dwc.rest_dwc.service.PecaTeatralService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PecaTeatralServiceImpl implements PecaTeatralService {

    PecaTeatralRepository pecaTeatralRepository;

    public PecaTeatralServiceImpl(PecaTeatralRepository pecaTeatralRepository){
        this.pecaTeatralRepository = pecaTeatralRepository;
    }

    @Override
    public String createPecaTeatral(PecaTeatral pecaTeatral) {
        pecaTeatralRepository.save(pecaTeatral);
        return "Peça teatral criada com sucesso.";
    }

    @Override
    public String updatePecaTeatral(PecaTeatral pecaTeatral) {
        pecaTeatralRepository.save(pecaTeatral);
        return "Peça teatral atualizada com sucesso.";
    }

    @Override
    public String deletePecaTeatral(int id) {
        pecaTeatralRepository.deleteById(id);
        return "Peça teatral excluida com sucesso";
    }

    @Override
    public PecaTeatral getPecaTeatral(int id) {
        return pecaTeatralRepository.findById(id).get();
    }

    public List<PecaTeatral> getAllPecaTeatral() {
        return pecaTeatralRepository.findAll();
    }


}
