/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qtk.services;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.qtk.pojo.Question;
import com.qtk.utils.JdbcConnector;

/**
 *
 * @author khat
 */
public class QuestionServices {
    public void addQuestion(Question q) throws SQLException{
        Connection cnn = JdbcConnector.getInstance().connect();
        
        cnn.setAutoCommit(false);
        String sql = "INSERT INTO question(content, hint, image, category_id, level_id) VALUES(?, ?, ?, ?, ?)";
        PreparedStatement stm = cnn.prepareCall(sql);
        stm.setString(1, q.getContent());
        stm.setString(2, q.getHint());
        stm.setString(3, q.getImage());
        stm.setInt(4, q.getCategory().getId());
        stm.setInt(5, q.getLevel().getId());
        
        if(stm.executeUpdate() > 0){
            int quesId = -1;
            ResultSet r = stm.getGeneratedKeys();
            if(r.next())
                quesId = r.getInt(1);
            sql = "INSERT INTO choice(content, is_correct, question_id) VALUES(?, ?, ?)";
            stm = cnn.prepareCall(sql);
            for (var c : q.getChoices()){
                stm.setString(1, c.getContent());
                stm.setBoolean(2, c.isIs_correct());
                stm.setInt(3, c.getId());
                stm.executeUpdate();
            }
            cnn.commit();
        }else{
            cnn.rollback();
        }
    }
}
