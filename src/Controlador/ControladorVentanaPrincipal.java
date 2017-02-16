/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaAgregarCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kevin bermudez
 */
public class ControladorVentanaPrincipal implements ActionListener{
    
    VentanaAgregarCliente ventanaAgregarCliente;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Agregar Orden")){
            System.out.print("hola");
        }
        if(e.getActionCommand().equals("Pagar Orden")){
            System.out.print("hola");
        }
        if(e.getActionCommand().equals("Administrar Cliente")){
            System.out.print("hola");
        }
        if(e.getActionCommand().equals("Ver Mesa")){
            System.out.print("hola");
        }
    }
    
}
