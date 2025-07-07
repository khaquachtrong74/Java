package com.qtk.javafxquizapp.dh23it01;

import com.qtk.themes.themes;
import com.qtk.utils.MyAlert;
import com.qtk.utils.MyStage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArrayBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
public class PrimaryController implements Initializable{
    @FXML
    private ComboBox<themes> cbThemes;
         
    public void handleThucThi(ActionEvent event){
        MyAlert.getInstance().ShowMSG("Hello");
    }
    public void handleLamThoiNao(ActionEvent event) throws IOException{
        MyStage.getInstance().showStage("questions.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(themes.values()));
    }
    public void changeThemes(ActionEvent event){
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }
}
