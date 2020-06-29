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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import Logica.*;
import java.util.ArrayList;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Alejandro
 */
public class PrincipalDuenoController implements Initializable {
    private ArrayList<Mascota> mascotas = new ArrayList();
    private Datos dato = new Datos();
    private ArrayList<Dueno> duenos = new ArrayList();
    @FXML
    private Button botonSalir;
    
    public PrincipalDuenoController() throws IOException {
        dato.leerMascotas();
        dato.agregarMascotaDueño();
        
    }
    
    @FXML
    private GridPane listaGrid;
    @FXML
    private AnchorPane ventana;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
    @FXML
    private void agregarMascota(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Vista/RegistroMascotas.fxml"));
        ventana.getChildren().setAll(pane);
    }

    @FXML
    private void AgregarSolicitud(ActionEvent event) {
    }

    @FXML
    private void VerMascotas(ActionEvent event) {
    }

    @FXML
    private void salir(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/Vista/Escena1.fxml"));
        ventana.getChildren().setAll(pane);
    }
    
}
