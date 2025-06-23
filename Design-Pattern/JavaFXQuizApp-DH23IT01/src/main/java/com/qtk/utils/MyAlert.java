/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qtk.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlert {
    private static MyAlert instance;
    private final Alert alt;
    private MyAlert(){
        alt  = new Alert(Alert.AlertType.INFORMATION);
        alt.setTitle("HELLO WORLD!");
        alt.setHeaderText("Common Baby!");
        
    }
    public static MyAlert getInstance(){
        if(instance == null)
            instance = new MyAlert();
        return instance;
    }
    public void ShowMSG(String content){
        alt.setContentText(content);
        alt.showAndWait();
    }
}
