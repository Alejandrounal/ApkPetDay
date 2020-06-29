/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apk;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;
import Logica.*;

/**
 * FXML Controller class
 *
 * @author Darwin Bello
 */
public class RegistroNoDuenoController implements Initializable {

    @FXML
    private TextField campoNombre;
    @FXML
    private TextField campoIdentificacion;
    @FXML
    private TextField campoEdad;
    @FXML
    private TextField campoDireccion;
    @FXML
    private TextField campoNumeroCel;
    @FXML
    private TextField campoCorreoElectronico;
    @FXML
    private TextField campoNombreUsuario;
    @FXML
    private TextField campoContraseña;
    private DatePicker campoFechaExpedicion;
    private DatePicker campoFechaNacimiento;

    private String nombre;
    private int identificacion;
    private String direccion;
    private int numeroCel;
    private String correo;
    private String nombreUsuario;
    private String contrasena;
    private int edad;
    private String identificacionS;
    private String numeroCelS;
    private String edadS;
    private Datos dato = new Datos();
    @FXML
    private AnchorPane ventana;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void botonContinuar(ActionEvent event) throws IOException {
        boolean valor = true;
        try{
    nombre = campoNombre.getText();
    }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingresa un nombre");
            valor = false;
            }
    try{
    identificacion = Integer.parseInt(campoIdentificacion.getText());
    }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Ingresa tu número de identificación \n Debe ser un nuúmero no letras");
         valor = false;
    }
    this.identificacionS = String.valueOf(identificacion);
    
    try{
    edad = Integer.parseInt(campoEdad.getText());
    }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingresa tu edad \n Debe ser un numero");
            valor = false;
            }
    this.edadS = String.valueOf(edad);
    
    try{
    direccion = campoDireccion.getText();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ingresa tu dirección");
        valor = false;
    }
    
    try{
    numeroCel = Integer.parseInt(campoNumeroCel.getText());
    }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Ingresa tu número de celular \n Debe ser un nuúmero no letras");
         valor = false;
    }
    this.numeroCelS = String.valueOf(numeroCel);
    
    
    try{
    correo = campoCorreoElectronico.getText();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ingresa tu correo electronico");
        valor = false;
    }
    
    try{
    nombreUsuario = campoNombreUsuario.getText();
    }catch(Exception e){
       JOptionPane.showMessageDialog(null, "Inresa tu nombre de usuario");
       valor = false;
    }
    
    try{
    contrasena = campoContraseña.getText();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Ingresa tu contraseña");
        valor = false;
    }
    
    if(valor){
         dato.escribirDatosNoDueño(nombre, identificacion, direccion, numeroCel, correo, nombreUsuario, contrasena, edad);
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/Vista/AgradecimientoDueno.fxml"));
         ventana.getChildren().setAll(pane);
    }
    }

    @FXML
    private void botonCancelar(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/Vista/Escena1.fxml"));
         ventana.getChildren().setAll(pane);
    }
    
}
