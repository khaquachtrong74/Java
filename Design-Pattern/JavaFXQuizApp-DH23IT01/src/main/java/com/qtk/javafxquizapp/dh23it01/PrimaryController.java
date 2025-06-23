package com.qtk.javafxquizapp.dh23it01;

import com.qtk.utils.MyAlert;
import com.qtk.utils.MyStage;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class PrimaryController {
    
    public void handleThucThi(ActionEvent event){
        MyAlert.getInstance().ShowMSG("Hello");
    }
    public void handleLamThoiNao(ActionEvent event) throws IOException{
        MyStage.getInstance().showStage("questions.fxml");
    }
}
