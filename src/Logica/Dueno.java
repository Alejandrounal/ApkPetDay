/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class Dueno extends Persona{
    private ArrayList<Mascota> mascotas;

    public Dueno(String nombres, String usuario, String contrasena, int identificacion, int edad, String direccionResidencia, int numCelular, String correo) {
        super(nombres, usuario, contrasena, identificacion, edad, direccionResidencia, numCelular, correo);
       
    }

   
   

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
}
