package com.dwc.rest_dwc.service;

import com.dwc.rest_dwc.model.DiretorTeatral;
import java.util.List;

public interface DiretorTeatralService {
    public String createDiretorTeatral(DiretorTeatral diretorTeatral);
    public String updateDiretorTeatral(DiretorTeatral diretorTeatral);
    public String deleteDiretorTeatral(int id);
    public DiretorTeatral getDiretorTeatral(int id);
    public List<DiretorTeatral> getAllDiretorTeatral();
}
