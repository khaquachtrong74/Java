/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qtk.utils;

import com.qtk.javafxquizapp.dh23it01.App;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStage {
    private static MyStage instance;
    private static Scene sence;
    private final Stage stage;
    
    private MyStage(){
        stage = new Stage();
        stage.setTitle("Quizz App");
    }
    public static MyStage getInstance(){
        if(instance == null)
            instance = new MyStage();
        return instance;
    }
    public void showStage(String fxml) throws IOException{
        if(sence == null){
            sence = new Scene(new FXMLLoader(App.class.getResource(fxml)).load());
        }else{
            sence.setRoot(new FXMLLoader(App.class.getResource(fxml)).load());
        }
        this.stage.setScene(sence);
        this.stage.show();
    }
}
