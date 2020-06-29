/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apk;

import Logica.Datos;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Darwin Bello
 */
public class RegistroMascotasController implements Initializable {

    @FXML
    private TextField campoNombre;
    @FXML
    private TextField campoEdad;
    @FXML
    private TextField campoTamaño;
    @FXML
    private TextArea campoGustos;
    @FXML
    private TextArea campoMalo;
    @FXML
    private TextArea campoCuidado;
    @FXML
    private TextField campoEspecie;
    @FXML
    private TextField campoDocumento;
    @FXML
    private AnchorPane ventana;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private String nombre;
    private int edad;
    private int tamaño;
    private String gustos;
    private String malo;
    private String cuidado;
    private String especie;
    private int documento;
    private String edadS;
    private String tamañoS;
    private String documentoS;
    private Datos dato = new Datos();
    
    
     
    @FXML
    private void botonSigiente(ActionEvent event) throws IOException {
        boolean valor = true;
        try{
            nombre = campoNombre.getText();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingresa un nombre");
            valor = false;
        }
        try{
        edad = Integer.parseInt(campoEdad.getText());
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Ingresa la edad de tu mascota \n Debe ser un nuúmero no letras");
         valor = false;
        }
        this.edadS = String.valueOf(edad);
        
        try{
        tamaño = Integer.parseInt(campoTamaño.getText());
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Ingresa el tamaño de tu mascota \n Debe ser un nuúmero no letras");
         valor = false;
        }
        this.tamañoS = String.valueOf(tamaño);
        
        try{
            especie = campoEspecie.getText();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingresa la especie");
            valor = false;
        }
        
        try{
            gustos = campoGustos.getText();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingresa los gustos de tu mascota");
            valor = false;
        }
        
        try{
            cuidado = campoCuidado.getText();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingresa los cuidados especiales de tu mascota");
            valor = false;
        }
        
        try{
           malo = campoMalo.getText();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingresa los malos habitos  de tu mascota");
            valor = false;
        }
        
        try{
        documento = Integer.parseInt(campoDocumento.getText());
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Ingresa tu documento de identidad \n Debe ser un nuúmero no letras");
         valor = false;
        }
        this.documentoS = String.valueOf(documento);
        
        if(valor){
        dato.escribirMascota(nombre, especie, edad, tamaño, gustos, malo, cuidado, documento);
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/Vista/PrincipalDueno.fxml"));
         ventana.getChildren().setAll(pane);
        }
    }

    @FXML
    private void botonCancelar(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Vista/PrincipalDueno.fxml"));
        ventana.getChildren().setAll(pane);
    }
    
}
