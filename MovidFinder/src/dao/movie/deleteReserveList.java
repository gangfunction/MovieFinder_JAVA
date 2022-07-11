package dao.movie;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class deleteReserveList{
    public deleteReserveList() {
        try {
            Connection conn = dto.makeConnection();
            PreparedStatement stmt;
            String sql = "truncate reservation";
            stmt = conn.prepareStatement(sql);
            stmt.execute(sql);
            String sql2 = "select * from reservation";
            ResultSet rs = stmt.executeQuery(sql2);
            rs.next();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
