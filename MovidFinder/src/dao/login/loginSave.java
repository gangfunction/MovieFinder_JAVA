package dao.login;

import dto.dto;
import dto.memberDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginSave {
    protected loginSave() throws SQLException, ClassNotFoundException {
        String sql = "select id, isin from member where isin=1";
        Connection conn = dto.makeConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            if (rs.getString("id").equals(memberDTO.getId())) {
                memberDTO.setId(rs.getString("id"));
                memberDTO.setIsin(rs.getBoolean("isin"));
            }
        }
    }
}
