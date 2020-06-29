/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class ValidarRegistro {
   
   private Datos dato = new Datos();
   
    public ValidarRegistro() throws IOException {
        dato.leerDatosDueño();
        dato.leerDatosNoDueno();
    }
    
    public boolean validarDueno(String usuario, String contraseña){
        boolean valor = false;
        for (int i = 0; i < dato.getDuenos().size() ; i++) {
            if(dato.getDuenos().get(i).getUsuario().equals(usuario) && dato.getDuenos().get(i).getContrasena().equals(contraseña)){
                valor =  true;
            }
            else{
                valor = false;
            }
        }return valor;
    }
    
    public boolean validarNoDueno(String usuario, String contraseña){
        boolean valor = false;
        for (int i = 0; i < dato.getNoDuenos().size() ; i++) {
            if(dato.getNoDuenos().get(i).getUsuario().equals(usuario) && dato.getNoDuenos().get(i).getContrasena().equals(contraseña)){
                valor =  true;
            }
            else{
                valor = false;
            }
        }return valor;
    }
    
    public static void main(String[] args) throws IOException {
        ValidarRegistro r = new ValidarRegistro();
    }
}
