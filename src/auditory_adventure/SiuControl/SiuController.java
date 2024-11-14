/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auditory_adventure.SiuControl;

import auditory_adventure.SiuModelo.SiuModel;
import auditory_adventure.SiuVista.LookPrincipal;

/**
 *
 * @author PC GAMING
 */
public class SiuController {
    private SiuModel siuModel;
    private LookPrincipal siuLook;

    public SiuController(SiuModel siuModel, LookPrincipal siuLook) {
        System.out.println("iniciando controlador");
        this.siuModel = siuModel;
        this.siuLook = siuLook;
    }

    
    public void iniciar () {
        siuLook.setVisible(true);
    }
}