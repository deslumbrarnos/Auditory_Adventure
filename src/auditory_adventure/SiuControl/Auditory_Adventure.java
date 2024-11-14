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
public class Auditory_Adventure {
    public static void main(String[] args) {
        SiuModel siuModel = new SiuModel();
        LookPrincipal siuView = new LookPrincipal();
        SiuController siuController = new SiuController(siuModel, siuView);
        siuController.iniciar();
    }
    
}