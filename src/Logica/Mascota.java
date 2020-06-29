/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Alejandro
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private int tamaño;
    private String gustos;
    private String malos;
    private String cuidados;
    private int numDueño;

    public Mascota(String nombre, String especie, int edad, int tamaño, String gustos, String malos, String cuidados, int numDueño) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.tamaño = tamaño;
        this.gustos = gustos;
        this.malos = malos;
        this.cuidados = cuidados;
        this.numDueño = numDueño;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getGustos() {
        return gustos;
    }

    public String getMalos() {
        return malos;
    }

    public String getCuidados() {
        return cuidados;
    }

    public int getNumDueño() {
        return numDueño;
    }

   
    
}
