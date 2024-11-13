/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auditory_adventure.SiuControl;

import auditory_adventure.SiuModelo.SiuModel;
import auditory_adventure.SiuVista.SiuView;


/**
 *
 * @author PC GAMING
 */
public class SiuController {
    private SiuModel siuModel;
    private SiuView siuView;

    public SiuController(SiuModel siuModel, SiuView siuView) {
        this.siuModel = siuModel;
        this.siuView = siuView;
    }

    public void setSiuData(String siuData) {
        siuModel.setSiuData(siuData);
    }

    public void updateSiuView() {
        siuView.printSiuData(siuModel.getSiuData());
    }
}