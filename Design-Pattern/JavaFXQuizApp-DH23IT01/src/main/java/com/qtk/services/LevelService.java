/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qtk.services;

import com.qtk.pojo.Level;
import com.qtk.utils.JdbcConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class LevelService {
    
    public List<Level> getLevels() throws SQLException {
        // B2: thiết lập kết nối
        Connection conn = JdbcConnector.getInstance().connect();

        // B3: thực thi truy vân
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM level");

        List<Level> cates = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String note = rs.getString("note");
            Level c = new Level(id, name, note);
            cates.add(c);
        }
        
        return cates;
    }
}
