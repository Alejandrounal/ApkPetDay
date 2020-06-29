/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class Persona {
    private String nombres;
    private String usuario;
    private String contrasena;
    private int identificacion;
    private int edad;
    private String direccionResidencia;
    private int numCelular;
    private String correo;

    public Persona(String nombres, String usuario, String contrasena, int identificacion, int edad, String direccionResidencia, int numCelular, String correo) {
        this.nombres = nombres;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.identificacion = identificacion;
        this.edad = edad;
        
        this.direccionResidencia = direccionResidencia;
        this.numCelular = numCelular;
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    
    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
