/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auditory_adventure.SiuPrincipal;

import auditory_adventure.SiuModelo.SiuModel;
import auditory_adventure.SiuControl.SiuController;
import auditory_adventure.SiuVista.SiuView;

/**
 *
 * @author PC GAMING
 */
public class SiuMain {
    public static void main(String[] args) {
        SiuModel siuModel = new SiuModel();
        SiuView siuView = new SiuView();
        SiuController siuController = new SiuController(siuModel, siuView);

        siuController.setSiuData("Hola, MVC con Siu Lee!");
        siuController.updateSiuView();
    }
}