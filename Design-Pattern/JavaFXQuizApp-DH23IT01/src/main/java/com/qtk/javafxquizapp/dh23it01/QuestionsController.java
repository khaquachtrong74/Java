/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.qtk.javafxquizapp.dh23it01;

import com.qtk.pojo.Category;
import com.qtk.services.CategoryService;
import com.qtk.services.LevelService;
import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import com.qtk.pojo.Level;
import com.qtk.pojo.Question;
import com.qtk.services.QuestionServices;
import com.qtk.utils.config;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML private ComboBox<Category> cbCates;
    @FXML private ComboBox<Level> cbLevels;
    @FXML private VBox vboxChoices = new VBox();
    @FXML private TableView<Question> tableViewQuestions;
    @FXML private TextField textFiled;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
            this.cbCates.setItems(FXCollections.observableArrayList(config.catesServices.getCates()));
            this.cbLevels.setItems(FXCollections.observableArrayList(config.levelServices.getLevels()));
            this.loadTable();
            this.tableViewQuestions.setItems(FXCollections.observableArrayList(config.questionServices.getQuestions()));
            this.textFiled.textProperty().addListener(e -> {
                try {
                    this.tableViewQuestions.setItems(FXCollections.observableArrayList(config.questionServices.getQuestions(this.textFiled.getText())));
                } catch (Exception ex) {
                    Logger.getLogger(QuestionsController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            });
            
        }catch (Exception e){
            System.err.println(e);
        }
    }    
    public void handleAddChoice(ActionEvent event){
        HBox h = new HBox();
        h.getStyleClass().add("style");
        RadioButton rd = new RadioButton(); 
        TextField txtf = new TextField();
        txtf.setPromptText("Nội dung nhập lựa chọn");
        txtf.getStyleClass().add("Input");
        h.getChildren().addAll(rd, txtf);
        this.vboxChoices.getChildren().add(h);
    }
    private void loadTable(){
        TableColumn colId = new TableColumn("Id");
        colId.setCellValueFactory(new PropertyValueFactory("id"));
        colId.setPrefWidth(100);
        TableColumn colContent = new TableColumn("Nội dung câu hỏi");
        colContent.setCellValueFactory(new PropertyValueFactory("content"));
        colContent.setPrefWidth(300);
        this.tableViewQuestions.getColumns().addAll(colId, colContent);
    }
}
