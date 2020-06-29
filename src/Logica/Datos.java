/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Alejandro
 */
public class Datos {
    private ArrayList<Dueno> duenos;
    private ArrayList<NoDueño> noDuenos;
    private ArrayList<Mascota> mascotas;
    String nombre;
    String usuario;
    int edad;
    int identificacion;
    String direcccion;
    int celular;
    String correo;
    String Contraseña;
    String nombreMascota;
    String especie;
    int edadMascota;
    int tamaño;
    String gustos;
    String malos;
    String cuidados;
    
    
    
    public Datos() {
        duenos = new ArrayList();
        noDuenos = new ArrayList();
    }
    
    public void escribirDatosDueño(String nombre, int identificacion, String direccion, int numCelular, String correo, String nombreUsuario, String contraseña, int edad) throws IOException{
     File archivo = new File("duenos.txt");
     if(!archivo.exists()){
         archivo.createNewFile();
     }
     try{
         FileWriter w = new FileWriter (archivo,true);
         BufferedWriter escribir = new BufferedWriter(w);
         escribir.write(nombre+ ";"+nombreUsuario+";"+contraseña+";"+identificacion+";"+edad+";"+direccion+";"+numCelular+";"+correo);
         escribir.newLine();
         escribir.close();
     }catch(Exception e){
         System.out.println("El archivo no se encuentra");
     }
    }
    
    public void leerDatosDueño() throws FileNotFoundException, IOException{
        BufferedReader lectura = null;
        try{
            lectura = new BufferedReader(new FileReader("duenos.txt"));
            String linea = lectura.readLine();
            while(lectura!=null){
               String[] campos = null;
               campos = linea.split(";");
               
            
             this.nombre = campos[0];
             this.identificacion = Integer.parseInt(campos[3]);
             this.direcccion = campos[5];
             this.celular = Integer.parseInt(campos[6]);
             this.correo = campos[7];
             this.Contraseña = campos[2];
             this.usuario = campos[1];
             this.edad = Integer.parseInt(campos[4]);
             
             duenos.add(new Dueno(nombre,usuario,Contraseña,identificacion,edad,this.direcccion,celular,correo));
 
            linea = lectura.readLine();
             
            }
          
        }catch(Exception e){
            System.out.println("no se pudo encontrar el archivo");
        }finally{
            if(null!=lectura){
            lectura.close();
        }
        }
               
    }
    
    public void escribirDatosNoDueño(String nombre, int identificacion, String direccion, int numCelular, String correo, String nombreUsuario, String contraseña, int edad) throws IOException{
     File archivo = new File("NoDuenos.txt");
     if(!archivo.exists()){
         archivo.createNewFile();
     }
     try{
         FileWriter w = new FileWriter (archivo,true);
         BufferedWriter escribir = new BufferedWriter(w);
         escribir.write(nombre+";"+nombreUsuario+";"+contraseña+";"+identificacion+";"+edad+";"+direccion+";"+numCelular+";"+correo);
         escribir.newLine();
         escribir.close();
     }catch(Exception e){
         System.out.println("El archivo no se encuentra");
     }
        System.out.println(archivo.getAbsolutePath());
    }
    
    public void leerDatosNoDueno() throws FileNotFoundException, IOException{
        BufferedReader lectura = null;
        try{
            lectura = new BufferedReader(new FileReader("NoDuenos.txt"));
            String linea = lectura.readLine();
            while(lectura!=null){
               String[] campos = null;
               campos = linea.split(";");
          
             this.nombre = campos[0];
             this.identificacion = Integer.parseInt(campos[3]);
             this.direcccion = campos[5];
             this.celular = Integer.parseInt(campos[6]);
             this.correo = campos[7];
             this.Contraseña = campos[2];
             this.usuario = campos[1];
             this.edad = Integer.parseInt(campos[4]);
             
             noDuenos.add(new NoDueño(nombre,usuario,Contraseña,identificacion,edad,this.direcccion,celular,correo));
              
            linea = lectura.readLine();
             
            }
          
        }catch(Exception e){
            System.out.println("no se pudo encontrar el archivo");
        }finally{
            if(null!=lectura){
            lectura.close();
        }
        }
               
    }

    public ArrayList<Dueno> getDuenos() {
        return duenos;
    }

    public ArrayList<NoDueño> getNoDuenos() {
        return noDuenos;
    }
    
    
    public void escribirMascota(String nombre, String especie, int edad, int tamaño, String gustos, String malos, String cuidados, int documento) throws IOException{
       File archivo = new File("mascotas.txt");
       if(!archivo.exists()){
           archivo.createNewFile();
       }
       try{
           FileWriter w = new FileWriter(archivo,true);
           BufferedWriter escribir = new BufferedWriter(w);
           escribir.write(nombre+";"+especie+";"+edad+";"+tamaño+";"+gustos+";"+malos+";"+cuidados+";"+documento);
           escribir.newLine();
           escribir.close();
       }catch(Exception e){
           System.out.println("El archivo no se encuentra");
       }
    }
       
       public void leerMascotas() throws FileNotFoundException, IOException{
          BufferedReader lectura = null;
            try{
            lectura = new BufferedReader(new FileReader("mascotas.txt"));
            String linea = lectura.readLine();
            while(lectura!=null){
               String[] campos = null;
               campos = linea.split(";");
               
               this.nombreMascota = campos[0];
               this.especie = campos[1];
               this.edadMascota = Integer.parseInt(campos[2]);
               this.tamaño = Integer.parseInt(campos[3]);
               this.gustos = campos[4];
               this.malos = campos[5];
               this.cuidados = campos[6];
               this.identificacion = Integer.parseInt(campos[7]);
               
               mascotas.add(new Mascota(nombreMascota,especie,edadMascota,tamaño,gustos,malos,cuidados,identificacion));
               linea = lectura.readLine();
            } 
       }catch(Exception e){
                System.out.println("no se pudo hayar mascotas");   
       }finally{
            if(null!=lectura){
            lectura.close();
        }
            
       }
       }
       
      public void agregarMascotaDueño(){
         try{
          for (int i = 0; i < mascotas.size(); i++) {
              for (int j = 0; j < duenos.size(); j++) {
                  if(mascotas.get(i).getNumDueño() == duenos.get(j).getIdentificacion()){
                      duenos.get(j).getMascotas().add(mascotas.get(i));
                  }
              }
          }
      }catch(Exception e){
             System.out.println("no se pudo hayar el archivo");
      }
      }
         
    
      
    public static void main(String[] args) throws IOException {
        Datos dato = new Datos();     
        
    }
    
    
}
