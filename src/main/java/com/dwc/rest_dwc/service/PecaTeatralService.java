package com.dwc.rest_dwc.service;

import com.dwc.rest_dwc.model.PecaTeatral;

import java.util.List;

public interface PecaTeatralService {

    public String createPecaTeatral(PecaTeatral pecaTeatral);
    public String updatePecaTeatral(PecaTeatral pecaTeatral);
    public String deletePecaTeatral(int id);
    public PecaTeatral getPecaTeatral(int id);
    public List<PecaTeatral> getAllPecaTeatral();
}
