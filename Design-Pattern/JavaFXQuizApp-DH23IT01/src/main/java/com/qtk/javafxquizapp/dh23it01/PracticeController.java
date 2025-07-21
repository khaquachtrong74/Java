/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.qtk.javafxquizapp.dh23it01;

import com.qtk.pojo.Question;
import com.qtk.utils.config;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class PracticeController implements Initializable {
    @FXML private TextField textNum;
    @FXML private Text textQuestion;
    @FXML private Text textDapAn;
    @FXML private Button btnKiemTra;
    @FXML private VBox vbox;
    private int position;
    private List<Question> questions;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void HandleStart() throws Exception{
        this.position = 0;
        this.questions = config.questionServices.getQuestions(Integer.parseInt(this.textNum.getText()));
        this.loadQuestions();
    }
    private void loadQuestions() throws Exception{
        Question q = this.questions.get(this.position);
        this.textQuestion.setText(q.getContent());
        ToggleGroup g = new ToggleGroup();
        this.vbox.getChildren().clear();
        for(var qs : q.getChoices()){
            RadioButton r = new RadioButton(qs.getContent());
            r.setToggleGroup(g);
            vbox.getChildren().add(r);
        }
    }
    public void HandleNext() throws Exception{
        if(this.position < this.questions.size()-1){
            this.position++;
        }
        loadQuestions();
    }
    public void HandleCheckDapAn(){
       Question q = this.questions.get(this.position);
       for(int i = 0; i < q.getChoices().size(); i++){
           if(q.getChoices().get(i).isIs_correct()){
               RadioButton r = (RadioButton) this.vbox.getChildren().get(i);
               if(r.isSelected()){
                   this.textDapAn.setText("DUNG ROI!");
                   this.textDapAn.setStyle("-fx-fill: green");
               }
               else{
                   this.textDapAn.setText("SAI ROI!");
                   this.textDapAn.setStyle("-fx-fill: red");
               }
           }
       }
    }
   
}
