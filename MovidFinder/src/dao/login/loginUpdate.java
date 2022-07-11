package dao.login;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static dto.memberDTO.id;

public class loginUpdate{
    protected loginUpdate() throws SQLException, ClassNotFoundException {
        String sql = "update member set isin=? where id=?";
        Connection conn = dto.makeConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setBoolean(1, true);
        stmt.setString(2, id);
        stmt.executeUpdate();
    }


}
