/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qtk.services;
<<<<<<< HEAD
import com.qtk.pojo.Category;
import com.qtk.pojo.Choice;
=======
>>>>>>> 388dd9927440df30ddcdf1e6eb35113e30aabff4
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.qtk.pojo.Question;
import com.qtk.utils.JdbcConnector;
<<<<<<< HEAD
import static com.qtk.utils.config.questionServices;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
=======
>>>>>>> 388dd9927440df30ddcdf1e6eb35113e30aabff4

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
<<<<<<< HEAD
    public List<Question> getQuestions() throws SQLException, Exception {
        // B2: thiết lập kết nối
        Connection conn = JdbcConnector.getInstance().connect();

        // B3: thực thi truy vân
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM question");

        List<Question> questions = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String content = rs.getString("content");
            Question c = new Question.Builder(id, content).build();
            questions.add(c);
        }
        
        return questions;
    }
     public List<Question> getQuestions(String kw) throws SQLException, Exception {
        // B2: thiết lập kết nối
        Connection conn = JdbcConnector.getInstance().connect();

        // B3: thực thi truy vân
        PreparedStatement stm = conn.prepareCall("SELECT * FROM question WHERE content like concat('%',?, '%')");
        stm.setString(1, kw);
        ResultSet rs = stm.executeQuery();  
        List<Question> questions = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String content = rs.getString("content");
            Question c = new Question.Builder(id, content).build();
            questions.add(c);
        }
        
        return questions;
    }
     public List<Question> getQuestions(int num) throws SQLException, Exception {
        // B2: thiết lập kết nối
        Connection conn = JdbcConnector.getInstance().connect();

        // B3: thực thi truy vân
        PreparedStatement stm = conn.prepareCall("SELECT * FROM question WHERE id LIMIT ?");
        stm.setInt(1, num);
        ResultSet rs = stm.executeQuery();  
        List<Question> questions = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String content = rs.getString("content");
            Question c = new Question.Builder(id, content).addAllChoice(getChoicesByQuestionId(id)).build();
            questions.add(c);
        }
        
        return questions;
    }
     private List<Choice> getChoicesByQuestionId(int quesId) throws SQLException{
         Connection conn = JdbcConnector.getInstance().connect();
        // B3: thực thi truy vân
        PreparedStatement stm = conn.prepareCall("SELECT * FROM choice WHERE question_id = ?");
        stm.setInt(1, quesId);
        ResultSet rs = stm.executeQuery();  
        List<Choice> choices = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String content = rs.getString("content");
            boolean iscorrect = rs.getBoolean("is_correct");
            Choice c = new Choice(id, content, iscorrect);
            choices.add(c);
        }
        
        return choices;
     }
}
=======
}
>>>>>>> 388dd9927440df30ddcdf1e6eb35113e30aabff4
