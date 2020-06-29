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

/**
 * FXML Controller class
 *
 * @author Alejandro
 */
public class VistaBienvenidaController implements Initializable {

    @FXML
    private AnchorPane pane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    

    @FXML
    private void regsitroMascota(ActionEvent event) throws IOException {
        AnchorPane vista = FXMLLoader.load(getClass().getResource("/Vista/RegistroDueno.fxml"));
        pane.getChildren().setAll(vista);
    }

    @FXML
    private void registroNoMascota(ActionEvent event) throws IOException {
        AnchorPane vista = FXMLLoader.load(getClass().getResource("/Vista/RegistroNoDueno.fxml"));
        pane.getChildren().setAll(vista);
    }
    
}
