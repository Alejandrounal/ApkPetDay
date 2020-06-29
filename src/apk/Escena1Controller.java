/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apk;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import Logica.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Escena1Controller implements Initializable { 

    @FXML
    private TextField campoUsuario;
    @FXML
    private PasswordField campoContrasena;
    public Escena1Controller() throws IOException {
        dato.leerDatosDueño();
        dato.leerDatosNoDueno();
        
    }
     ValidarRegistro validar = new ValidarRegistro();
     Datos dato = new Datos();
    private Label label;
    @FXML
    private Hyperlink hipervinculoResgistro;
    @FXML
    private AnchorPane Ventana;
    
    private String usuario;
    private String contraseña;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cambiarRegistro(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Vista/Terminos.fxml"));
        Ventana.getChildren().setAll(pane);
    }

    @FXML
    private void ingresarDueno(ActionEvent event) throws IOException {
        try{
        usuario = campoUsuario.getText();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ingrese usuario valido");
        }
        try{
         contraseña = campoContrasena.getText();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ingrese contraseña");
        }
        
        if(validar.validarDueno(usuario, contraseña)){
            
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/Vista/PrincipalDueno.fxml"));
            Ventana.getChildren().setAll(pane);
        }
        else{
            JOptionPane.showMessageDialog(null, "El nombre o la contraseña son incorrectos");
        }
    }

    @FXML
    private void ingresarCuidador(ActionEvent event) throws IOException {
         try{
        usuario = campoUsuario.getText();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ingrese usuario valido");
        }
        try{
         contraseña = campoContrasena.getText();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ingrese contraseña");
        }
        
        if(validar.validarNoDueno(usuario, contraseña)){
             AnchorPane pane = FXMLLoader.load(getClass().getResource("/Vista/PrincipalCuidador.fxml"));
            Ventana.getChildren().setAll(pane);
        }
        else{
            JOptionPane.showMessageDialog(null, "El nombre o la contraseña son incorrectos");
        }
    }
    
}
