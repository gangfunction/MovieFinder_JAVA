package service;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class movieDeleteList{
    public movieDeleteList() {
        try {
            PreparedStatement stmt;
            Connection conn = dto.makeConnection();
            String sql = "truncate movie";
            stmt = conn.prepareStatement(sql);
            stmt.execute();
            String sql2 = "select * from movie";
            ResultSet rs = stmt.executeQuery(sql2);
            if (!rs.next()) {
                System.out.println();
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
